package ems.member.service;

import ems.member.dao.StudentDao;
import ems.member.vo.Student;

public class StudentSelectService {
	//등록 기능 -->   ui->service -> dao (조회)
	private StudentDao studentDao;
		
	//주입공간 -->생성자를 이용한 주입
	public StudentSelectService(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student!=null?true:false;
	}
	public Student select(String sNum) {
		if(verify(sNum)) {
			return studentDao.select(sNum);
		}else {
			System.out.println("선택 영역");
		}
		return null;
	}

}
