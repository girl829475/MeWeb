/**
 *
 */
package com.mw.framework.controller;

import java.util.List;
import java.util.Set;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mw.framework.commons.BaseController;
import com.mw.framework.dao.SysOrganDao;
import com.mw.framework.domain.SysOrgan;

/**
 * @Project MeWeb
 * @Copyright © 2008-2014 SPRO Technology Consulting Limited. All rights
 *            reserved.
 * @fileName com.mw.framework.controller.SysOrganController.java
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2014-3-9
 * 
 */
@Controller
@RequestMapping("/core/og/*")
public class SysOrganController extends BaseController{

	@Autowired
	private SysOrganDao sysOrganDao;

	/**
	 * 跳转到组织架构页面
	 * 
	 * @return
	 */
	public String to() {
		return null;
	}

	private final String[] execludes=new String[]{"children","parent"};
	/**
	 * 获取子节点信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/children/{id}", method = RequestMethod.GET)
	@ResponseBody
	@Deprecated
	public JSONObject findChildrenById(@PathVariable String id) {
		SysOrgan findOne = sysOrganDao.findOne(id);
		
		//JSONObject json = JSONObject.fromObject(findOne,getJsonConfig(execludes));
		
		//JSONArray jsonArray = JSONArray.fromObject(findOne.getChildren(),getJsonConfig(execludes));
		StringBuffer sb = new StringBuffer();
		getTreeStructure(findOne, sb,true,-1,0);
		System.out.println(sb);
		 
		return JSONObject.fromObject(sb.toString().replaceAll(",]", "]"));
	}
	
	/**
	 * 获取组织架构所有节点信息含root
	 * @return
	 */
	@RequestMapping(value ="/list", method = RequestMethod.GET)
	@ResponseBody
	public JSON findAll(String node,Integer num){
		List<SysOrgan> list = sysOrganDao.findByParent(node==null?null:node.equals("root")?null:sysOrganDao.findOne(node),new Sort(new Order(Direction.ASC,"sortCode")));
		StringBuffer sb = new StringBuffer();
		JSON json = null;
		if(node==null || node.equals("root")){//root
			//包装一层根节点
			sb.append("{id:'root',name:'根节点',expanded:true,children:[");
			getTreeStructure(list.get(0), sb,true,(num==null?-1:num),0);
			sb.append("]}");
			json = JSONObject.fromObject(sb.toString().replaceAll(",]", "]"));
		}else{
			
			json = JSONArray.fromObject(list,getJsonConfig(execludes));
		}
		return json;
	}
	
	/**
	 * 递归向下穿透获取子节点
	 */
	@SuppressWarnings("unused")
	private void getTreeStructure(SysOrgan organ,StringBuffer sb,boolean bool){
		String string = JSONObject.fromObject(organ,getJsonConfig(execludes)).toString();
		
		if(organ.getChildren().size()>0){
			if(bool)
				sb.append(string.substring(0,string.length()-1)+",children:[");
			else
				sb.append("children:[");
		}else{
			if(bool)
				sb.append(string);
		}
		
		Set<SysOrgan> children = organ.getChildren();
		
		for (SysOrgan sysOrgan : children) {
			String string2 = JSONObject.fromObject(sysOrgan,getJsonConfig(execludes)).toString();
			
			if(sysOrgan.getChildren().size()>0){
				sb.append(string2.substring(0,string2.length()-1)+",");
			}else{
				sb.append(string2.substring(0,string2.length())+",");
			}
			if(sysOrgan.getChildren().size()>0){
				
				getTreeStructure(sysOrgan, sb,false);
			}
		}
		
		if(organ.getChildren().size()>0){
			sb.append("]}");
		}
	}
	
	/**
	 * 递归向下穿透获取子节点(可控制递归次数)
	 * end: -1为不控制，下标从0开始
	 * limit:默认为0
	 */
	private void getTreeStructure(SysOrgan organ,StringBuffer sb,boolean bool,int end,int limit){
		String string = JSONObject.fromObject(organ,getJsonConfig(execludes)).toString();
		
		if(organ.getChildren().size()>0){
			if(end>-1 && limit==end){
				if(bool)
					sb.append(string);
				else{
					sb.append("}");
				}
				return;
			}else{
				limit++;
			if(bool)
				sb.append(string.substring(0,string.length()-1)+",expanded:true,children:[");
			else
				sb.append("expanded:true,children:[");
			}
		}else{
			if(bool)
				sb.append(string);
		}
		
		Set<SysOrgan> children = organ.getChildren();
		
		for (SysOrgan sysOrgan : children) {
			String string2 = JSONObject.fromObject(sysOrgan,getJsonConfig(execludes)).toString();
			
			if(sysOrgan.getChildren().size()>0){
				sb.append(string2.substring(0,string2.length()-1)+",");
			}else{
				sb.append(string2.substring(0,string2.length())+",");
			}
			if(sysOrgan.getChildren().size()>0){
				
				getTreeStructure(sysOrgan, sb,false,end,limit);
			}
		}
		
		if(organ.getChildren().size()==1){
			sb.append("]}");
		}else{
			sb.append("]},");
		}
	}
 
	/**
	 * 条件查询(带分页)
	 * 
	 * @return
	 */
	@RequestMapping(value = "/plist/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Page<SysOrgan> findListForPage(@PathVariable String id, int page,
			int limit) {
		Page<SysOrgan> findById = sysOrganDao.findById(id, new PageRequest(page - 1, limit, null));
		/*for (SysOrgan sysOrgan : findById) {
			System.out.println(sysOrgan.getChildren().size());
		}*/
		return findById;
	}
}
