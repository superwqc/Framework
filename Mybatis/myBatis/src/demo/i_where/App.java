package demo.i_where;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class App {
	@Test
	public void testFindAll() throws Exception {
		SqlSession session =  MybatisUtils.openSession();
		
		UserExample u=new UserExample();
		List<Integer> ids=new ArrayList<Integer>();
		ids.add(14);
		ids.add(15);
		ids.add(16);
		
		u.setIds(ids);
		List<User> list=new ArrayList<User>();
		for (User user : list) {
			System.out.println(list);
		}
		
		
		session.close();
	}
	
	
}
