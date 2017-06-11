package com.news.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.news.Dao.CatalogDao;
import com.news.Service.CatalogService;
import com.news.entity.Catalog;
import com.news.util.PageBean;

@Service(value="catalogService")
@Transactional
public class CatalogServiceImpl implements CatalogService{
	
	@Resource(name="CatalogDao")
	public CatalogDao cDao;

	@Override
	public List<Catalog> findAll() {
		return cDao.findall();
	}

	@Override
	public boolean addOrUpdate(Catalog catalog) {
		if(catalog.getCaid() == 0){
			return cDao.add(catalog);
		} else {
			return cDao.update(catalog);
		}
	}

	@Override
	public boolean delete(Catalog catalog) {
		return cDao.delete(catalog.getCaid());
	}

	@Override
	public Catalog findById(Catalog catalog) {
		return cDao.findbyid(catalog.getCaid());
	}
	
	@Override
	public PageBean findAllLimit(Integer page) {
		// TODO Auto-generated method stub
		return null;
	}

}
