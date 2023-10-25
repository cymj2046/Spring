package db_sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
			ApplicationContext ctx = new GenericXmlApplicationContext("db1.xml");
			
			SqlTest1 test = ctx.getBean("sqltest", SqlTest1.class);
			
			//test.insert1(new Singer("그룹이름1", 5));
//			test.insert1(new Singer("그룹이름1", 6));
//			test.insert1(new Singer("그룹이름1", 7));
//			test.insert1(new Singer("그룹이름1", 8));
			
			//test.update1("그룹이름1");
			test.update2(6);

	}

}
