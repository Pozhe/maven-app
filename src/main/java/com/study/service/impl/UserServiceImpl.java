package com.study.service.impl;

import java.util.List;

import com.study.dao.UserDao;
import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getUsers() {

		return userDao.getUsers();
	}

	public User getUser(User user) {
		return userDao.getUser(user);
	}

	public void insertUser(User user) {
		if (user != null && user.getUserId() != 0) {
			userDao.updateUser(user);
		} else {
			userDao.insertUser(user);
		}
	}

	public int updateUser(User user) {
		return 0;
	}

	public int deleteUser(Long id) {
		return 0;
	}
}
