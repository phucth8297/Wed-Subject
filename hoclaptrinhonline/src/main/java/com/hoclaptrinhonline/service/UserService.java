package com.hoclaptrinhonline.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoclaptrinhonline.DAO.UserDAO;
import com.hoclaptrinhonline.Imp.UserImp;
import com.hoclaptrinhonline.entity.User;
@Service
public class UserService implements UserImp{

	@Autowired
	UserDAO userDAO;
	
	public boolean register(User user) {
		userDAO.register(user);
		return false;
	}

	public boolean login(String id_email, String pass) {
		userDAO.login(id_email, pass);
		return true;
	}

	public User findUserByEmail(String email) {
		return userDAO.findUserByEmail(email);
	}

	public User findUserByResetToken(String resetToken) {
		return userDAO.findUserByResetToken(resetToken);
	}

	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
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

	public boolean updateUser(User user) {
		 userDAO.updateUser(user);
		 return true;
	}
	
}
