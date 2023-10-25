package ems.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ems.member.vo.Student;

public class PrintStudentInformationService {
	//전체 조회해서 가져온 정보 출력 하기 
	private StudentAllSelectService allSelectSevice;
	
	//매개변수 생성자 
	public PrintStudentInformationService(StudentAllSelectService allSelectSevice) {
		super();
		this.allSelectSevice = allSelectSevice;
	}
	
	//출력 정보
	public void printStudentInfo() {
		Map<String, Student> allStudent 
		   = allSelectSevice.allSelect();
		Set<String> keys = allStudent.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println(" ***학생 정보 리스트 ***");
		System.out.println("----------------------");
		while(iterator.hasNext()) {
			String key = iterator.next();
			Student student = allStudent.get(key);
			System.out.print("학번 : " + student.getsNum() + "\t");
			System.out.print("아이디 : " + student.getsId() + "\t");
			System.out.print("이름 : " + student.getsName() + "\t");
			//나머지 출력 
			System.out.println();
		}
		System.out.println("--------------------");
	}
	
	
	
	
}
