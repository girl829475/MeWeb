package com.mw.framework.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mw.framework.domain.SysDataDic;

@Component
public interface SysDataDicDao extends JpaRepository<SysDataDic, String> {

	//@Cacheable(value="andCache",key="#root.args[0]+#root.methodName")
	public Page<SysDataDic> findByPid(String pid,Pageable pageRequest);
	
	//@Cacheable(value="andCache",key="#root.args[0]+#root.methodName")
	
	public List<SysDataDic> findByPid(String pid);
	
	public List<SysDataDic> findByPidForSSM(String pid);
	
	public void saveForSSM(SysDataDic dataDic);
	
	public SysDataDic get(String pid);
	
}
