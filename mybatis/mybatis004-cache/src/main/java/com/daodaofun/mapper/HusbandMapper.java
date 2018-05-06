package com.daodaofun.mapper;

import org.apache.ibatis.annotations.Param;

import com.daodaofun.model.Husband;

public interface HusbandMapper {

	
	/**
	 * 以属性级联方式查询
	 * @param id
	 * @return
	 */
	Husband queryById(@Param("id")Integer id);
	
	/**
	 * 借用association标签完成
	 * @param id
	 * @return
	 */
	Husband queryById2(@Param("id")Integer id);
	
	int update(Husband husband);
}
