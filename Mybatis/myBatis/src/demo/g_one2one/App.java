package demo.g_one2one;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class App {
	@Test
	public void testFindOne() throws Exception {
		SqlSession session =  MybatisUtils.openSession();
		Person p = session.selectOne("demo.g_onetoone.personMapper.findOne",1);
		System.out.println(p);
		System.out.println(p.getCard());
		session.close();
	}
}
