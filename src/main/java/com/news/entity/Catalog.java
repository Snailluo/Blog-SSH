package com.news.entity;

import java.util.HashSet;
import java.util.Set;

public class Catalog {

	private Integer caid;
	private String caname;
	private String canumber;
	private String castate;
	
	//������Ŀʵ�����б�ʾ��ƪ����
	//HibernateҪ��ʹ��SET���ϱ�ʾ�������
	private Set<Article> setArticle = new HashSet<Article>();
	public Set<Article> getSetArticle() {
		return setArticle;
	}
	public void setSetArticle(Set<Article> setArticle) {
		this.setArticle = setArticle;
	}
	
	public Integer getCaid() {
		return caid;
	}
	public void setCaid(Integer caid) {
		this.caid = caid;
	}
	public String getCaname() {
		return caname;
	}
	public void setCaname(String caname) {
		this.caname = caname;
	}
	public String getCanumber() {
		return canumber;
	}
	public void setCanumber(String canumber) {
		this.canumber = canumber;
	}
	public String getCastate() {
		return castate;
	}
	public void setCastate(String castate) {
		this.castate = castate;
	}
	
}
