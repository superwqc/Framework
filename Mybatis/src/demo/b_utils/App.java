package demo.b_utils;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class App {
	@Test
	public void testSave() throws Exception {
		SqlSession session=MybatisUtils.openSession();
		User u=new User();
		u.setName("Smith");
		u.setBirthday(new Date());
		u.setMoney(555d);
		session.insert("demo.b_utils.userMapper.save", u);
		
	}

}
