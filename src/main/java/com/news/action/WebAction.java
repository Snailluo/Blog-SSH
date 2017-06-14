package com.news.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.Service.ArticleService;
import com.news.entity.Article;
import com.news.util.PageBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller(value="webAction")
@Scope("prototype")
public class WebAction extends ActionSupport implements ModelDriven<Article>{
	private static final long serialVersionUID = 1L;
	
	@Resource(name="articleService")
	private ArticleService aService;
	
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
	
	private Article article = new Article();
	@Override
	public Article getModel() {
		return article;
	}
	public Article getArticle() {
		return article;
	}
	
	public String index(){
		int pageSize = 3;
		pageBean = aService.findAllLimit(page, pageSize);
		return "index";
	}
	
	public String article(){
		article = aService.findById(article);
		return "article";
	}
	
	public String articleList(){
		int pageSize = 10;
		pageBean = aService.findAllLimit(page, pageSize);
		return "articleList";
	}
	

}
