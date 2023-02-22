package com.dto;

public class EmployeeImpl implements Employee {
private int empid;
private String ename;
private int age;
private String location;
private int wages;
private String mobilno;
private int days;
//private int pid;
public EmployeeImpl() {
	
}
public EmployeeImpl(int wages,int days) {
	this.wages=wages;
	this.days=days;
}
public EmployeeImpl(int empid, String ename, int age, String location, int wages, String mobilno, int days) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.age = age;
	this.location = location;
	this.wages = wages;
	this.mobilno = mobilno;
	this.days = days;
//	this.pid = pid;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getWages() {
	return wages;
}
public void setWages(int wages) {
	this.wages = wages;
}
public String getMobilno() {
	return mobilno;
}
public void setMobilno(String mobilno) {
	this.mobilno = mobilno;
}
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
//public int getPid() {
//	return pid;
//}
//public void setPid(int pid) {
//	this.pid = pid;
//}
@Override
public String toString() {
	return "EmployeeImpl [empid=" + empid + ", ename=" + ename + ", age=" + age + ", location=" + location + ", wages="
			+ wages + ", mobilno=" + mobilno + ", days=" + days + "]";
	
}






}
