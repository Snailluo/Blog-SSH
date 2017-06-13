package com.news.Service;

import java.util.List;

import com.news.entity.Manager;
import com.news.util.PageBean;

public interface ManagerService {

	boolean login(Manager manager);
	List<Manager> findAll();
	Manager findById(Manager manager);
	Manager findByName(Manager manager);
	boolean addOrUpdate(Manager manager);
	boolean delete(Manager manager);
	PageBean findAllLimit(Integer page);
	
}
