package com.news.ServiceImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
			int id = article.getArid();
			return aDao.findbyid(id); 
	}

	@Override
	public boolean addOrUpdate(Article article) {
		
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=format.format(date);
		
		article.setArtime(time);
		
		if(article.getArid() == null || article.getArid() == 0){
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
	public PageBean findAllLimit(Integer page, int pageSize) {
		
		int count = aDao.findCount();
		int pageCount;
		
		pageCount = (count % pageSize == 0) ? (count/pageSize) : (count/pageSize + 1);
		
		int begin = (page-1)*pageSize;
		List<Article> list = aDao.findLimit(begin, pageSize);
		
		String regxpForHtml = "<([^>]*)>"; // 过滤所有以<开头以>结尾的标签
		
		for (Article article : list) {
			
			Pattern pattern = Pattern.compile(regxpForHtml);   
	        Matcher matcher = pattern.matcher(article.getArcontent());
	        String s = matcher.replaceAll("");
	        if(s.length()>10){
	        	s = s.substring(0, 10);
	        }
	        article.setArcontent(s);
	        
		}
		
		return new PageBean(pageCount, page, count, list);
	}

}
