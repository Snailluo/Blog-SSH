package com.news.Dao;

import java.util.List;

import com.news.entity.Manager;

/**
 * Manager类的Dao层接口
 * 
 * @author xnlo
 * @version 1.0
 */
public interface ManagerDao {
	
	/**
	 * 登录方法
	 * 传入用户名及密码进行判断
	 * 
	 * @param name 用户的用户名
	 * @param pwd  用户密码
	 * @return 登录成功返回true 登录失败返回false
	 */
	boolean login(String name,String pwd);
	
	/**
	 * 根据id查询记录
	 * 
	 * @param 数据的id属性
	 * @return 根据id查询到的Manager对象
	 */
	Manager findbyid(int id);
	
	/**
	 * 增加记录
	 * 
	 * @param manager 要增加的Manager类
	 * @return 操作成功返回true，操作失败返回false
	 */
	boolean add(Manager manager);
	
	/**
	 * 更新数据
	 * 
	 * @param manager 包含修改后数据的Manager类
	 * @return 操作成功返回true，操作失败返回false
	 */
	boolean update(Manager manager);
	
	/**
	 * 删除数据
	 * 
	 * @param id
	 * @return 操作成功返回true，操作失败返回false
	 */
	boolean delete(int id);
	
	/**
	 * 查询全部数据
	 * 
	 * @return 所有记录的list集合
	 */
	List<Manager> findall();
	
	/**
	 * 增加或修改数据
	 * Manager类中包含id值进行修改操作
	 * 不包含id值则进行添加操作
	 * 
	 * @param manager 包含添加或修改的数据的Manager类
	 * @return 操作成功返回true，操作失败返回false
	 */
	boolean addorupdate(Manager manager);

	/**
	 * 查询总纪录数
	 * 
	 * @return 该数据表的全部记录数
	 */
	int findCount();

	/**
	 * 进行分页处理后的查询全部记录
	 * 
	 * @param pageSize 每页的记录数
	 * @param begin 翻页的开始位置
	 * @return 分页后数据的list集合
	 */
	List<Manager> findLimit(int begin, int pageSize);
	
}
