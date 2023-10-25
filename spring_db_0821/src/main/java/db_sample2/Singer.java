package db_sample2;

public class Singer {
	//Vo역할
	//테이블의 컬럼을 필드로
	private String name;
	private int member;
	
	//기본생성자
	public Singer() {
		super();
	}

	//매개변수 생성자
	public Singer(String name, int member) {
		super();
		this.name = name;
		this.member = member;
	}

	//getter/setter메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}
}
