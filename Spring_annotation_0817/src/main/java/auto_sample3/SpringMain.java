package auto_sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("auto1.xml");
		
		TestA bean = ctx.getBean("a", TestA.class);
		bean.show();

	}

}
