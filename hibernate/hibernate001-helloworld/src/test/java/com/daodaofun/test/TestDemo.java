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
		// 2 获取会话
		Session session = sessionFactory.openSession();
		
		// 3 开启事务
		Transaction tx = session.beginTransaction();
		
		// 4 自定义操作
		Event event = new Event();
		event.setId(1L);
		event.setTitle("骑士夺冠了");
		event.setDate(new Date());
		session.save(event);
		// 5 提交事务
		tx.commit();
		// 6 关闭会话
		session.close();
		
		
	}
}
