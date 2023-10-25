package ems.member.service;

import java.util.Map;

import ems.member.dao.StudentDao;
import ems.member.vo.Student;

public class StudentAllSelectService {
	//전체 조회 
	private StudentDao studentDao;
	
	//매개변수 생성자 --> 주입
	public StudentAllSelectService(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	//조회메서드 
	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}

	
	

}
