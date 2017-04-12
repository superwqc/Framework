package demo.c_dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import demo.c_dao.IUserdao.IUserDao;

public class UserDaoImpl implements IUserDao {
	private String sql = "demo.c_dao.userMapper";

	public void delete(Integer id) {
		SqlSession session = MybatisUtils.openSession();
		session.delete(sql + ".delete", 12);
		session.close();
	}

	public List<User> find() {
		SqlSession session = MybatisUtils.openSession();
		List<User> list = session.selectList(sql + ".findAll");

		session.close();
		return list;
	}

	public User find(Integer id) {
		SqlSession session = MybatisUtils.openSession();
		User u = session.selectOne(sql + ".findOne", id);
		session.close();
		return u;
	}

	public void save(User user) {

		SqlSession session = MybatisUtils.openSession();
		session.insert(sql + ".save", user);
		session.close();

	}

	public void update(User user) {
		SqlSession session = MybatisUtils.openSession();
		session.update(sql + ".update", user);
		session.close();

	}

}
