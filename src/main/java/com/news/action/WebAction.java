package com.news.action;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	private String key;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	@SuppressWarnings("unchecked")
	public String index(){
		String regxpForHtml = "<([^>]*)>"; // 过滤所有以<开头以>结尾的标签
		int pageSize = 3;
		pageBean = aService.findAllLimit(page, pageSize);
		List<Article> htmlList = pageBean.getList();
		
		for (Article article : htmlList) {
			
			Pattern pattern = Pattern.compile(regxpForHtml);   
	        Matcher matcher = pattern.matcher(article.getArcontent());
	        String s = matcher.replaceAll("");
	        if(s.length()>10){
	        	s = s.substring(0, 10);
	        }
	        article.setArcontent(s);
			
		}
		
		pageBean.setList(htmlList);
		return "index";
	}
	
	public String article(){
		article = aService.findById(article);
		return "article";
	}
	
	@SuppressWarnings("unchecked")
	public String articleList(){
		String regxpForHtml = "<([^>]*)>"; // 过滤所有以<开头以>结尾的标签
		int pageSize = 10;
		pageBean = aService.findAllLimit(page, pageSize);
		List<Article> htmlList = pageBean.getList();
		
		for (Article article : htmlList) {
			
			Pattern pattern = Pattern.compile(regxpForHtml);   
	        Matcher matcher = pattern.matcher(article.getArcontent());
	        String s = matcher.replaceAll("");
	        if(s.length()>10){
	        	s = s.substring(0, 10);
	        }
	        article.setArcontent(s);
			
		}
		
		pageBean.setList(htmlList);
		
		return "articleList";
	}
	
	@SuppressWarnings("unchecked")
	public String search(){
		String regxpForHtml = "<([^>]*)>"; // 过滤所有以<开头以>结尾的标签
		int pageSize = 10;
		pageBean = aService.search(key, page, pageSize);
		List<Article> htmlList = pageBean.getList();
		
		for (Article article : htmlList) {
			
			Pattern pattern = Pattern.compile(regxpForHtml);   
	        Matcher matcher = pattern.matcher(article.getArcontent());
	        String s = matcher.replaceAll("");
	        if(s.length()>10){
	        	s = s.substring(0, 10);
	        }
	        article.setArcontent(s);
			
		}
		
		pageBean.setList(htmlList);
		
		return "articleList";
	}
	

}
