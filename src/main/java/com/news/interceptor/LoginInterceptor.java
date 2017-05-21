package com.news.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) 
			throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		Object obj = request.getSession().getAttribute("managerName");
		
		if(obj != null) {
			//session中存在用户名，进行放行操作
			return invocation.invoke();
		} else {
			return "login";
		}
		
	}

}
