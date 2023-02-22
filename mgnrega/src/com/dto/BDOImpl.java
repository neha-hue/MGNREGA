package com.dto;

public class BDOImpl implements BDO {
private int id;
private String username;
private String password;
private String location;
private String email;
public BDOImpl() {
	
}
public BDOImpl(int id, String username, String password, String location,String email) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.location = location;
	this.email=email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
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

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "BDOImpl [id=" + id + ", username=" + username + ", password=" + password + ", location=" + location
			+ ", email=" + email + "]";
}



}
