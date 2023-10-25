package exam.member.service;

public interface ChangePasswordService {
	public void changePassword(String email, String oldPassword, String newPassword);
	//change 이메일 기존비번 새로운비번
}
