package demo.IUserDao;

import java.util.List;

import demo.domain.User;

public interface UserDao {
	public void save(User user);
	public void delte(Integer id);
	public void update(User user);
	public User find(Integer id);
	public List<User> find();
}
