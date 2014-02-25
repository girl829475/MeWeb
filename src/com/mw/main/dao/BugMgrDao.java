package com.mw.main.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mw.main.domain.BugMgr;

@Component
public interface BugMgrDao extends JpaRepository<BugMgr, Integer> {

	/**
	 * 第一种情况的缓存,处理spring data jpa自身的方法
	 * 
	 * @param id
	 * @return
	 */
	//@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value = "true") })
	//@Cacheable(value="andCache",key="#id+''")
	public List<BugMgr> findById(Integer id);
	
	//@Query("select t from BugMgr t where t.type=?1")
	@Cacheable(value="andCache",key="#root.args[0]+#root.methodName")
	public List<BugMgr> findByType(String type);
}
