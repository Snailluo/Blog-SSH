package com.news.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.news.Service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;

@Controller(value="articleAction")
@Scope("prototype")
public class ArticleAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="articleService")
	public ArticleService aService;

}
