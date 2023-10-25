package com.exam.mvc.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@RequestMapping("/input")
	public String input() {
		return "input"; //input.jsp ==> 입력화면
	}
	
//	@RequestMapping("/studentView")
//	public String studentView(@ModelAttribute("studentInfo") StudentVo studentVo) {
//		return "studentView";
//	}
	
	//HttpServletRequest를 이용하는 경우
//	@RequestMapping("/studentView")
//	public String studentView(HttpServletRequest httpServletRequest, Model model) {
//		String name = httpServletRequest.getParameter("name");
//		String age = httpServletRequest.getParameter("age");
//		String classNum = httpServletRequest.getParameter("classNum");
//		String gradeNum = httpServletRequest.getParameter("gradeNum");
//		
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		model.addAttribute("classNum", classNum);
//		model.addAttribute("gradeNum", gradeNum);
//		
//		return "studentView1";
//	}
	//@RequestParam
//	@RequestMapping("/studentView1")
//	public String studentView(@RequestParam("name") String name,
//			@RequestParam("age") String age,
//			@RequestParam("classNum") String classNum,
//			@RequestParam("gradeNum") String gradeNum, Model model) {
//		
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		model.addAttribute("classNum", classNum);
//		model.addAttribute("gradeNum", gradeNum);
//		
//		return "studentView1";
//	}
	
	//@RequestParam => Vo객체로 넣기
	@RequestMapping("/studentView2")
	public String studentView(@RequestParam("name") String name,
			@RequestParam("age") String age,
			@RequestParam("classNum") String classNum,
			@RequestParam("gradeNum") String gradeNum, Model model) {
		
		StudentVo student = new StudentVo();
		student.setName(name);
		student.setAge(age);
		student.setClassNum(classNum);
		student.setGradeNum(gradeNum);
		
		model.addAttribute("studentVo", student);
		
		return "studentView2";
	}
	
	//매개변수에 클래스 객체를 넣음
//	public String studentView(StudentVo studentVo) {
//		return "studentView2";
//	}
}
