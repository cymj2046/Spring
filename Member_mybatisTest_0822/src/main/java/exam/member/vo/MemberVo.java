package exam.member.vo;

import java.util.Date;

public class MemberVo {
	//테이블에 들어갈 컬럼 이름으로
	private Long id; //순번 ==> auto_increment
	private String email; //이메일 ==> 기준
	private String name; //이름
	private String password; //비번
	private Date registerDate; //날짜
	
	//기본 생성자
	public MemberVo() {
		super();
	}

	//매개변수 생성자 ==> id를 뺀 나머지 매개변수로
	public MemberVo(String email, String name, String password, Date registerDate) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.registerDate = registerDate;
	}

	//getter/setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	//추가 메서드(비밀번호 확인)
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			System.out.println("등록된 비번이 아닙니다.");
		}else {
			this.password = newPassword; //새로운 비번으로 수정
		}
	}
	
}
