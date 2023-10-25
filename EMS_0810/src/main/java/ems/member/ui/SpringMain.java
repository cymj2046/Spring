package ems.member.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ems.member.service.PrintStudentInformationService;
import ems.member.service.StudentDeleteService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.utils.InitSampleData;
import ems.member.vo.Student;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("ems1.xml");
		
		//초기값 데이터를 설정
		InitSampleData init = 
				ctx.getBean("initSampleData", InitSampleData.class);
		
		String[] sNums = init.getsNums();
		String[] sIds = init.getsIds();
		String[] sPws = init.getsPws();
		String[] sNames = init.getsNames();
		int[] sAges =init.getsAges();
		char[] sGenders = init.getsGenders();
		String[] sMajors = init.getsMajors();
		
		//등록
		StudentRegisterService reg = 
				ctx.getBean("studentRegisterService", 
						StudentRegisterService.class);
		for(int i=0; i<sNums.length; i++) {
			reg.register(new Student(sNums[i], sIds[i], sPws[i],
					sNames[i], sAges[i], sGenders[i], sMajors[i]));
		}
		
		reg = ctx.getBean("studentRegisterService", 
				StudentRegisterService.class);
		reg.register(new Student("2023004","pig", "123","김강서",23,'F',"미술"));
		
		//출력 
		PrintStudentInformationService prt = 
				ctx.getBean("printInfo",
						PrintStudentInformationService.class);
		prt.printStudentInfo();
		
		//수정
		StudentModifyService modify = 
			ctx.getBean("studentModifyService",StudentModifyService.class); 
		modify.modify
		(new Student("2023001","pig11", "123","홍강서",23,'F',"미술"));
		prt.printStudentInfo();
		
		//삭제
		StudentDeleteService delete1 = ctx.getBean("studentDeleteService", StudentDeleteService.class);
		delete1.delete("2023002");
		prt.printStudentInfo();
	}

	

}
