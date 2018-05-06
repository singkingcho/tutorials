package com.daodaofun.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * mybatis工具类，为了得到会话
 * 2018年5月6日20:31:10
 * @author qiudaozhang
 *
 */
public class MybatisUtil {

	
	private static SqlSessionFactory sessionFactory;
	
	static {
		init();
	}

	private static void init() {
		if(sessionFactory == null) {
			String resource = "mybatis.cfg.xml";
			InputStream in;
			try {
				in = Resources.getResourceAsStream(resource);
				sessionFactory = new SqlSessionFactoryBuilder().build(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	public static SqlSession getSession() {
		return sessionFactory.openSession();
	}
}
