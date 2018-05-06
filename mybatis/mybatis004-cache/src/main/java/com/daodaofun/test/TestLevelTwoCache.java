package com.daodaofun.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.daodaofun.mapper.HusbandMapper;
import com.daodaofun.model.Husband;
import com.daodaofun.util.MybatisUtil;

public class TestLevelTwoCache {

	@Test
	public void levelTwoCache() {
		// 证明二级缓存
		SqlSession session = MybatisUtil.getSession();
		HusbandMapper husbandMapper = session.getMapper(HusbandMapper.class);
		Husband husband = husbandMapper.queryById(1);
		session.close();
		SqlSession session2 = MybatisUtil.getSession();
		HusbandMapper husbandMapper2 = session2.getMapper(HusbandMapper.class);
		Husband husband2 = husbandMapper2.queryById(1);
	}
}
