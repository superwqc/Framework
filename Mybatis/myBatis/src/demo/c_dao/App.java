package demo.c_dao;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import demo.c_dao.IUserdao.IUserDao;

public class App {
	IUserDao dao=new UserDaoImpl();
	@Test
	public void testSave() throws Exception {
		User u=new User();
		u.setName("Jordan");
		u.setBirthday(new Date());
		u.setMoney(999d);
		dao.save(u);
	}

}
