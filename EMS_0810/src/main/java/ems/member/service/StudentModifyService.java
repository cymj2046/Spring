package ems.member.service;

import ems.member.dao.StudentDao;
import ems.member.vo.Student;

public class StudentModifyService {
	//등록 기능 -->   ui->service -> dao (update)
	private StudentDao studentDao;
		
	//주입공간 -->생성자를 이용한 주입
	public StudentModifyService(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student!=null?true:false;
	}
	
	public void modify(Student student) {
		if(verify(student.getsNum())) {
			studentDao.update(student);
		}else {
			System.out.println("수정 실패");
		}
	}

}
