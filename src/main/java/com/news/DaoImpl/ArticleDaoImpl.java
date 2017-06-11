package com.news.DaoImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.news.Dao.ArticleDao;
import com.news.entity.Article;

public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao{

	@Override
	public Article findbyid(int id) {
		return this.getHibernateTemplate().get(Article.class, id);
	}

	@Override
	public boolean add(Article article) {
		int ser = (Integer) this.getHibernateTemplate().save(article);
		if(ser > 0) 
			return true;
		return false;
	}

	@Override
	public boolean update(Article article) {
		this.getHibernateTemplate().update(article);
		return true;
	}

	@Override
	public boolean delete(int id) {
		Article article = this.getHibernateTemplate().get(Article.class, id);
		this.getHibernateTemplate().delete(article);
		return true;
	}

	@Override
	public List<Article> findall() {
		return null;
	}

	@Override
	public boolean addorupdate(Article article) {
		return false;
	}

	@Override
	@SuppressWarnings("unchecked")
	public int findCount() {
		List<Object> list = (List<Object>) this.getHibernateTemplate().find("select count(*) from Article");
		if(list != null && list.size() != 0) {
			Object obj = list.get(0);
			Long lobj = (Long) obj;
			return lobj.intValue();
		}
		return 0;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Article> findLimit(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Article.class);
		List<Article> list = 
				(List<Article>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	

}
