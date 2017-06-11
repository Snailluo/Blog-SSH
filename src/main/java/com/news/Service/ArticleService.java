package com.news.Service;

import java.util.List;

import com.news.entity.Article;
import com.news.util.PageBean;

public interface ArticleService {

	List<Article> findAll();
	Article findById(Article article);
	boolean addOrUpdate(Article article);
	boolean delete(Article article);
	PageBean findAllLimit(Integer page);
	
}
