package demo.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import demo.dao.UserMapper;
import demo.domain.User;
import demo.utils.MybatisUtils;

public class App {
	@Test
	public void testname() throws Exception {
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);

		User u = new User();
		u.setName("Tom");
		u.setMoney(3000d);
		mapper.insert(u);

		session.close();
	}

}
