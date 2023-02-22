package com.dto;

public class EmpProject {
	private int empid;
	private String ename;
	private int age;
	private String location;
	private int wages;
	private String mobilno;
	private int days;



	private int projid;
	private String name;
	private String prodesc;
	public EmpProject() {
		
	}
	
	public EmpProject(int empid, String ename, int age, String location, int wages, String mobilno, int days,
			int projid, String name, String prodesc) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.age = age;
		this.location = location;
		this.wages = wages;
		this.mobilno = mobilno;
		this.days = days;
		this.projid = projid;
		this.name = name;
		this.prodesc = prodesc;
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
	public int getProjid() {
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProdesc() {
		return prodesc;
	}
	public void setProdesc(String prodesc) {
		this.prodesc = prodesc;
	}
	@Override
	public String toString() {
		return "EmpProject [empid=" + empid + ", ename=" + ename + ", age=" + age + ", location=" + location
				+ ", wages=" + wages + ", mobilno=" + mobilno + ", days=" + days + ", projid=" + projid + ", name="
				+ name + ", prodesc=" + prodesc + "]";
	}
	
}
