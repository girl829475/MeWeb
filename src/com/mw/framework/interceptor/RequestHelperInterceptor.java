package com.mw.framework.interceptor;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @Project SpringMVC
 * @Copyright © 2008-2013 SPRO Technology Consulting Limited. All rights reserved.
 * @fileName com.cf.core.interceptor.RequestHelperInterceptor
 * @Version 1.0.0
 * @author Allan Ai
 * @time 2013-6-2
 *
 */
public class RequestHelperInterceptor implements HandlerInterceptor {

 
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) throws Exception {
		//System.out.println("RequestHelperInterceptor After completion handle");  
	}
 
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			ModelAndView arg3) throws Exception {
		 //System.out.println("RequestHelperInterceptor Post-handle");  
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2)
			throws Exception {
		//System.out.println("RequestHelperInterceptor Pre-handle");  
		/*禁止用户直接通过地址访问静态文件：如果启用cookie后，还是无法判断，浏览器会先寻找本地缓存*/
		String referer = request.getHeader("referer");
		String url = request.getRequestURI().toLowerCase();
		
		if(referer==null || referer.trim().length()==0 ){
			Pattern p = Pattern.compile(".(js|jpg|css|gif)");
			Matcher m = p.matcher(url);
			boolean rs = m.find();
			if(rs){
				System.out.println("非法访问:"+request.getRequestURI());
				// 设置编码
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				response.setHeader("Cache-Control", "no-cache");
				
				PrintWriter out = response.getWriter();
				out.write("Unauthorized access!");
				out.flush();
				out.close();
				return false;
			}
		}
		//System.out.println("客户端:"+request.getHeader("User-Agent"));
		return true;
	}

}
