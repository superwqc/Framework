package demo.h_parameter;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class App {
	@Test
	public void testFind() throws Exception {
		InputStream in = App.class.getClassLoader().getResourceAsStream("com/westos/h_params/conf.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sf.openSession(true);
		
		UserExample ue = new UserExample();
		ue.setMinMoney(1000d);
		ue.setMaxMoney(2000d);
		List<User> list = session.selectList("com.westos.h_params.userMapper.find2",ue);
		
		for (User user : list) {
			System.out.println(user);
		}
		
		session.close();
		
		
		
	}
}
