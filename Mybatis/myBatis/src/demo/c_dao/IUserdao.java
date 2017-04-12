package demo.c_dao;

import java.util.List;

public interface IUserdao {
	public interface IUserDao {
		public void save(User user);
		public void delete(Integer id);
		public void update(User user);
		public List<User> find();
		public User find(Integer id);
	}

}
