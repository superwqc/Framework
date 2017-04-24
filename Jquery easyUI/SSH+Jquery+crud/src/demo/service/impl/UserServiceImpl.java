package demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.IUserDao.UserDao;
import demo.domain.User;
import demo.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDao dao;

	public void delte(Integer id) {
		dao.delte(id);

	}

	public User find(Integer id) {
		return dao.find(id);
	}

	public List<User> find() {
		return dao.find();
	}

	public void save(User user) {
		dao.save(user);
	}

	public void update(User user) {
		dao.update(user);
	}

}
