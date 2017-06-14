package com.news.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.Service.ArticleService;
import com.news.Service.CatalogService;
import com.news.entity.Article;
import com.news.entity.Catalog;
import com.news.util.PageBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller(value="articleAction")
@Scope("prototype")
public class ArticleAction extends ActionSupport implements ModelDriven<Article>{
	private static final long serialVersionUID = 1L;
	
	@Resource(name="articleService")
	private ArticleService aService;
	
	@Resource(name="catalogService")
	public CatalogService cService;
	
	private Article article = new Article();
	@Override
	public Article getModel() {
		return article;
	}
	public Article getArticle() {
		return article;
	}
	
	private List<Catalog> clist;
	public List<Catalog> getClist() {
		return clist;
	}
	
	private PageBean pageBean;
	public PageBean getPageBean() {
		return pageBean;
	}
	
	private Integer page = 1;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}

	private List<Article> alist;
	public List<Article> getAlist() {
		return alist;
	}

	public String findAllPage(){
		int pageSize = 10;
		pageBean = aService.findAllLimit(page, pageSize);
		return "findallpage";
	}

	public String toAdd() {
		clist = cService.findAll();
		return "edit";
	}

	public String addOrUpdate() {
		aService.addOrUpdate(article);
		return "alist";
	}
	
	public String findById(){
		article = aService.findById(article);
		clist = cService.findAll();
		return "edit";
	}
	
	public String delete() {
		aService.delete(article);
		return "alist";
	}
	

}
