package com.neu.his.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/*
 * @author 14727
 * @description 封装了共性的方法
 */
public interface BaseMapper {
	/**
	 * 根据ID主键完成数据查询
	 * @param int id 主键
	 * @return List<Map<String,Object>>
	 */
	List<Map<String, Object>> selectByPrimaryKey(@Param("id") int id);

	/**
	 * 可以删除多个id对应的数据
	 * @param int[]
	 * @return
	 */
	int deleteByPrimaryKey(@Param("ids") int[] ids);

	/**
	 * 添加一条记录，判断数据字段为空字段，不进行添加
	 * @param Map<String,Object>
	 * @return
	 */
	int insertSelective(Map<String, Object> map);

	/**
	 * 修改数据，判断数据为空字段，不进行修改
	 * @param Map<String, Object> map
	 * @return
	 */
	int updateByPrimaryKey(Map<String, Object> map);
}
