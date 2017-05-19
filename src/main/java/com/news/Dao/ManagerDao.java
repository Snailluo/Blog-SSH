package com.news.Dao;

import java.util.List;

import com.news.entity.Manager;

public interface ManagerDao {
	
	/**
	 * 管理员登录
	 * @param name
	 * @param pwd
	 * @return TRUE or FALSE
	 */
	public boolean login(String name,String pwd);
	
	/**
	 * 根据id查询单条记录
	 * @param id
	 * @return Manager对象
	 */
	public Manager findbyid(int id);
	
	/**
	 * 增加记录
	 * @param manager
	 * @return
	 */
	public boolean add(Manager manager);
	
	/**
	 * 更新数据
	 * @param manager
	 * @return
	 */
	public boolean update(Manager manager);
	
	/**
	 * 删除数据
	 * @param id
	 * @return
	 */
	public boolean delete(int id);
	
	/**
	 * 查询全部数据
	 * @return
	 */
	public List<Manager> findall();
	
	/**
	 * 增加或修改数据
	 * @param manager
	 * @return
	 */
	public boolean addorupdate(Manager manager);
	
}
