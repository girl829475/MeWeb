/**
 *
 */
package com.mw.framework.support.tx;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.SessionFactoryUtils;

import com.alibaba.druid.pool.DruidDataSource;
import com.mw.framework.core.DynamicSessionFactory;

/**
 * DEP-001:因只能支持已配置的EntityManagerFactory动态切换，不能支持动态拓展数据库，故暂停使用
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights
 *            reserved.
 * @fileName com.mw.framework.support.tx.DynamicHibernateTransactionManager.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-2-19
 * 
 */
@Deprecated
public class DynamicHibernateTransactionManager extends
		HibernateTransactionManager {
	private static final long serialVersionUID = 7610462409790538921L;

	@Override
	public DataSource getDataSource() {
		com.alibaba.druid.pool.DruidDataSource dbsource = new DruidDataSource();
		System.out.println("什么时候用到db source");
		//return dbsource;
		return SessionFactoryUtils.getDataSource(getSessionFactory());
	}

	@Override
	public SessionFactory getSessionFactory() {
		DynamicSessionFactory dynamicSessionFactory = (DynamicSessionFactory) super.getSessionFactory();
		SessionFactory hibernateSessionFactory = dynamicSessionFactory.getHibernateSessionFactory();
		return hibernateSessionFactory;
	}

}
