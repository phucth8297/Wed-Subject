package com.hoclaptrinhonline.DAO;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.hoclaptrinhonline.Imp.UserImp;
import com.hoclaptrinhonline.entity.User;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserDAO implements UserImp{
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean register(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return false;
	}
	@Transactional
	public boolean login(String id_email, String pass) {
		Session session = sessionFactory.getCurrentSession();
		try {
		User user = (User) session.createQuery("from USERS where id_email ='" + id_email +"' AND pass ='" + pass +"'").getSingleResult();
		if(user != null) {
			System.out.println("Success");
			return true;
			}
		}
		catch(Exception e) {
			System.out.println("Faile");

		}
		return false;
	}
	
	@Transactional
	public User findUserByEmail(String email) {
		
			Session session = sessionFactory.getCurrentSession();
			String sql = "from USERS where id_email = '" + email + "'";
//			Optional<User> user = null;
//			try {
//			user = (Optional<User>) session.createQuery(sql).getSingleResult();
//			if(user != null) {
//				System.out.println(user);
//			}else {
//				System.out.println("A");
//			}
//			}catch(NoResultException e) {
//				e.getMessage();
//			}
			User user = (User) session.createQuery(sql).uniqueResult();
			return user;		
	}
	
	@Transactional
	public User findUserByResetToken(String resetToken) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "from USERS where reset_token = '" + resetToken + "'";
		User user = (User) session.createQuery(sql).uniqueResult();
		return user;
	}
	
	public <S extends User> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	public User findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public Iterable<User> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}
	public void delete(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public boolean updateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "update USERS set reset_token = '" + user.reset_token + "', pass = '" + user.pass + "'where id_email = '" + user.id_email + "'";
		session.update(user);
		return true;
	}
	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
