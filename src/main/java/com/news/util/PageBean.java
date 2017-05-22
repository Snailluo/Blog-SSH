package com.news.util;

import java.util.List;

import com.news.entity.Manager;

public class PageBean {

	//总页数
	private Integer pageCount;
	//每页记录数
	private Integer pageSize = 5;
	//当前页
	private Integer page;
	//总记录数
	private Integer totalCount;
	//开始位置
	private Integer begin;
	//返回的list集合
	private List<Manager> list;
	
	public PageBean() {
		super();
	}
	public PageBean(Integer pageCount, Integer page, Integer totalCount, List<Manager> list) {
		super();
		this.pageCount = pageCount;
		this.page = page;
		this.totalCount = totalCount;
		this.list = list;
	}
	public PageBean(Integer pageCount, Integer pageSize, Integer page, Integer totalCount, Integer begin,
			List<Manager> list) {
		super();
		this.pageCount = pageCount;
		this.pageSize = pageSize;
		this.page = page;
		this.totalCount = totalCount;
		this.begin = begin;
		this.list = list;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	public List<Manager> getList() {
		return list;
	}
	public void setList(List<Manager> list) {
		this.list = list;
	}
	
	
	
}
