package exam.member.dao;

import java.util.Collection;

import exam.member.vo.MemberVo;

public interface MemberDao {
	
	//DB에 접근할 메서드
	
	
	//삽입
	public void insert(MemberVo member);
	
	//하나 조회
	public MemberVo selectByEmail(String email);
	
	//전체 조회
	public Collection<MemberVo> selectAll();
	
	//수정
	public void update(MemberVo member);
	
	//삭제
	public void delete(String email);

}
