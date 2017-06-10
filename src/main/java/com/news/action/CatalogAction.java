package com.news.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.Service.CatalogService;
import com.news.entity.Catalog;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller(value="CatalogAction")
@Scope("prototype")
public class CatalogAction extends ActionSupport implements ModelDriven<Catalog>{
	private static final long serialVersionUID = 1L;
	
	@Resource(name="catalogService")
	public CatalogService cService;
	
	/* 模型驱动获取数据 */
	public Catalog catalog = new Catalog();
	@Override
	public Catalog getModel() {
		return catalog;
	}
	
	/* 向值栈中放入Catalog数据 */
	public Catalog getCatalog() {
		return catalog;
	}
	
	public List<Catalog> cList;
	public List<Catalog> getcList() {
		return cList;
	}

	@SuppressWarnings("all")
	public String findAll(){
		cList = cService.findAll();
		return "findall";
	}
	
	public String findById() {
		catalog = cService.findById(catalog);
		return "edit";
	}
	
	public String addOrUpdate() {
		if(cService.addOrUpdate(catalog)){
			return "list";
		}
		return "edit";
	}
	
	public String delete() {
		cService.delete(catalog);
		return "list";
	}

}
