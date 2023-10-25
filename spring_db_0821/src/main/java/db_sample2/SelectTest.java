package db_sample2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SelectTest {
	private JdbcTemplate jdbcTemplate;

	//주입 공간 ==> 생성자로 주입
	public SelectTest(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//sql --> 메서드로 정의 ==> 1개의 레코드 다루는 부분
	public void select1() {
		int count = jdbcTemplate.queryForObject("select count(*) from singer_group", Integer.class);
		System.out.println("그룹수는"+ count + "입니다.");
	}
	
	public void select2(int member) {
		String name = jdbcTemplate.queryForObject
				("select name from singer_group where member=?" , String.class, member);
		System.out.println(member +"명의 그룹 이름은 "+ name);
	}
	
	public void select3(String name) {
		int member = jdbcTemplate.queryForObject
				("select member from singer_group where name=?", Integer.class, name);
		System.out.println(name +"의 구성원은 "+ member);
	}
	
	//queryForList
	public void select4(int member) {
		List<String> singers = jdbcTemplate.queryForList
				("select name from singer_group where member=?", String.class, member);
		
		System.out.println(member +"명의 그룹");
		
		for(int i=0; i<singers.size(); i++) {
			String groupname = singers.get(i);
			System.out.println("그룹명: "+ groupname);
		}
	}
	
	//queryForMap
	public void select5(String name) {
		Map<String, Object> singers =
				jdbcTemplate.queryForMap("select * from singer_group where name=?", name);
		String groupname = (String) singers.get("name");
		int member = (Integer) singers.get("member");
		System.out.println("그룹이름: "+ groupname +" 인원수: "+ member);
	}
	
	//query ==> RowMapper 인터페이스
	public List<Singer> select6(int member) {
		List<Singer> singerlist =
				jdbcTemplate.query("select * from singer_group where member=?",
						new RowMapper<Singer> () {

							@Override
							public Singer mapRow(ResultSet rs, int rowNum) throws SQLException {
								Singer singer = new Singer();
								singer.setName(rs.getString("name"));
								singer.setMember(rs.getInt("member"));
								return singer;
								//while(rs.next) {
								//변수 = rs.getString("name");
							}
				}, member);
		return singerlist;
	}
	
	public List<Singer> select7() {
		List<Singer> singerlist =
				jdbcTemplate.query("select * from singer_group",
						new RowMapper<Singer> () {

							@Override
							public Singer mapRow(ResultSet rs, int rowNum) throws SQLException {
								Singer singer = new Singer();
								singer.setName(rs.getString("name"));
								singer.setMember(rs.getInt("member"));
								return singer;
								//while(rs.next) {
								//변수 = rs.getString("name");
							}
				});
		return singerlist;
	}
}
