package com.daodaofun.test;

import org.junit.Test;

import com.daodaofun.mapper.AuthorMapper;
import com.daodaofun.model.Author;
import com.daodaofun.util.MybatisUtil;

public class TestOneToMany {

	
	@Test
	public void m1() {
		// 查询id为1的作者，以及他的所有博客
		AuthorMapper mapper = MybatisUtil.getSession().getMapper(AuthorMapper.class);
		Author author = mapper.queryById(1);
		System.out.println(author  );
		System.out.println(author.getBlogs());
	}
	
	
}
