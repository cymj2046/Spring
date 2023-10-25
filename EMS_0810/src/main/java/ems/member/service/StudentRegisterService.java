package ems.member.service;

import ems.member.dao.StudentDao;
import ems.member.vo.Student;

public class StudentRegisterService {
	//등록 기능 -->   ui->service -> dao (insert)
	private StudentDao studentDao;
		
	//주입공간 -->생성자를 이용한 주입
	public StudentRegisterService(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student==null?true:false;
	}
	
	public void register(Student student) {
		if(verify(student.getsNum())) {
			studentDao.insert(student);
		}else {
			System.out.println("이미존재");
		}
	}

}
