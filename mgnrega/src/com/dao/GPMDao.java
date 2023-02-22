package com.dao;


import java.util.List;

import com.dto.EmpProject;
import com.dto.Employee;


public interface GPMDao {
	public boolean loginGPM(String email,String password);
	public String addEmployee(Employee emp) ;
	public List<Employee> getAllEmployee();
	public String assignEmpToProj(int empid,int projid);
	public List<Employee> viewTotalDaysandWages(int empid);

}
