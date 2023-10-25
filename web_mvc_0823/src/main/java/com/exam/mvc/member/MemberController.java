package com.exam.mvc.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
		@RequestMapping("/signUp")
		public String signUp() {
			return "sign_up";  //views -> sign_up.jsp
		}
		
		@RequestMapping("/a/signIn")
		public String signIn() {
			return "sign_in";
		}
		
		@RequestMapping("/content")
		public String content(Model model) {
			model.addAttribute("id", "honggildong"); //id=변수명, 값
			model.addAttribute("pass", 1234);
			return "content";  //views -> conent.jsp
		}
		
		@RequestMapping("/reply")
		public ModelAndView reply() {
			ModelAndView mv = new ModelAndView();
			mv.addObject("age", 20);
			mv.addObject("weight", 50);
			mv.setViewName("reply"); //views -> reply.jsp
			return mv;
		}
}
