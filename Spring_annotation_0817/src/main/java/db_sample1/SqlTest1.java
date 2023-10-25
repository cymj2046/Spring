package db_sample1;

import org.springframework.jdbc.core.JdbcTemplate;

public class SqlTest1 {
	//insert, update, delete문 작성
	
	//jdbcTemplate : DB연결 + sql문 작성
	private JdbcTemplate jdbcTemplate;

	//주입 --> 생성자 주입
	public SqlTest1(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//메서드별로 sql문 작성
	public void insert1(Singer singer) {
		int count = jdbcTemplate.update("insert into singer_group values(?,?)", 
				singer.getName(),singer.getMember());
		//update(sql, ?에 전달될 것)
		System.out.println(count +"개 삽입 성공");
	}
	
	public void delete1(String name) {
		int count = 
				jdbcTemplate.update("delete from singer_group where name=?", name);
		System.out.println(count +"개 삭제 성공");
	}

	public void update1(String name) {
		int count = 
				jdbcTemplate.update("update singer_group set member=6 where name=?", name);
		System.out.println(count +"개 수정 성공");
	}
	
	public void update2(int member) {
		int count = 
				jdbcTemplate.update("update singer_group set name='그룹' where member=?", member);
		System.out.println(count +"개 수정 성공");
	}
	
}
