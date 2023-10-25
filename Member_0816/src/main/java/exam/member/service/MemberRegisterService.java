package exam.member.service;

import exam.member.vo.RegisterRequest;

public interface MemberRegisterService {
	
	public void regist(RegisterRequest req);
	//등록 기능 => 이메일 이름 비번1 비번2

}
