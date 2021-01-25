package com.neu.his.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neu.his.mapper.UserMapper;
import com.neu.his.pojo.User;
import com.neu.his.service.UserService;

/**
 * 用户管理专属的服务层实现类
 * 
 * @author 14727
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int getUserCount(String keywords) {
		return userMapper.getUserCount(keywords);
	}

	@Override
	public int getUserCount02(String keywords, String keywords2, String keywords3) {
		return userMapper.getUserCount02(keywords, keywords2, keywords3);
	}

	@Override
	public List<Map<String, Object>> getUserList(Integer page, Integer count, String keywords) {

		return userMapper.getUserList(page, count, keywords);
	}

	@Override
	public List<Map<String, Object>> getUserList02(Integer page, Integer count, String keywords, String keywords2,
			String keywords3) {
		return userMapper.getUserList02(page, count, keywords, keywords2, keywords3);
	}

	@Override
	public boolean deleteUserByIds(int[] ids) {
		int result = userMapper.deleteUserByIds(ids);
		// 如果数组中的长度与删除的返回值相等，则意味着删除成功
		return result == ids.length;
	}

	@Override
	public int updateUser(Map<String, Object> user) {
		return userMapper.updateUser(user);
	}

	@Override
	public int login(Map<String, Object> user) {
		return userMapper.login(user);
	}

	@Override
	public int addUser(Map<String, Object> user) {
		return userMapper.addUser(user);
	}

	@Override
	public User getUserBean(String keywords, String keywords2) {
		return userMapper.getUserBean(keywords, keywords2);
	}

}
