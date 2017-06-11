package com.news.Dao;

import java.util.List;

import com.news.entity.Article;

public interface ArticleDao {
	
	Article findbyid(int id);
	
	boolean add(Article article);
	
	boolean update(Article article);
	
	boolean delete(int id);
	
	List<Article> findall();
	
	boolean addorupdate(Article article);

	int findCount();

	List<Article> findLimit(int begin, int pageSize);
	
}
