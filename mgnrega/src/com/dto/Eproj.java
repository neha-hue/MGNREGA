package com.dto;

public class Eproj {
private int emp_id;
private int p_id;
public Eproj() {
	super();
	// TODO Auto-generated constructor stub
}
public Eproj(int emp_id, int p_id) {
	super();
	this.emp_id = emp_id;
	this.p_id = p_id;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
@Override
public String toString() {
	return "Eproj [emp_id=" + emp_id + ", p_id=" + p_id + "]";
}

}
