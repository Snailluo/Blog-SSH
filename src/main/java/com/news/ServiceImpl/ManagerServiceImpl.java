package com.news.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.news.Dao.ManagerDao;
import com.news.Service.ManagerService;
import com.news.entity.Manager;
import com.news.util.PageBean;

@Service(value="managerService")
@Transactional
public class ManagerServiceImpl implements ManagerService{
	
	@Resource(name="managerDao")
	public ManagerDao mdao;

	@Override
	public boolean login(Manager manager) {
		String name,pwd;
		name = manager.getManagerName();
		pwd  = manager.getManagerPwd();
		return mdao.login(name, pwd);
	}

	@Override
	public List<Manager> findAll() {
		return mdao.findall();
	}

	@Override
	public Manager findById(Manager manager) {
		
		if(manager.getMid() == 0) {
			return new Manager("", "", "");
		} else {
			int id = manager.getMid();
			return mdao.findbyid(id);
		}
		
	}

	@Override
	public boolean addOrUpdate(Manager manager) {
		
		if(manager.getMid() == 0) {
			return mdao.add(manager);
		} else {
			return mdao.update(manager);
		}
		
	}

	@Override
	public boolean delete(Manager manager) {
		
		int id = manager.getMid();
		return mdao.delete(id);	
	}

	@Override
	public PageBean findAllLimit(Integer page) {
		int totalCount = mdao.findCount();
		int pageSize = 5;
		int pageCount = 0;
		/**
		 * 三元运算
		 * if 总记录数能整除每页记录数
		 *     总页数 = 总记录数 / 每页记录数
		 * else
		 *     总页数 = 总记录数 / 每页记录数 + 1
		 */
		pageCount = (totalCount % pageSize == 0) ? (totalCount/pageSize) : (totalCount/pageSize + 1);
		
		int begin = (page-1)*pageSize;
		List<Manager> list = mdao.findLimit(begin,pageSize);
		return new PageBean(pageCount, page, totalCount, list);
	}

	

}
