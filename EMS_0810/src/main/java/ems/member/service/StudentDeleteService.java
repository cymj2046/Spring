package ems.member.service;

import ems.member.dao.StudentDao;
import ems.member.vo.Student;

public class StudentDeleteService {
	//등록 기능 -->   ui->service -> dao (delete)
	private StudentDao studentDao;
		
	//주입공간 -->생성자를 이용한 주입
	public StudentDeleteService(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student!=null?true:false;
	}
	public void delete(String sNum) {
		if(verify(sNum)) {
			studentDao.delete(sNum);
		}else {
			System.out.println("삭제할 데이터가 없습니다.");
		}
	}

}
