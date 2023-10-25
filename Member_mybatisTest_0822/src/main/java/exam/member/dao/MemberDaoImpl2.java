package exam.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JScrollBar;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import exam.member.vo.MemberVo;

@Component
public class MemberDaoImpl2 implements MemberDao {
	
	//DB연결을 위한 jdbcTemplate
	private JdbcTemplate jdbcTemplate;
	
	//주입 공간 ==> 생성자
	public MemberDaoImpl2(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(MemberVo member) {
		String sql = "insert into member(email, name, password, registerDate) values(?,?,?,?)";
		jdbcTemplate.update(sql, member.getEmail(), member.getName(),
				member.getPassword(), member.getRegisterDate());
		//insert into 테이블명
		//values(member.getEmail(), member.getName()...)
	}

	@Override
	public MemberVo selectByEmail(String email) {
		String sql = "select * from member where email=?";
		List<MemberVo> members = jdbcTemplate.query(sql, new RowMapper<MemberVo>() {

			@Override
			public MemberVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				//DB정보를 MemberVo값 저장 => setter나 생성자 이용
				MemberVo member = new MemberVo(rs.getString("email"), rs.getString("name"),
						rs.getString("password"), rs.getTimestamp("registerDate"));
				member.setId(rs.getLong("id"));
				return member;
			}
		}, email);
		
		return members.isEmpty() ? null : members.get(0);
	}

	@Override
	public Collection<MemberVo> selectAll() {
		String sql = "select * from member";
		List<MemberVo> members = jdbcTemplate.query(sql, new RowMapper<MemberVo>() {

			@Override
			public MemberVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				Long id = rs.getLong("id");
				String email = rs.getString("email");
				String name = rs.getString("name");
				String password = rs.getString("password");
				Date registerDate = rs.getTimestamp("registerDate");
				
				MemberVo member = new MemberVo(email, name, password, registerDate);
				member.setId(id);
				return member;
			}
		});
		
		return members;
	}
	
	@Override
	public void update(MemberVo member) {
		String sql = "update member set password=? where email=?";
		jdbcTemplate.update(sql, member.getPassword(), member.getEmail());
	}

	@Override
	public void delete(String email) {

	}
}
