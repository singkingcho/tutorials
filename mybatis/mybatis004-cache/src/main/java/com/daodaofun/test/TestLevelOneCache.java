package com.daodaofun.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.daodaofun.mapper.HusbandMapper;
import com.daodaofun.model.Husband;
import com.daodaofun.util.MybatisUtil;

public class TestLevelOneCache {

	@Test
	public void levelOneCache() {
		// 证明一级缓存
		SqlSession session = MybatisUtil.getSession();
		HusbandMapper husbandMapper = session.getMapper(HusbandMapper.class);
		Husband husband = husbandMapper.queryById(1);
		Husband husband2 = husbandMapper.queryById(1);

		// System.out.println(husband);
	}

	@Test
	public void levelOneMiss() {
		// 一级缓存失效
		SqlSession session = MybatisUtil.getSession();
		HusbandMapper husbandMapper = session.getMapper(HusbandMapper.class);
		Husband husband = husbandMapper.queryById(1);
		husband.setName("周润发");
		husbandMapper.update(husband);
		Husband husband2 = husbandMapper.queryById(1);
	}
	
	@Test
	public void noUseLevelOneCache() {
		// 声明不使用一级缓存
		SqlSession session = MybatisUtil.getSession();
		HusbandMapper husbandMapper = session.getMapper(HusbandMapper.class);
		Husband husband = husbandMapper.queryById(1);
		// 主动清除缓存 作用是 Clears local session cache 本地会话缓存。
		session.clearCache();
		Husband husband2 = husbandMapper.queryById(1);
	}
}
