package com.mw.framework.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.expression.spel.ast.Operator;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mw.framework.bean.Message;
import com.mw.framework.dao.DataDicDao;
import com.mw.framework.domain.DataDic;
import com.mw.framework.support.DynamicDataSourceHolder;
import com.sun.jndi.toolkit.dir.SearchFilter;


@Controller
@RequestMapping("/core/dd/*")
public class DataDicController {
	
	private static final Logger logger = LoggerFactory.getLogger(DataDicController.class);
	
	@Autowired
	public DataDicDao dataDicDao;

	@RequestMapping(value = "/init", method = RequestMethod.GET)
	public String toDataDic(ModelAndView modelAndView){
		return "/core/toDataDic";
	}
	
	/**
	 * 根据PID获取数据字典数据(优先缓存)
	 * @param pid
	 * @return
	 */
	@RequestMapping(value = "/list/{pid}", method = RequestMethod.GET)
	@ResponseBody
	public Page<DataDic> getDataDicList(@PathVariable Integer pid,int page, int limit) {
		DynamicDataSourceHolder.setCustomerType("DB01");
		List<Order> orders = new ArrayList<Sort.Order>();
		orders.add(new Order("id"));
		Sort sort = new Sort(orders);
		return dataDicDao.findByPid(pid,new PageRequest(page, limit, sort));
	}
	
	/**
	 * 根据PID获取数据字典数据(优先缓存)
	 * @param pid
	 * @return
	 */
	@RequestMapping(value = "/list2/{pid}", method = RequestMethod.GET)
	@ResponseBody
	public List<DataDic> getDataDicList2(@PathVariable Integer pid) {
		return dataDicDao.findByPid(pid);
	}
	
/*	*//**
	 * 创建分页请求.
	 *//*
	private PageRequest buildPageRequest(int pageNumber, int pagzSize, String sortType) {
		Sort sort = null;
		if ("auto".equals(sortType)) {
			sort = new Sort(Direction.DESC, "id");
		} else if ("title".equals(sortType)) {
			sort = new Sort(Direction.ASC, "title");
		}

		return new PageRequest(pageNumber - 1, pagzSize, sort);
	}*/
 
	
	/**
	 * 根据ID获取数据字段详细信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public DataDic getDataDic(@PathVariable Integer id){
		DataDic dataDic = dataDicDao.findOne(id);
		return dataDic;
	}
	
	/**
	 * 保存数据字典(ajax提交)
	 * @param dataDic
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Message save(@Valid DataDic dataDic,BindingResult result){
		Message msg = null;
		if(result.hasErrors()) {
			List<FieldError> fieldErrors = result.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				System.out.println(fieldError.getField()+"|"+fieldError.getDefaultMessage());
			}
			msg = new Message("DD-V-500",result.toString());
		}  
		
		if(dataDic!=null){
			try {
				logger.debug(dataDic.toString());
				dataDicDao.save(dataDic);
				msg = new Message("ok");
			} catch (Exception e) {
				msg = new Message("DD-S-500",e.getLocalizedMessage());
			}
		}else{
			msg = new Message("DD-S-000","dataDic is null");
		}
		logger.debug(msg.toString());
		return msg;
	}
	
	/**
	 * 保存数据字典(传统表单提交)
	 * @param dataDic
	 * @return
	 */
	@RequestMapping(value = "/save2", method = RequestMethod.GET)
	public String save2(String holder, @Valid DataDic dataDic,BindingResult result){
		Message msg = null;
		if(result.hasErrors()) {
			List<FieldError> fieldErrors = result.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				System.out.println(fieldError.getField()+"|"+fieldError.getDefaultMessage());
			}
			msg = new Message("DD-V-500",result.toString());
			return "error";
		}  

		if(dataDic!=null){
			try {
				logger.debug(dataDic.toString());
				DynamicDataSourceHolder.setCustomerType(holder);
				dataDicDao.save(dataDic);
				msg = new Message("ok");
			} catch (Exception e) {
				msg = new Message("DD-S-500",e.getLocalizedMessage());
			}
		}else{
			msg = new Message("DD-S-000","dataDic is null");
		}
		logger.debug(msg.toString());
		//return msg;\
		return "success";
	}
	
	/**
	 * 根据ID删除数据字典
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Message delete(@PathVariable Integer id){
		Message msg = null;
		try {
			dataDicDao.delete(id);
			msg = new Message(null,"ok");
		} catch (Exception e) {
			msg = new Message("DD-D-500",e.getLocalizedMessage());
		}
		return msg;
	}
}
