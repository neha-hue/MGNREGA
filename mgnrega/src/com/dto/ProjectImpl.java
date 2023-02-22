package com.dto;


import java.time.LocalDate;

public class ProjectImpl implements Project {
private int projid;
private String name;
private int projDuration;
private String prodesc;

private LocalDate date;
public ProjectImpl() {
	
}

public ProjectImpl(int projid, String name, String prodesc, LocalDate date,int projDuration) {
	super();
	this.projid = projid;
	this.name = name;
	this.projDuration=projDuration;
	this.prodesc = prodesc;
	
	this.date = date;
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

public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public int getProjDuration() {
	return projDuration;
}
public void setProjDuration(int projDuration) {
	this.projDuration = projDuration;
}
@Override
public String toString() {
	return "ProjectImpl [projid=" + projid + ", name=" + name + ", projDuration=" + projDuration + ", prodesc="
			+ prodesc + ", date=" + date + "]";
}


}
