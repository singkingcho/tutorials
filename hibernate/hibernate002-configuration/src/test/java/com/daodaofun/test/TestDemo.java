package com.daodaofun.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Test;

import com.daodaofun.domain.Event;

/**
 * 入门程序
 * 2018年5月10日21:50:26
 * @author qiudaozhang
 *
 */
public class TestDemo {

	
	@Test
	public void m1() {
		// 1 获取会话工厂
		SessionFactory sessionFactory = null;
		final StandardServiceRegistry registry = new 
				StandardServiceRegistryBuilder().configure().build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	 
		
	}
}
