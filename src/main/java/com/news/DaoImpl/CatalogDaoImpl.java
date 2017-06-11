package com.news.DaoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.news.Dao.CatalogDao;
import com.news.entity.Catalog;

public class CatalogDaoImpl extends HibernateDaoSupport implements CatalogDao{

	@Override
	public Catalog findbyid(int id) {
		return this.getHibernateTemplate().get(Catalog.class, id);
	}

	@Override
	public boolean add(Catalog catalog) {
		int ser = (Integer) this.getHibernateTemplate().save(catalog);
		if(ser > 0) 
			return true;
		return false;
	}

	@Override
	public boolean update(Catalog catalog) {
		this.getHibernateTemplate().update(catalog);
		return true;
	}

	@Override
	public boolean delete(int id) {
		Catalog catalog = this.getHibernateTemplate().get(Catalog.class, id);
		this.getHibernateTemplate().delete(catalog);
		return true;
	}

	@SuppressWarnings("all")
	@Override
	public List<Catalog> findall() {
		List<Catalog> list = (List<Catalog>) this.getHibernateTemplate().find("from Catalog");
		return list;
	}

	@Override
	public boolean addorupdate(Catalog catalog) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Catalog> findLimit(int begin, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
