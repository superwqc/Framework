package demo.j_simple;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class App {
	@Test
	public void testUpdate() throws Exception {
		SqlSession session=MybatisUtils.openSession();
		
		IUserDao dao=session.getMapper(IUserDao.class);
		
		User u=new User();
		u.setId(16);
		u.setName("Foo");
		u.setMoney(4444d);
		u.setBirthday(new Date());
		
		dao.update(u);
		
		
		session.close();
	}
	
	
}
