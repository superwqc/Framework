package demo.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import demo.dao.UserMapper;
import demo.domain.User;
import demo.domain.UserExample;
import demo.utils.MybatisUtils;

public class App {
	@Test
	public void testname() throws Exception {
		SqlSession session = MybatisUtils.openSession();
		//返回UserMapper这个接口的实现类的对象
		//实现类是Mybatis内部做好的
		//实现类的依据就是userMapper.xml
		UserMapper mapper = session.getMapper(UserMapper.class);

		User u = new User();
		u.setName("Thomas");
		u.setMoney(3000d);
		mapper.insert(u);//四个属性
		System.out.println("---------------------");
		mapper.insertSelective(u);//上边有几个属性，语句中有几个问号

		session.close();
	}
	
	@Test
	public void tesDelete() throws Exception {
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		//mapper.deleteByPrimaryKey(18);
		UserExample ue=new UserExample();
		ue.or().andIdBetween(16, 20);
		mapper.deleteByExample(ue);
		
		session.close();
	}
	@Test
	public void tesUpdate() throws Exception {
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		User u=new User();
		u.setId(6);
		u.setName("Cousins");
		mapper.updateByPrimaryKey(u);
		
		session.close();
	}
	@Test
	public void testFindOne() throws Exception {
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		User u=mapper.selectByPrimaryKey(9);
		System.out.println(u);
		
		session.close();
	}
	@Test
	public void testFindAll() throws Exception {
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		UserExample ue=new UserExample();
		ue.or().andIdIsNotNull();
		List<User> list=mapper.selectByExample(ue);
		System.out.println(list);
		
		session.close();
	}
}
