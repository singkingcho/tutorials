package com.daodaofun.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Test;

import com.daodaofun.domain.Event;

/**
 * 优化书写
 * 2018年5月10日21:50:30
 * @author qiudaozhang
 *
 */
public class TestDemo2 {

	
	@Test
	public void m1() {
		// 1 获取会话工厂
		SessionFactory sessionFactory = null;
		// 2 获取会话
		Session session = null;
		Transaction tx  = null;
		
		try {
			final StandardServiceRegistry registry = new 
					StandardServiceRegistryBuilder().configure().build();
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			session = sessionFactory.openSession();
			// 3 开启事务
			tx = session.beginTransaction();
			
			// 4 自定义操作
			Event event = new Event();
			event.setId(3L);
			event.setTitle("骑士夺冠了");
			event.setDate(new Date());
			session.save(event);
			// 5 提交事务
			tx.commit();
			// 6 关闭会话
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		
		
		
		
		
	}
}
