/**
 *
 */
package com.mw.framework.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mw.framework.domain.SysOrgan;
import com.mw.framework.domain.SysUser;

/**
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights reserved.
 * @fileName com.mw.framework.dao.SysOrgan.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-3-9
 *
 */
@Component
public interface SysUserDao  extends JpaRepository<SysUser, String>{
	
	public SysUser findByUserNameAndPassword(String userName,String password);
}
