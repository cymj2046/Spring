package com.example.project.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.example.project.dao.LoginDAO;
import com.example.project.vo.MemberVO;

@Service //빈등록
public class LoginServiceImpl implements LoginService {
	
	//주입
	@Inject
	private LoginDAO loginDao;

	@Override
	public boolean loginCheck(MemberVO vo, HttpSession session) {
		boolean result = loginDao.loginCheck(vo);
		if(result){
			MemberVO vo2 = viewMember(vo); //id, pw 같은 모든 값을 vo2에 설정
			session.setAttribute("userId", vo2.getUserId());
			session.setAttribute("userName", vo2.getUserName());
		}
		return result;
	}

	@Override
	public MemberVO viewMember(MemberVO vo) {
		return loginDao.viewMember(vo);
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate(); //세션 종료
	}
}
