package com.study.service;

import com.study.pojo.User;

import java.util.List;

public interface UserService {
	/**
	 *  取得所有用户
	 *  @author WG
	 *  @return 用户列表
	 */
	public List<User> getUsers();
	/**
	 *  根据用户账号信息取得用户
	 *  @author WG
	 *  @return
	 */
	public User getUser(User user);

	/**
	 *  添加用户
	 *  @author WG
	 *  @param user
	 *  @return
	 */
	public void insertUser(User user);
	/**
	 *  更新用户信息
	 *  @author WG
	 *  @param user
	 *  @return
	 */
	public int updateUser(User user);
	/**
	 *  删除用户
	 *  @author WG
	 *  @param id
	 *  @return
	 */
	public int deleteUser(Long id);
}
