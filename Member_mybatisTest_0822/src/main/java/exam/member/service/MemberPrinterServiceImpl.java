package exam.member.service;

import org.springframework.stereotype.Component;

import exam.member.vo.MemberVo;

@Component
public class MemberPrinterServiceImpl implements MemberPrinterService {

	@Override
	public void print(MemberVo member) {
		System.out.printf("회원정보: 아이디=%d, 이메일=%s, 이름=%s, 비번=%s, 등록일=%tF\n",
				member.getId(), member.getEmail(), member.getName(), 
				member.getPassword(), member.getRegisterDate());
	}
}
