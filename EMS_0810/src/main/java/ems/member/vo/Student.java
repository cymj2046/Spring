package ems.member.vo;

public class Student {
	//학생정보관리 데이터  => VO 
	//클래스의 멤버변수(필드)는 테이블의 컬럼과 동일하게 
	
	private String sNum; //학번
	private String sId; //아이디
	private String sPw ; //비번
	private String sName;//이름
	private int sAge; //나이
	private char sGender; // 성별
	private String sMajor; //전공
	
	//기본생성자 
	public Student() {
		super();
	}
	
	//매개변수 생성자 
	public Student(String sNum, String sId, String sPw, String sName, int sAge, char sGender, String sMajor) {
		super();
		this.sNum = sNum;
		this.sId = sId;
		this.sPw = sPw;
		this.sName = sName;
		this.sAge = sAge;
		this.sGender = sGender;
		this.sMajor = sMajor;
	}
	
	//getter/setter 메서드 추가	
	public String getsNum() {
		return sNum;
	}
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsPw() {
		return sPw;
	}
	public void setsPw(String sPw) {
		this.sPw = sPw;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public char getsGender() {
		return sGender;
	}
	public void setsGender(char sGender) {
		this.sGender = sGender;
	}
	public String getsMajor() {
		return sMajor;
	}
	public void setsMajor(String sMajor) {
		this.sMajor = sMajor;
	}
}
