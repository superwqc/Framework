package demo.d_conflict;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class App {
	@Test
	public void testFindAll() throws Exception {
		SqlSession session =  MybatisUtils.openSession();
		List<User> list = session.selectList("demo.d_conflict.userMapper.findAll");
		for (User user : list) {
			System.out.println(user);
		}
		session.close();
	}
	
	@Test
	public void testFindOne() throws Exception {
		SqlSession session =  MybatisUtils.openSession();
		User user = session.selectOne("com.westos.d_conflict.userMapper.findOne",26);
		System.out.println(user);
		session.close();
	}
}
