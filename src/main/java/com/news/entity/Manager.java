package com.news.entity;

public class Manager {
	
	private Integer mid;
	private String managerName;
	private String managerPwd;
	private String managerMstate;
	
	public Manager() {
		super();
	}

	public Manager(String managerName, String managerPwd, String managerMstate) {
		this.managerName = managerName;
		this.managerPwd = managerPwd;
		this.managerMstate = managerMstate;
	}
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerPwd() {
		return managerPwd;
	}
	public void setManagerPwd(String managerPwd) {
		this.managerPwd = managerPwd;
	}
	public String getManagerMstate() {
		return managerMstate;
	}
	public void setManagerMstate(String managerMstate) {
		this.managerMstate = managerMstate;
	}

	
	

}
