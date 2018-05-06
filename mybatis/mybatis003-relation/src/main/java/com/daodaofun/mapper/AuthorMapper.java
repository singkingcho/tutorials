package com.daodaofun.mapper;

import org.apache.ibatis.annotations.Param;

import com.daodaofun.model.Author;

public interface AuthorMapper {

	
	/**
	 * 根据主键查询作者，并且查询出对应的所有的博客
	 * @param id
	 * @return
	 */
	Author queryById(@Param("id")Integer id);
}
