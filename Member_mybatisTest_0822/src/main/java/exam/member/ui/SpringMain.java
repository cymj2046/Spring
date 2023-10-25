package exam.member.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("member3.xml");
		MemberUI memberUI = ctx.getBean("memberUI", MemberUI.class);
		memberUI.showMenu();

	}

}
