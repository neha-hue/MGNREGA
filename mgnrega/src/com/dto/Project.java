package com.dto;


import java.time.LocalDate;

public interface Project {
	public int getProjid();
	public void setProjid(int projid);
	public String getName();
	public void setName(String name);
	public String getProdesc();
	public void setProdesc(String prodesc) ;
	
	public LocalDate getDate();
	public void setDate(LocalDate date);
	public int getProjDuration();
	public void setProjDuration(int projDuration);
}
