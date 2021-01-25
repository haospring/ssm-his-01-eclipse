package com.neu.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.neu.his.pojo.User;
import com.neu.his.service.UserService;

public class TestUser {
	@Autowired
	private UserService userService;

	@Test
	public void testGetUserList() {
		List<Map<String,Object>> userList = userService.getUserList(1, 5, "a");
		for(Map<String, Object> map:userList) {
			Set<Entry<String,Object>> entrySet = map.entrySet();
			for(Entry<String,Object> entry:entrySet) {
				String key = entry.getKey();
				User user = (User) entry.getValue();
				System.out.println(key+"---"+user);
			}
		}
	}
}
