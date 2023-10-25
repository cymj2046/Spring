package exam.member.service;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;

public class ChangePasswordServiceImpl implements ChangePasswordService{
	private MemberDao memberDao;

	//생성자 주입
	public ChangePasswordServiceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

	@Override
	public void changePassword(String email, String oldPassword, String newPassword) {
		MemberVo member = memberDao.selectByEmail(email);
		if(member==null) {
			System.out.println("이메일 존재하지 않음");
		}
		member.changePassword(oldPassword, newPassword);
		memberDao.update(member);  //수정
	}
	
}
