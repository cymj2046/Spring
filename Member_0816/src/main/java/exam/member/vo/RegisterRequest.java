package exam.member.vo;

public class RegisterRequest {
	//new 이메일 이름 비번1 비번2 등록 요청이 들어왔을 때 처리할 클래스
	private String email;
	private String name;
	private String password;
	private String confirmPassword;
	
	
	//기본 생성자
	
	//getter/setter
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	//추가 메서드 => 비번1과 비번 2 확인
	public boolean isPasswordEqual() {
		return password.equals(confirmPassword);
	}
	
}
