package com.news.util;

import java.util.List;

import com.news.entity.Manager;

@SuppressWarnings("rawtypes")
public class PageBean {

	/** 
	 * ��ҳ�����ҳ��
	 */
	private Integer pageCount;
	/** 
	 * ÿһҳ�ļ�¼��
	 */
	private Integer pageSize;
	/**
	 * ��ǰҳ
	 */
	private Integer page;
	/**
	 * �ܼ�¼��
	 */
	private Integer totalCount;
	/**
	 * ��ҳ��ѯ�Ŀ�ʼλ�� 
	 */
	private Integer begin;
	/**
	 * ��ҳ��ѯ�������list���� 
	 */
	private List list;
	
	/**
	 * �޲εĹ��캯�� 
	 */
	public PageBean() {
		super();
	}
	
	/**
	 * �вεĹ��캯��
	 * ����ҳ��Ҫ��ʾ������
	 * 
	 * @param pageCount ��ҳ��
	 * @param page ��ǰҳ
	 * @param totalCount �ܼ�¼��
	 * @param list ��ҳ��ѯ�������List����
	 */
	public PageBean(Integer pageCount, Integer page, Integer totalCount, List list) {
		super();
		this.pageCount = pageCount;
		this.page = page;
		this.totalCount = totalCount;
		this.list = list;
	}
	
	/**
	 * �����������ݵĹ��캯��
	 * 
	 * @param pageCount
	 * @param pageSize
	 * @param page
	 * @param totalCount
	 * @param begin
	 * @param list
	 */
	public PageBean(Integer pageCount, Integer pageSize, Integer page, Integer totalCount, Integer begin,
			List list) {
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
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	
	
}
