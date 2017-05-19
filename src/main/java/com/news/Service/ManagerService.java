package com.news.Service;

import java.util.List;

import com.news.entity.Manager;

public interface ManagerService {

	public boolean login(Manager manager);
	public List<Manager> findAll();
	public Manager findById(Manager manager);
	public boolean addOrUpdate(Manager manager);
	public boolean delete(Manager manager);
	
}
