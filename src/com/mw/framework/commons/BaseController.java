/**
 *
 */
package com.mw.framework.commons;

import java.util.Date;

import com.mw.framework.util.JsonDateValueProcessor;

import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

/**
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights reserved.
 * @fileName com.mw.framework.commons.BaseController.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-3-10
 *
 */
public class BaseController {

	protected JsonConfig getJsonConfig(String...strings){
		return getJsonConfig("yyyy-MM-dd HH:mm:ss", strings);
	}
	/**
	 * jsonconfig
	 * @param format
	 * @param strings
	 * @return
	 */
	protected JsonConfig getJsonConfig(String format,String...strings){
		JsonConfig config = new JsonConfig();  
		
		config.setIgnoreDefaultExcludes(false);     
		config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);   
		//只要设置这个数组，指定过滤哪些字段
		config.setExcludes(/*new String[]{"children","parent"}*/strings);  
		config.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor(format));
		
		return config;
	}
}
