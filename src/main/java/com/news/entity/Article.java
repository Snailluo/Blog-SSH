package com.news.entity;

public class Article {

	private Integer arid;
	private String arnumber;
	private String artitle;
	private String arcontent;
	private String aruser;
	private String artime;
	private String arstate;
	private Integer clicks;
	
	//
	private Catalog catalog;
	public Catalog getCatalog() {
		return catalog;
	}
	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
	public Article(Integer arid, String arnumber, String artitle, String arcontent, String aruser) {
		super();
		this.arid = arid;
		this.arnumber = arnumber;
		this.artitle = artitle;
		this.arcontent = arcontent;
		this.aruser = aruser;
	}
	public Article() {
		super();
	}
	public Integer getArid() {
		return arid;
	}
	public void setArid(Integer arid) {
		this.arid = arid;
	}
	public String getArnumber() {
		return arnumber;
	}
	public void setArnumber(String arnumber) {
		this.arnumber = arnumber;
	}
	public String getArtitle() {
		return artitle;
	}
	public void setArtitle(String artitle) {
		this.artitle = artitle;
	}
	public String getArcontent() {
		return arcontent;
	}
	public void setArcontent(String arcontent) {
		this.arcontent = arcontent;
	}
	public String getAruser() {
		return aruser;
	}
	public void setAruser(String aruser) {
		this.aruser = aruser;
	}
	public String getArtime() {
		return artime;
	}
	public void setArtime(String artime) {
		this.artime = artime;
	}
	public String getArstate() {
		return arstate;
	}
	public void setArstate(String arstate) {
		this.arstate = arstate;
	}
	public Integer getClicks() {
		return clicks;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	
}
