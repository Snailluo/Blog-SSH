package com.news.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.Service.ManagerService;
import com.news.entity.Manager;
import com.news.util.PageBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Controller(value="managerAction")
@Scope("prototype")
public class ManagerAction extends ActionSupport implements ModelDriven<Manager>{
	private static final long serialVersionUID = 1L;
	
	@Resource(name="managerService")
	public ManagerService mService;
	
	/* 模型驱动获取Manager数据   */
	private Manager manager = new Manager();
	
	@Override
	public Manager getModel() {
		return manager;
	}
	
	//属性封装获得当前页
	private Integer page = 1;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}

	//向值栈中放入Manager数据
	public Manager getManager() {
		return manager;
	}
	
	//��ֵջ�з���list����
	private List<Manager> mList;
	public List<Manager> getList() {
		return mList;
	}
	
	//将pagebean对象放入值栈
	private PageBean pageBean;
	public PageBean getPageBean() {
		return pageBean;
	}
	
	
	public String login() {
		
		if(mService.login(manager)){
			HttpServletRequest request = ServletActionContext.getRequest();
			request.getSession().setAttribute("managerName",manager.getManagerName());
			return "main";
		}
		
		return "login";
	}
	
	public String findAll() {
		
		mList = mService.findAll();
		return "findall";
	}
	
	public String findAllPage() {
		
		pageBean = mService.findAllLimit(page);
		return "findallpage";
	}
	
	public String findById() {
		
		manager =  mService.findById(manager);
		
		return "edit";
	}
	
	public String addOrUpdate() {
		if(mService.addOrUpdate(manager)){
			return "mlist";
		}
		return "edit";
	}
	
	public String delete() {
		mService.delete(manager);
		return "mlist";
	}

	public String toAdd() {
		manager = new Manager("", "", "");
		return "edit";
	}
	

}
