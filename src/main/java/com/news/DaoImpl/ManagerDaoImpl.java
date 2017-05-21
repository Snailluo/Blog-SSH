package com.news.DaoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.news.Dao.ManagerDao;
import com.news.entity.Manager;

@Repository(value="managerDao")
public class ManagerDaoImpl implements ManagerDao{
	
	//得到hibernateTemplate对象
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean login(String name, String pwd) {

		List<Manager> list = (List<Manager>) hibernateTemplate.find("from Manager where managerName=? and managerPwd=?",name,pwd);
		
		if(list.size() > 0)
			return true;
		
		return false;
	}

	@Override
	public Manager findbyid(int id) {
		
		Manager manager = hibernateTemplate.get(Manager.class, id);
		return manager;
		
	}

	@Override
	public boolean add(Manager manager) {
		
		int ser = (Integer) hibernateTemplate.save(manager);
		
		if(ser > 0) 
			return true;
		
		return false;
		
	}

	@Override
	public boolean update(Manager manager) {
		
		hibernateTemplate.update(manager);

		return true;
	
	}

	@Override
	public boolean delete(int id) {
		
		Manager manager = hibernateTemplate.get(Manager.class, id);
		hibernateTemplate.delete(manager);
		
		return true;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Manager> findall() {
		
		List<Manager> list = (List<Manager>) hibernateTemplate.find("from Manager");
		return list;
		
	}

	@Override
	public boolean addorupdate(Manager manager) {
		
		hibernateTemplate.saveOrUpdate(manager);
		return true;

		
	}

}
