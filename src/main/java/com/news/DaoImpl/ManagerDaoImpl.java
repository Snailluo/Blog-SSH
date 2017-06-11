package com.news.DaoImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.news.Dao.ManagerDao;
import com.news.entity.Manager;

@SuppressWarnings("unchecked")
public class ManagerDaoImpl extends HibernateDaoSupport implements ManagerDao{
	
	@Override
	public boolean login(String name, String pwd) {
		List<Manager> list = 
				(List<Manager>) this.getHibernateTemplate().find("from Manager where managerName=? and managerPwd=?",name,pwd);
		if(list.size() > 0)
			return true;
		return false;
	}

	@Override
	public Manager findbyid(int id) {
		Manager manager = this.getHibernateTemplate().get(Manager.class, id);
		return manager;
	}

	@Override
	public boolean add(Manager manager) {
		int ser = (Integer) this.getHibernateTemplate().save(manager);
		if(ser > 0) 
			return true;
		return false;
	}

	@Override
	public boolean update(Manager manager) {
		this.getHibernateTemplate().update(manager);
		return true;
	}

	@Override
	public boolean delete(int id) {
		Manager manager = this.getHibernateTemplate().get(Manager.class, id);
		this.getHibernateTemplate().delete(manager);
		return true;
	}

	@Override
	public List<Manager> findall() {
		List<Manager> list = (List<Manager>) this.getHibernateTemplate().find("from Manager");
		return list;
	}

	@Override
	public boolean addorupdate(Manager manager) {
		this.getHibernateTemplate().saveOrUpdate(manager);
		return true;
	}

	@Override
	public int findCount() {
		List<Object> list = (List<Object>) this.getHibernateTemplate().find("select count(*) from Manager");
		if(list != null && list.size() != 0) {
			Object obj = list.get(0);
			Long lobj = (Long) obj;
			return lobj.intValue();
		}
		return 0;
	}

	@Override
	public List<Manager> findLimit(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Manager.class);
		List<Manager> list = 
				(List<Manager>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

}
