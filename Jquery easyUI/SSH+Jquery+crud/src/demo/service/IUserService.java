package demo.service;

import java.util.List;

import demo.domain.User;

public interface IUserService {
	public void save(User user);
	public void delte(Integer id);
	public void update(User user);
	public User find(Integer id);
	public List<User> find();

}
