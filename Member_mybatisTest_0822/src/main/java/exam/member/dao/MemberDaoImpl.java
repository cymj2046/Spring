package exam.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JScrollBar;

import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import exam.member.vo.MemberVo;


@Component
public class MemberDaoImpl implements MemberDao {
	//jdbcTemaolate -> SqlSession
	private SqlSession sqlSession;

	//주입공간 ==> 생성자 주입
	public MemberDaoImpl(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}

	@Override
	public void insert(MemberVo member) {
		sqlSession.insert("memberMapper.insertMember", member);
		//insert into 테이블명
		//values(member.getEmail(), member.getName()...)
	}

	@Override
	public MemberVo selectByEmail(String email) {
		MemberVo member =sqlSession.selectOne("memberMapper.selectEmail", email);
		return member;
		
//		MemberVo member1 = null;
//		List<MemberVo> members = sqlSession.selectList("memberMapper.selectEmail", email);
//		for(MemberVo member : members ) {
//			member1 = new MemberVo(member.getEmail(),
//					member.getName(), member.getPassword(), member.getRegisterDate());
//			member1.setId(member.getId());
//			
//		}
//		return member1;
	}
	

	@Override
	public Collection<MemberVo> selectAll() {
		List<MemberVo> members = sqlSession.selectList("memberMapper.selectAll");
		return members;
	}

	@Override
	public void update(MemberVo member) {
		sqlSession.update("memberMapper.updateMember", member);
		
	}

	@Override
	public void delete(String email) {
		//삭제 => service(delete만들기) => ui에서 menu 추가 => member3.xml => bean등록
		sqlSession.delete("memberMapper.deleteMember", email);
		
	}

}
