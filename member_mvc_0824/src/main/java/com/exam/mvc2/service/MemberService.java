package com.exam.mvc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.mvc2.dao.MemberDao;
import com.exam.mvc2.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	//주입공간 => 생성자주입 or setter메서드 => @AutoWired
	
	//삽입
	public int signUpConfirm(MemberVo memberVo) {
		memberDao.insertMember(memberVo);
		return 0;
	}
	
	//조회
	public MemberVo signInConfirm(MemberVo memberVo) {
		MemberVo signInedMember = memberDao.selectMember(memberVo);
		return signInedMember;
	}

}
