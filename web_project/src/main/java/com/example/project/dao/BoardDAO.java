package com.example.project.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.project.vo.BoardVO;


public interface BoardDAO {
	
	//삽입
	public void create(BoardVO vo) throws Exception;
	
	//상세보기
	public BoardVO read(int bno) throws Exception;

	//수정
	public void update(BoardVO vo) throws Exception;

	//삭제
	public void delete(int bno) throws Exception;

	//전체목록
	//public List<BoardVO> listAll() throws Exception;
	
	//조회수
	public void increaseViewcnt	(int bno)throws Exception;
	
	public List<BoardVO> listAll(String searchOption, String keyword) throws Exception;
	
	public int countArticle(String searchOption, String keyword) throws Exception;
}
