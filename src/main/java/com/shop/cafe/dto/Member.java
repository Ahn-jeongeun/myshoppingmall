package com.shop.cafe.dto;

import java.sql.Date;

public class Member {
	
	private String type, id, pwd, name, address, phone, email;
	private Date registDate;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String type, String id, String pwd, String name, String address, String phone, String email,
			Date registDate) {
		super();
		this.type = type;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.registDate = registDate;
	}
	@Override
	public String toString() {
		return "Member [type=" + type + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + ", registDate=" + registDate + "]";
	}
	

}
