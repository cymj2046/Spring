package db_sample2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
			ApplicationContext ctx = new GenericXmlApplicationContext("db2.xml");
			
			SelectTest test = ctx.getBean("sqltest", SelectTest.class);
			
			test.select1(); //총 갯수
			test.select2(6); //6명인 그룹 이름을 알아보기
			test.select3("그룹"); //그룹의 멤버 수 알아보기
			
			//queryForlist
			test.select4(6);
			
			//queryForMap
			test.select5("그룹");
			
			//query
			List<Singer> singerlist = test.select6(6);
			for(int i=0; i<singerlist.size(); i++) {
				Singer singer = singerlist.get(i);
				System.out.println("그룹이름: "+ singer.getName() +" 인원수: "+ singer.getMember());
			}
			
			List<Singer> singerlist1 = test.select7();
			for(int i=0; i<singerlist1.size(); i++) {
				Singer singer = singerlist1.get(i);
				System.out.println("그룹이름: "+ singer.getName() +" 인원수: "+ singer.getMember());
			}
			
	}

}
