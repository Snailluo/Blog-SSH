package com.news.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.news.Dao.ArticleDao;
import com.news.Service.ArticleService;
import com.news.entity.Article;
import com.news.util.PageBean;

@Service(value="articleService")
@Transactional
public class ArticleServiceImpl implements ArticleService {
	
	@Resource(name="ArticleDao")
	public ArticleDao aDao;

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article findById(Article article) {
		if(article.getArid() == 0){
			return new Article();
		} else {
			int id = article.getArid();
			return aDao.findbyid(id); 
		}
	}

	@Override
	public boolean addOrUpdate(Article article) {
		
		if(article.getArid() == 0){
			return aDao.add(article);
		} else {
			return aDao.update(article);
		}
		
	}

	@Override
	public boolean delete(Article article) {
		
		return aDao.delete(article.getArid()); 
		
	}

	@Override
	public PageBean findAllLimit(Integer page) {
		
		int count = aDao.findCount();
		int pageSize = 10;
		int pageCount;
		
		pageCount = (count % pageSize == 0) ? (count/pageSize) : (count/pageSize + 1);
		
		int begin = (page-1)*pageSize;
		List<Article> list = aDao.findLimit(begin, pageSize);
		
		return new PageBean(pageCount, page, count, list);
	}

}
