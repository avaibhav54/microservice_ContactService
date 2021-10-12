package com.contact.entities;

public class contact {

	private int cid;
	private String email;
	private String contactname;
	private int  uid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public contact(int cid, String email, String contactname, int uid) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactname = contactname;
		this.uid = uid;
	}
	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
