package exam.member.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import antlr.preprocessor.PreprocessorLexer;
import exam.member.service.ChangePasswordService;
import exam.member.service.MemberListPrinterService;
import exam.member.service.MemberRegisterService;
import exam.member.vo.RegisterRequest;

@Component("memberUI")
public class MemberUI { 
	//등록 서비스에 접근
	@Autowired
	private MemberRegisterService memberRegisterService;
	
	//출력 서비스 접근
	@Autowired
	private MemberListPrinterService memberListPrinterService;
	private ChangePasswordService changePasswordService;
	
	//기본 생성자
	
	//setter 메서드 => 주입 공간
	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
	//setter 메서드 => 주입 공간
	public void setMemberListPrinterService(MemberListPrinterService memberListPrinterService) {
		this.memberListPrinterService = memberListPrinterService;
	}
	
	//setter 메서드 => 주입 공간
	public void setChangePasswordService(ChangePasswordService changePasswordService) {
		this.changePasswordService = changePasswordService;
	}

	//추가 메서드
	public void showMenu() {
		Scanner scan = new Scanner(System.in);
		String command ="";
		
		while(true) {
			System.out.println("명령어를 입력하세요.:" +"등록(new), 수정(change), 출력(list), 삭제(delete), 종료(exit)");
			command = scan.nextLine();
			
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("종료");
				break;
			}else if(command.toLowerCase().startsWith("new ")) {
				processNewCommand(command.split(" ")); //메서드 호출
				continue;
			} else if(command.equalsIgnoreCase("list")) {
				ProcessListCommand();
				continue;
			}else if(command.toLowerCase().startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			}
		}
	}

	private void processChangeCommand(String[] args) {
		//change 이메일 비번1 비번2
		if(args.length!=4) {
			System.out.println("형식틀림");
			return;
		}
		changePasswordService.changePassword(args[1], args[2], args[3]);
		System.out.println("비번변경");
	}

	private void ProcessListCommand() {
		memberListPrinterService.printAll();
	}

	private void processNewCommand(String[] args) {
		if(args.length !=5) {
			System.out.println("형식이 틀립니다.");
			return;
		}
		
		RegisterRequest req = new RegisterRequest();
		req.setEmail(args[1]);
		req.setName(args[2]);
		req.setPassword(args[3]);
		req.setConfirmPassword(args[4]);
		
		if(!req.isPasswordEqual()) {
			System.out.println("비번1과 비번2가 틀림");
			return;
		}
		
		memberRegisterService.regist(req); //입력된 정보를 서비스에 접근해서 등록
		System.out.println("성공");
	}

}
