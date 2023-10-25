package com.example.project.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.service.LoginService;
import com.example.project.vo.MemberVO;


@Controller
public class LoginController {
	
	@Inject
	private LoginService loginService;
	
	//로그인 폼
	@RequestMapping("/login/login")
	public String login() {
		return "/login/login";
	}
	
	//로그인 처리
	@RequestMapping("/login/loginCheck")
	public ModelAndView loginCheck(@ModelAttribute MemberVO vo, HttpSession session) {
		
		boolean result = loginService.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		if(result==true) {
			mav.addObject("msg", "성공");
			mav.setViewName("/login/main");
		}else {
			mav.addObject("msg", "실패");
			mav.setViewName("/login/login");
		}
		return mav;
	}
	
	//로그아웃
	@RequestMapping("/login/logout")
	public ModelAndView logout(HttpSession session) {
		loginService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "logout");
		mav.setViewName("/login/login");
		return mav;
	}

}
