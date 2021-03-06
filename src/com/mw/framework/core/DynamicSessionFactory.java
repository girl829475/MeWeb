package com.mw.framework.core;

import org.hibernate.SessionFactory;
/**
 * DEP-001:因只能支持已配置的EntityManagerFactory动态切换，不能支持动态拓展数据库，故暂停使用
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights reserved.
 * @fileName com.mw.framework.core.DynamicSessionFactory.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-2-19
 *
 */
@Deprecated
public interface DynamicSessionFactory extends SessionFactory {

	public SessionFactory getHibernateSessionFactory();
}
