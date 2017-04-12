package demo.f_many2many;


import javax.jms.Session;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class App {
	@Test
	public void testname() throws Exception {
		
		SqlSession session=MybatisUtils.openSession();
		Stu s=session.selectOne("demo.f_many2many.stuMapper.findOne",1);
		System.out.println(s);
		System.out.println(s.getTeachers());
		session.close();
	}
	
	
	
}
