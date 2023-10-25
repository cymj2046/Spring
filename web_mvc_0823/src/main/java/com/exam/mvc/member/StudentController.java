package com.exam.mvc.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/input")
	public String input() {
		return "input"; //input.jsp ==> 입력화면
	}
	
	@RequestMapping("/studentView")
	public String studentView(@ModelAttribute("studentInfo") StudentVo studentVo) {
		return "studentView";
	}

}
