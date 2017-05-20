package com.news.Dao;

import java.util.List;

import com.news.entity.Manager;

public interface ManagerDao {
	
	/**
	 * ����Ա��¼
	 * @param name
	 * @param pwd
	 * @return TRUE or FALSE
	 */
	public boolean login(String name,String pwd);
	
	/**
	 * ����id��ѯ������¼
	 * @param id
	 * @return Manager����
	 */
	public Manager findbyid(int id);
	
	/**
	 * ���Ӽ�¼
	 * @param manager
	 * @return
	 */
	public boolean add(Manager manager);
	
	/**
	 * ��������
	 * @param manager
	 * @return
	 */
	public boolean update(Manager manager);
	
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	public boolean delete(int id);
	
	/**
	 * ��ѯȫ������
	 * @return
	 */
	public List<Manager> findall();
	
	/**
	 * ���ӻ��޸�����
	 * @param manager
	 * @return
	 */
	public boolean addorupdate(Manager manager);
	
}
