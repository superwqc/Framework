package demo.j_simple;

import java.util.List;

public interface IUserDao {
	public void save(User user);
	public void delete(Integer id);
	public void update(User user);
	public List<User> find();

}
