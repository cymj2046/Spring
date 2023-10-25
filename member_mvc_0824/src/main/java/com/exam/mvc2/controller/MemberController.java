package com.exam.mvc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.mvc2.service.MemberService;
import com.exam.mvc2.vo.MemberVo;

@Controller
public class MemberController {
	//서비스에 주입
	@Autowired
	private MemberService memberService;
	
	//입력 폼에 controller
	@RequestMapping("/signUp")
	public String signUp() {
		return "member/sign_up";  //member/sign_up.jsp
	}
	
	//삽입 관련 controller
	@RequestMapping("/signUpConfirm")
	public String signUpConfirm(MemberVo memberVo) {
		memberService.signUpConfirm(memberVo);
		return "member/sign_up_ok";
	}
	
	//로그인 관련 controller
	@RequestMapping("/signIn")
	public String signIn() {
		return "member/sign_in";
	}
	
	@RequestMapping("/signInConfirm")
	public String signInConfirm(MemberVo memberVo) {
		MemberVo signInedMember = memberService.signInConfirm(memberVo);
		if(signInedMember !=null) {
			return "member/sign_in_ok";  //로그인 성공
		}else {
			return "member/sign_in_ng";  //실패
		}
	}

}
