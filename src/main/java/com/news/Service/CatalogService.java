package com.news.Service;

import java.util.List;

import com.news.entity.Catalog;
import com.news.util.PageBean;

public interface CatalogService {

	List<Catalog> findAll();
	Catalog findById(Catalog catalog);
	boolean addOrUpdate(Catalog catalog);
	boolean delete(Catalog catalog);
	PageBean findAllLimit(Integer page);
	
}
