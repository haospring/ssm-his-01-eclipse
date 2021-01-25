package com.neu.his.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.his.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/userController", params = "act=getUser")
	public void getUserListMethod(HttpServletRequest req, String keywords) {
		List<Map<String, Object>> userList = userService.getUserList(1, 5, keywords);
		for (Map<String, Object> map : userList) {
			Set<Entry<String, Object>> entrySet = map.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				String key = entry.getKey();
				Object value = entry.getValue();
				System.out.println(key + "---" + value);
				req.setAttribute("key", key);
				req.setAttribute("value", value);
			}
		}
	}

	@RequestMapping(value = "/userController", params = "act=getUserCount")
	public void getUserCountMethod(HttpServletRequest request, String keywords) {
		int userCount = userService.getUserCount(keywords);
		System.out.println("一共有" + userCount + "条数据");
	}

	@RequestMapping(value = "/userController", params = "act=getUserCount02")
	public void getUserCount02Method(HttpServletRequest request, String keywords, String keywords02,
			String keywords03) {
		int userCount = userService.getUserCount02(keywords, keywords02, keywords03);
		System.out.println("一共有" + userCount + "条数据");
	}

}
