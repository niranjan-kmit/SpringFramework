package com.niranjan.spring.web.Dao;

public class jobsadda {
	private int id;
	private String company;
	private String postdate;
	private String lastdate;
	private String place;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public String getLastdate() {
		return lastdate;
	}
	public void setLastdate(String lastdate) {
		this.lastdate = lastdate;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "jobsadda [id=" + id + ", company=" + company + ", postdate="
				+ postdate + ", lastdate=" + lastdate + ", place=" + place
				+ "]";
	}
	
	
	
    

}
