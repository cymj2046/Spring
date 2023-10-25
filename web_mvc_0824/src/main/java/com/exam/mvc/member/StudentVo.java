package com.exam.mvc.member;

public class StudentVo {
	//데이터관리 ==> 폼태그에 name과 DB일때 컬럼 이름을 맞춰야..
	private String name;  //이름
	private String age;  //나이
	private String classNum; //반번호
	private String gradeNum; //학년
	
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	
	

}
