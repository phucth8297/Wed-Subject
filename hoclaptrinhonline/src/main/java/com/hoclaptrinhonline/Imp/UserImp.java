package com.hoclaptrinhonline.Imp;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hoclaptrinhonline.entity.User;

public interface UserImp {
public boolean register(User user);
public boolean login(String id_email, String pass);
public User findUserByEmail(String email);
public User findUserByResetToken(String resetToken);
public boolean updateUser(User user);
}
