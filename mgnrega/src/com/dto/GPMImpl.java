package com.dto;

public class GPMImpl implements GPM {
private int gpmid;
private String name;
private String email;
private String password;
private String location;
private String mobileno;
private int prid;
public GPMImpl() {
	
}
public GPMImpl(int gpmid, String name, String email, String password, String location, String mobileno,int prid) {
	super();
	this.gpmid = gpmid;
	this.name = name;
	this.email = email;
	this.password = password;
	this.location = location;
	this.mobileno = mobileno;
	this.prid=prid;
}
public int getGpmid() {
	return gpmid;
}
public void setGpmid(int gpmid) {
	this.gpmid = gpmid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public int getPrid() {
	return prid;
}
public void setPrid(int prid) {
	this.prid = prid;
}
@Override
public String toString() {
	return "GPMImpl [gpmid=" + gpmid + ", name=" + name + ", email=" + email + ", password=" + password + ", location="
			+ location + ", mobileno=" + mobileno + ", prid=" + prid + "]";
}







}
