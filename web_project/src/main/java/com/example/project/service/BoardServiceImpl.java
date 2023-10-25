package com.example.project.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.example.project.dao.BoardDAO;
import com.example.project.vo.BoardVO;

@Service 
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO boardDao;
	
	@Override
	public void create(BoardVO vo) throws Exception {
	    boardDao.create(vo);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		return boardDao.read(bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		boardDao.update(vo);
	}

	@Override
	public void delete(int bno) throws Exception {
		boardDao.delete(bno);

	}

//	@Override
//	public List<BoardVO> listAll() throws Exception {
//		return boardDao.listAll();
//	}

	@Override
	public List<BoardVO> listAll(String searchOption, String keyword) throws Exception {
		return boardDao.listAll(searchOption, keyword);
	}
	
	@Override
	public void increaseViewcnt(int bno, HttpSession session) throws Exception {
		 //세션 정보 체크할 변수
	  long update_time = 0;
	  
	  if(session.getAttribute("update_time_" + bno) !=null) {
		  //update_time=0_1
		  update_time= (Long) session.getAttribute("update_time_"+ bno);
	  }
	  
	  long current_time = System.currentTimeMillis();
	  
	  if(current_time-update_time > 5*1000) { //1초 1000밀리초 => 5초
		  boardDao.increaseViewcnt(bno);
		  session.setAttribute("update_time_"+bno, current_time);
	  }
	 
	}
	
	@Override
	public int countArticle(String searchOption, String keyword) throws Exception {
		return 0;
	}
}
