package exam.member.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;
import exam.member.vo.RegisterRequest;

@Component
public class MemberRegisterServiceImpl implements MemberRegisterService {
	private MemberDao memberDao;
	
	//주입 ==> 생성자로 주입(매개변수 생성자)
	@Autowired
	public MemberRegisterServiceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}
	
	
	@Override
	public void regist(RegisterRequest req) {
		MemberVo member = memberDao.selectByEmail(req.getEmail());
		
		if(member !=null) {
			System.out.println("이미 등록");
		}else if(member == null) {
			MemberVo newMember = 
					new MemberVo(req.getEmail(), req.getName(), req.getPassword(), new Date());
			memberDao.insert(newMember);
		}
	}
}
