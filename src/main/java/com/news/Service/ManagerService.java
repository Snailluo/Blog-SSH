package com.news.Service;

import java.util.List;

import com.news.entity.Manager;
import com.news.util.PageBean;

public interface ManagerService {

	public boolean login(Manager manager);
	public List<Manager> findAll();
	public Manager findById(Manager manager);
	public boolean addOrUpdate(Manager manager);
	public boolean delete(Manager manager);
	public PageBean findAllLimit(Integer page);
	
}
