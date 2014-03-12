/**
 *
 */
package com.mw.test.core.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.mw.framework.dao.SysOrganDao;
import com.mw.framework.dao.SysUserDao;
import com.mw.framework.domain.SysOrgan;
import com.mw.framework.domain.SysUser;
import com.mw.framework.test.BaseTest;

/**
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights reserved.
 * @fileName com.mw.test.core.dao.SysUserDaoTest.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-3-12
 *
 */
public class SysUserDaoTest  extends BaseTest {
	
	@Autowired
	private SysOrganDao sysOrganDao;
	
	@Autowired
	private SysUserDao sysUserDao;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Rollback(value=false)
	public void save(){
		//SysUser findOne = sysUserDao.findOne("1sU32qzAS2Gn2wQdfPA1cA");
		SysUser findOne = new SysUser("admin", "管理员", "admin", 1, "001100");
		SysOrgan sysOrgan = sysOrganDao.findOne("Pp5SywiITLuaSUoQf8TUDg");
		sysOrgan.setName("测试数据!");
		findOne.getOrganes().add(sysOrgan);
		//findOne.setUserType("A1");
		sysUserDao.save(findOne);
	}
}
