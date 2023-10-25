package com.example.project.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.project.vo.BoardVO;

	
public interface BoardService {

	//삽입
	public void create(BoardVO vo) throws Exception;

	//조회
	public BoardVO read(int bno) throws Exception;

	//수정
	public void update(BoardVO vo) throws Exception;

	//삭제
	public void delete(int bno) throws Exception;

	//전체목록
	//public List<BoardVO> listAll() throws Exception;
	
	//게시글 목록보기 => 검색기능
	public List<BoardVO> listAll(String searchOption, String keyword) throws Exception;

	//조회수 ==> session 추가
	public void increaseViewcnt	(int bno, HttpSession session) 	throws Exception;

	//글 갯수 체크
	public int countArticle(String searchOption, String keyword) throws Exception;
	
}
