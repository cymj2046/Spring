package com.example.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.service.BoardService;
import com.example.project.vo.BoardVO;

@Controller
public class BoardController {

	@Inject
	private BoardService boardService;

	// (1) 게시글 작성하기
	@RequestMapping("/board/write")
	public String write() {
		return "board/write"; // write.jsp 작성 폼보여줌
	}

	@RequestMapping("/board/insert")
	public String insert(@ModelAttribute BoardVO vo) throws Exception {
		boardService.create(vo);
		return "redirect:list";
	}

	// (2) 전체 목록보기
//	@RequestMapping("/board/list")
//	public ModelAndView list() throws Exception {
//		List<BoardVO> list = boardService.listAll();
//		ModelAndView mav = new ModelAndView();
//		
//		mav.addObject("list", list);
//		mav.setViewName("/board/list");
//		return mav;
//	}
	
    //(2_1) 목록보기 ==>검색기능
	@RequestMapping("board/list")
	public ModelAndView list(@RequestParam(defaultValue="title") String searchOption,
			@RequestParam(defaultValue="") String keyword) throws Exception{
		
		List<BoardVO> list = boardService.listAll(searchOption, keyword);
		int count = boardService.countArticle(searchOption, keyword);
		ModelAndView mav = new ModelAndView();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("list", list); 
			map.put("count", count); 
			map.put("searchOption", searchOption); 
			map.put("keyword", keyword); 
			mav.addObject("map", map); 
			mav.setViewName("board/list"); 
			return mav;
	}
	
	// (3) 글 상세보기
	@RequestMapping("/board/view")
	public ModelAndView view(int bno, HttpSession session) throws Exception {
		boardService.increaseViewcnt(bno, session);
		ModelAndView mav = new ModelAndView();

		mav.addObject("dto", boardService.read(bno));
		mav.setViewName("/board/view");
		return mav;
	}

	// (4) 글 수정하기
	@RequestMapping("/board/update")
	public String update(@ModelAttribute BoardVO vo) throws Exception {
		boardService.update(vo);
		return "redirect:list";
	}

	// (5) 글삭제하기
	@RequestMapping("board/delete")
	public String delete(int bno) throws Exception {
		boardService.delete(bno);
		return "redirect:list";
	}
}
