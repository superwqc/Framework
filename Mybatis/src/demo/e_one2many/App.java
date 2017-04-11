package demo.e_one2many;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class App {
	@Test
	public void testname() throws Exception {
		SqlSession session=MybatisUtils.openSession();
		Emp e=session.selectOne("demo.e_one2many.empMapper.findOne",15);
		System.out.println(e);
		session.close();
		
	}

}
