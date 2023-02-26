package com.dto;

public class gpmproj {
private int gpm_id;
private int pro_id;
public gpmproj() {
	super();
	// TODO Auto-generated constructor stub
}
public gpmproj(int gpm_id, int pro_id) {
	super();
	this.gpm_id = gpm_id;
	this.pro_id = pro_id;
}
public int getGpm_id() {
	return gpm_id;
}
public void setGpm_id(int gpm_id) {
	this.gpm_id = gpm_id;
}
public int getPro_id() {
	return pro_id;
}
public void setPro_id(int pro_id) {
	this.pro_id = pro_id;
}
@Override
public String toString() {
	return "gpmproj [gpm_id=" + gpm_id + ", pro_id=" + pro_id + "]";
}

}
