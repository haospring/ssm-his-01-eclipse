package com.neu.his.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.neu.his.pojo.User;

/**
 * 用户管理所封装服务层接口
 * 
 * @author 14727
 */
public interface UserService {
	/**
	 * 按条件统计记录数（确定页数最大值）-getUserList
	 * 
	 * @param keywords查询关键字
	 * @return 记录数量 整型
	 */
	int getUserCount(@Param("keywords") String keywords);

	/**
	 * 根据条件统计记录数量（确定页数最大值时候使用），对应的是getUserList02方法
	 * 
	 * @param keywords，keywords2，keywords3查询关键字
	 * @return 记录数量 整型
	 */
	int getUserCount02(@Param("keywords") String keywords, @Param("keywords2") String keywords2,
			@Param("keywords3") String keywords3);

	/**
	 * 按照条件进行用户信息查询，并将查询的信息进行分页显示
	 * 
	 * @param page当前页，count每页显示的记录数，keywords查询关键字
	 * @return 包含查询结果的Map集合
	 */
	List<Map<String, Object>> getUserList(@Param("page") Integer page, @Param("count") Integer count,
			@Param("keywords") String keywords);

	/**
	 * 按照条件进行用户信息查询，并将查询的信息进行分页显示（排班规则的医生查询方法）
	 * 
	 * @param page当前页，count每页显示的记录数，keywords、keywords2、keywords3
	 * @return 包含查询结果的Map集合
	 */
	List<Map<String, Object>> getUserList02(@Param("page") Integer page, @Param("count") Integer count,
			@Param("keywords") String keywords, @Param("keywords2") String keywords2,
			@Param("keywords3") String keywords3);

	/**
	 * 根据用户选择的id进行删除操作，对应getUserList方法
	 * 
	 * @param int[] ids
	 * @return 删除成功--true，删除失败--false
	 */
	boolean deleteUserByIds(@Param("ids") int[] ids);

	/**
	 * 更新用户信息
	 * 
	 * @param user包含用户信息的map对象
	 * @return 更新成功--1，更新失败--0
	 */
	int updateUser(Map<String, Object> user);

	/**
	 * 用户的登录方法
	 * 
	 * @param user 包含用户信息的map对象
	 * @return 登陆成功--1，登录失败--0
	 */
	int login(Map<String, Object> user);

	/**
	 * 添加用户信息
	 * 
	 * @param user包含用户信息的map对象
	 * @return 添加成功--1，添加失败--0
	 */
	int addUser(Map<String, Object> user);

	/**
	 * 根据条件查询返回用户对象
	 * 
	 * @param keywords,keywords2
	 * @return User类型的对象
	 */
	User getUserBean(@Param("keywords") String keywords, @Param("keywords2") String keywords2);

}
