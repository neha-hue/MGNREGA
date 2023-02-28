package com.dao;


import java.util.List;

import com.dto.EmpProject;
import com.dto.Employee;
import com.dto.Eproj;
import com.dto.GPM;
import com.dto.Project;

public interface BDODao  {
	public boolean loginBDO(String email,String password);
	public String addProject(Project proj);

	public List<Project> getAllProject();
	public String addGPM(GPM gpm);
	public String addEproj(Eproj eproj);


	public List<GPM> getAllGPM() ;
	public String assignProjToGpm(int projid,int gpmid);
	public List<Employee> getAllEmployee(int empid);
	
	
	
	
}
