/**
 *
 */
package com.mw.test.core.dao;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.mw.framework.dao.SysOrganDao;
import com.mw.framework.domain.SysOrgan;
import com.mw.framework.test.BaseTest;

/**
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights
 *            reserved.
 * @fileName com.mw.test.core.dao.SysOrganDaoTest.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-3-9
 * 
 */
public class SysOrganDaoTest extends BaseTest {

	@Autowired
	private SysOrganDao organDao;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//@Test
	@Rollback(value=false)
	public void testSave() {
		SysOrgan organ = new SysOrgan(1,"一级节点");
		organDao.save(organ);
		
		SysOrgan organ2 = new SysOrgan(1,"二级节点",organ);
		organDao.save(organ2);
	}
	
	@Test
	public void testQuery(){
		SysOrgan findOne = organDao.findOne("oBuhGRMmTGeXqEJ9_ba0gA");
		System.out.println(findOne.getName());
		Set<SysOrgan> children = findOne.getChildren();
		for (SysOrgan sysOrgan : children) {
			System.out.println(sysOrgan.getName());
		}
	}
	
}

