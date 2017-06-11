package com.news.Dao;

import java.util.List;

import com.news.entity.Catalog;

public interface CatalogDao {
	
	Catalog findbyid(int id);
	
	boolean add(Catalog catalog);
	
	boolean update(Catalog catalog);
	
	boolean delete(int id);
	
	List<Catalog> findall();
	
	boolean addorupdate(Catalog catalog);

	int findCount();

	List<Catalog> findLimit(int begin, int pageSize);
	
}
