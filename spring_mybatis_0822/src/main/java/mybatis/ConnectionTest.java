package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class ConnectionTest {
	//sqlsession
	private SqlSession sqlSession;

	//주입 공간 --> 생성자 주입
	public ConnectionTest(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}
	
	//매서드 단위 sql문 작성
	public void connect() {
		System.out.println("연결성공");
	}
	
	//메서드 역할 추가
	public void insert1(Singer singer) {
		int count = sqlSession.insert("singerMapper.insertSinger", singer);
		//insert("네임스페이스명.id", 파라메터값)
		System.out.println(count +"개 삽입");
	}
	
	public void delete1(String name) {
		int count = sqlSession.delete("singerMapper.deleteSinger", name);
		System.out.println(count +"개 삭제");
	}
	
	public void update1(Singer singer) {
		int count = sqlSession.update("singerMapper.updateSinger", singer);
		System.out.println(count +"개 수정");
	}
	
	public void select1() {
		int count = sqlSession.selectOne("singerMapper.getSingerCount");
		System.out.println("총 그룹수는: "+ count);
	}
	
	public void select2(int member) {
		String name = sqlSession.selectOne("singerMapper.getSingerName", member);
		System.out.println(member +"명의 그룹이름: "+ name);
	}
	
	public void select3(String name) {
		List<Singer> singers = sqlSession.selectList("singerMapper.getSingers", name);
		for(Singer singer : singers) {
			System.out.println(name +"의 그룹 인원수: "+ singer.getMember());
		}
	}
	
	public void select4() {
		List<Singer> singers = sqlSession.selectList("singerMapper.getSingers1");
		for(Singer singer : singers) {
			System.out.println(singer.getName() +"의 그룹 인원수: "+ singer.getMember());
		}
	}
}
