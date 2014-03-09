/**
 *
 */
package com.mw.framework.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.MemcachedClient;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.code.ssm.Cache;
import com.google.code.ssm.api.CacheName;
import com.google.code.ssm.api.InvalidateMultiCache;
import com.google.code.ssm.api.InvalidateSingleCache;
import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughMultiCache;
import com.google.code.ssm.api.ReadThroughSingleCache;
import com.google.code.ssm.api.UpdateMultiCache;
import com.google.code.ssm.api.UpdateSingleCache;
import com.google.code.ssm.api.format.SerializationType;
import com.google.code.ssm.providers.CacheException;
import com.mw.framework.context.SpringContextHolder;
import com.mw.framework.dao.SysDataDicDao;
import com.mw.framework.domain.SysDataDic;

/**
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights reserved.
 * @fileName com.mw.framework.dao.impl.DataDicDaoImpl.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-2-25
 *
 */
public class SysDataDicDaoImpl  {

	private static final String NAMESPACE="goodscenter:DataDicDao";
	@Autowired
	private SysDataDicDao dataDicDao;
	
	@Autowired
	private Cache appCache;
	
	//@ReadThroughMultiCache(namespace = NAMESPACE, expiration = 3600)
    //@CacheName("appCache")
	public List<SysDataDic> findByPidForSSM(@ParameterValueKeyProvider String pid){
		System.out.println("调用约定Dao实现find方法");
		
		//查看mencached缓存的值
		//Cache cache = SpringContextHolder.getBean("appCache");
		//System.out.println();
		dataDicDao.findOne(pid);
		return dataDicDao.findByPid(pid);
	}
	
	@UpdateSingleCache(namespace=NAMESPACE, expiration = 3600)
	//@CacheName("appCache")
	//@InvalidateMultiCache(namespace= NAMESPACE, expiration = 3600)
	public void saveForSSM(SysDataDic dataDic){
		System.out.println("调用约定Dao实现save方法");
		
		dataDicDao.save(dataDic);
	}
	
	@InvalidateSingleCache(namespace=NAMESPACE)
	//@CacheName("appCache")
	public void deleteForSSM(@ParameterValueKeyProvider String pid){
		System.out.println("调用约定Dao实现delete方法");
		dataDicDao.delete(pid);
	}
	
	@ReadThroughSingleCache(namespace = NAMESPACE, expiration = 3600)
    @CacheName("appCache")
	public SysDataDic get(@ParameterValueKeyProvider String id){
		System.out.println("调用查询单个对象的缓存,看是否成功");
		
		try {
			Object object = appCache.get("hello", SerializationType.PROVIDER);
			System.out.println("object:"+object);
			Collection<String> aliases = appCache.getAliases();
			for (String string : aliases) {
				System.out.println(string);
			}
			
		} catch (TimeoutException e) {
			e.printStackTrace();
		} catch (CacheException e) {
			e.printStackTrace();
		}
		return dataDicDao.findOne(id);
	}
}
