package exam.member.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;

@Component
public class MemberListPrinterServiceImpl implements MemberListPrinterService {
	private MemberDao memberDao;
	private MemberPrinterService memberPrinter;
	
	//생성자를 이용한 주입(매개변수 2개)
	@Autowired
	public MemberListPrinterServiceImpl(MemberDao memberDao, MemberPrinterService memberPrinter) {
		super();
		this.memberDao = memberDao;
		this.memberPrinter = memberPrinter;
	}
	

	@Override
	public void printAll() {
		Collection<MemberVo> members = memberDao.selectAll();
		for(MemberVo member : members) {
			memberPrinter.print(member); 
		}//교재 : p115 printStudentInfo() 메서드의 역할
		

	}

}
