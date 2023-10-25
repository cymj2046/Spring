package ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ems.member.vo.Student;

public class StudentDao {
	//Model영역에  DAO역할 
	//--> DB연결하고 insert, select, update, delete 
	//DB대신에 Map을 이용
	
	private Map<String, Student> studentDB 
	         = new HashMap<String, Student>();
	
	//db연결해서 사용할 메서드 정의 
	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
		//map.put(키, 값) -->삽입 
		//student.getsNum()  :학번
		//student : 학생 정보 =>학번~전곤
		//hack01 -->hack01, ks, 123,  홍길동..
		//db: insert문
	}
	
	//조회
	public Student select(String sNum) {
		return studentDB.get(sNum);
		//db : select 문 -->  select * from 테이블명 where sNum 
	}
	
	//수정
	public void update(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	//삭제 
	public void delete(String sNum) {
		studentDB.remove(sNum);
	}
	
	//전체조회
	public Map<String, Student> getStudentDB() {
		return studentDB;
		
	}
}
