package mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("mybatis.xml");
		
		ConnectionTest test = ctx.getBean("test", ConnectionTest.class);
		test.connect();
		
		//test.insert1(new Singer("그룹이름6", 11));
		//test.insert1(new Singer("그룹이름5", 7));
		
		//test.delete1("그룹이름6");
		
		//test.update1(new Singer("그룹이름6", 5));
		
		//test.select1();
		//test.select2(5); //1개의 결과가 나오게끔 하고
		
		//test.select3("그룹이름6"); //여러 개의 결과가 나옴
		
		//select * from singer_group 동작하게끔 완성
		test.select4();

	}

}
