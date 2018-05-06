package com.daodaofun.test;

import org.junit.Test;

import com.daodaofun.mapper.HusbandMapper;
import com.daodaofun.model.Husband;
import com.daodaofun.util.MybatisUtil;

public class TestOneToOne {

	
	@Test
	public void m1() {
		// 查询id为1的丈夫，以及它的夫人。
		HusbandMapper husbandMapper = MybatisUtil.getSession().getMapper(HusbandMapper.class);
		Husband husband = husbandMapper.queryById(1);
		System.out.println(husband);
	}
	
	
	@Test
	public void m2() {
		// 查询id为1的丈夫，以及它的夫人。通过association标签查询
		HusbandMapper husbandMapper = MybatisUtil.getSession().getMapper(HusbandMapper.class);
		Husband husband = husbandMapper.queryById2(1);
		System.out.println(husband);
	}
}
