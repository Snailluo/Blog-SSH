package com.news.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.Service.CatalogService;
import com.news.entity.Catalog;
import com.opensymphony.xwork2.ActionSupport;

@Controller(value="CatalogAction")
@Scope("prototype")
public class CatalogAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="catalogService")
	public CatalogService cService;
	
	public List<Catalog> cList;
	public List<Catalog> getcList() {
		return cList;
	}

	@SuppressWarnings("all")
	public String findAll(){
		cList = cService.findAll();
		return "findall";
	}
	

}
