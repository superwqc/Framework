package demo.IUserDao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.IUserDao.UserDao;
import demo.domain.User;
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}

	public void delte(Integer id) {
		User u=(User) getSession().get(User.class, id);
		getSession().delete(u);
	}

	public User find(Integer id) {
		User u=(User) getSession().get(User.class, id);
		return u;
	}

	public List<User> find() {
		List<User> l=getSession().createQuery("FROM User").list();
		return l;
	}

	public void save(User user) {
		getSession().save(user);
		
	}

	public void update(User user) {
		getSession().update(user);
		
	}

}
