package com.ui;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.dao.BDODao;
import com.dao.BDODaoImpl;
import com.dao.GPMDao;
import com.dao.GPMDaoImpl;
import com.dto.EmpProject;
import com.dto.Employee;
import com.dto.EmployeeImpl;
import com.dto.GPM;
import com.dto.GPMImpl;
import com.dto.Project;
import com.dto.ProjectImpl;

//public String loginBDO(String email,String password);
//public String addProject(Project proj);
//public List<Project> getAllProject();
//public String addGPM(GPM gpm);
//public List<GPM> getAllGPM() ;
//public String assignProjToGpm(int projid,int gpmid);
//public List<Employee> getAllEmployee() ;
//public String loginGPM(String email,String password);
//public String addEmployee(Employee emp) ;
//public List<Employee> getAllEmployee();
//public String assignEmpToProj(int empid,int projid);
//public Employee viewTotalDaysandWages();
public class Main {
public static void main(String[] args) {
	BDODao bd=new BDODaoImpl();
	GPMDao gp=new GPMDaoImpl();
	int c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("******************************************WELCOME TO MGNREGA*************************************************** ");
	System.out.println("select 1 for login BDO");
	System.out.println("select 2 for login gpm member");
	c=sc.nextInt();
	int choice=0;
	int choice1=0;
	if(c==1) {
		System.out.println("enter email");
		String emails=sc.next();
		System.out.println("enter password");
		String passwords=sc.next();
		//System.out.println(bd.loginBDO(email, password));
		
		if(emails.equalsIgnoreCase("neha@mail.com") & passwords.equalsIgnoreCase("neha")) {
			
			do {
				
				System.out.println("1. add project");
				System.out.println("2. view all project");
				System.out.println("3. add gpm");
				System.out.println("4. view all gpm");
				System.out.println("5. assignProjToGpm");
				System.out.println("6. view all employee");
				System.out.println("0. for Exit");
				System.out.print("Enter selection ");
				choice=sc.nextInt();
				if(choice==1) {
					System.out.println("enter id");
					int id=sc.nextInt();
					System.out.println("ente name");
					String name=sc.next();
					System.out.println("enter project description");
					String desc=sc.next();
//					System.out.println("enter nofodays");
//					int noOfDays=sc.nextInt();
					System.out.println("enter date");
					String date=sc.next();
					System.out.println("enter duration");
					int duration=sc.nextInt();
					bd.addProject(new ProjectImpl(id,name,desc,LocalDate.parse(date),duration));
				}
				else if(choice==2) {
					List<Project> list=bd.getAllProject();
					list.forEach(System.out::println);
					
				}
				else if(choice==3) {
					System.out.println("enter id");
					int id=sc.nextInt();
					System.out.println("enter name");
					String name=sc.next();
					System.out.println("enter email");
					String email=sc.next();
					System.out.println("enter password");
					String password=sc.next();
					System.out.println("enter location");
					String location=sc.next();
					System.out.println("enter mobilno");
					String mobilno=sc.next();
//					System.out.println("enter prid");
//					int prid=sc.nextInt();
					bd.addGPM(new GPMImpl(id,name,email,password,location,mobilno));
							
				}
				else if(choice==4) {
					List<GPM> list=bd.getAllGPM();
					list.forEach(System.out::println);
				}
				else if(choice==5) {
					System.out.println("enter projid");
					int projid=sc.nextInt();
					System.out.println("enter gpmid");
					int gpmid=sc.nextInt();
					bd.assignProjToGpm(projid, gpmid);
				}
				else if(choice==6) {
					System.out.println("enter name");
					String pname=sc.next();
					List<Employee> list=bd.getAllEmployee(pname);
					list.forEach(System.out::println);
				}
		}while(choice!=0);
		System.out.println("Thank you for visiting our services");
		sc.close();
		}
		else {
			System.out.println("invalid username and password");
		}
		
	}
	
	else if(c==2) {
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		//System.out.println(gp.loginGPM(email, password));
		if(gp.loginGPM(email, password)) {
			do {System.out.println("1. addEmployee");
			System.out.println("2. getAllEmployee");
			System.out.println("3. assignEmpToProj");
			System.out.println("4. viewTotalDaysandWages");
			System.out.println("0. for Exit");
			System.out.print("Enter selection ");
			choice1=sc.nextInt();
			
			
			if(choice1==1) {
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter age");
				int age=sc.nextInt();
				System.out.println("enter location");
				String location=sc.next();
				System.out.println("enter wages");
				int wages=sc.nextInt();
				System.out.println("enter mobilno");
				String mobilno=sc.next();
				System.out.println("enter days");
				int days=sc.nextInt();
//				System.out.println("enter pid");
//				int pid=sc.nextInt();
				gp.addEmployee(new EmployeeImpl(id,name,age,location,wages,mobilno,days));
			}
			else if(choice1==2) {
				List<Employee>list=gp.getAllEmployee();
				list.forEach(System.out::println);
			}
			else if(choice1==3) {
				System.out.println("enter empid");
				int empid=sc.nextInt();
				System.out.println("enter projid");
				int projid=sc.nextInt();
				gp.assignEmpToProj(empid, projid);
				
			}
			else if(choice1==4) {
				System.out.println("enter projid");
				int id=sc.nextInt();
				List<Employee>list=gp.viewTotalDaysandWages(id);
				list.forEach(System.out::println);
				
				
			
			}
				
			}while(choice1!=0);
			System.out.println("thank you for visiting our services");
		}
		else {
			System.out.println("invalid email and password");
		}
		
	}
	
	
	
	
	
//	int choice=0;
//	do {
//		System.out.println("1. login bdo");
//		System.out.println("2. add project");
//		System.out.println("3. view all project");
//		System.out.println("4. add gpm");
//		System.out.println("5. view all gpm");
//		System.out.println("6. assignProjToGpm");
//		System.out.println("7. view all employee");
//		
//		
//		System.out.println("8. loginGpm");
//		System.out.println("9. addEmployee");
//		System.out.println("10. getAllEmployee");
//		System.out.println("11. assignEmpToProj");
//		System.out.println("12. viewTotalDaysandWages");
//		System.out.println("0. for Exit");
//		System.out.print("Enter selection ");
//		choice=sc.nextInt();
//		if(choice==1) {
//			System.out.println("enter email");
//			String email=sc.next();
//			System.out.println("enter password");
//			String password=sc.next();
//			System.out.println(bd.loginBDO(email, password));
//			
//			
//		}
//		else if(choice==2) {
//			System.out.println("enter id");
//			int id=sc.nextInt();
//			System.out.println("ente name");
//			String name=sc.next();
//			System.out.println("enter project description");
//			String desc=sc.next();
////			System.out.println("enter nofodays");
////			int noOfDays=sc.nextInt();
//			System.out.println("enter date");
//			String date=sc.next();
//			System.out.println("enter duration");
//			int duration=sc.nextInt();
//			bd.addProject(new ProjectImpl(id,name,desc,LocalDate.parse(date),duration));
//		}
//		else if(choice==3) {
//			List<Project> list=bd.getAllProject();
//			list.forEach(System.out::println);
//			
//		}
//		else if(choice==4) {
//			System.out.println("enter id");
//			int id=sc.nextInt();
//			System.out.println("enter name");
//			String name=sc.next();
//			System.out.println("enter email");
//			String email=sc.next();
//			System.out.println("enter password");
//			String password=sc.next();
//			System.out.println("enter location");
//			String location=sc.next();
//			System.out.println("enter mobilno");
//			String mobilno=sc.next();
////			System.out.println("enter prid");
////			int prid=sc.nextInt();
//			bd.addGPM(new GPMImpl(id,name,email,password,location,mobilno));
//					
//		}
//		else if(choice==5) {
//			List<GPM> list=bd.getAllGPM();
//			list.forEach(System.out::println);
//		}
//		else if(choice==6) {
//			System.out.println("enter projid");
//			int projid=sc.nextInt();
//			System.out.println("enter gpmid");
//			int gpmid=sc.nextInt();
//			bd.assignProjToGpm(projid, gpmid);
//		}
//		else if(choice==7) {
//			System.out.println("enter name");
//			String pname=sc.next();
//			List<Employee> list=bd.getAllEmployee(pname);
//			list.forEach(System.out::println);
//		}
//		else if(choice==8) {
//			System.out.println("enter email");
//			String email=sc.next();
//			System.out.println("enter password");
//			String password=sc.next();
//			System.out.println(gp.loginGPM(email, password));
//			
//			
//		}
//		else if(choice==9) {
//			System.out.println("enter id");
//			int id=sc.nextInt();
//			System.out.println("enter name");
//			String name=sc.next();
//			System.out.println("enter age");
//			int age=sc.nextInt();
//			System.out.println("enter location");
//			String location=sc.next();
//			System.out.println("enter wages");
//			int wages=sc.nextInt();
//			System.out.println("enter mobilno");
//			String mobilno=sc.next();
//			System.out.println("enter days");
//			int days=sc.nextInt();
////			System.out.println("enter pid");
////			int pid=sc.nextInt();
//			gp.addEmployee(new EmployeeImpl(id,name,age,location,wages,mobilno,days));
//		}
//		else if(choice==10) {
//			List<Employee>list=gp.getAllEmployee();
//			list.forEach(System.out::println);
//		}
//		else if(choice==11) {
//			System.out.println("enter empid");
//			int empid=sc.nextInt();
//			System.out.println("enter projid");
//			int projid=sc.nextInt();
//			gp.assignEmpToProj(empid, projid);
//			
//		}
//		else if(choice==12) {
//			System.out.println("enter projid");
//			int id=sc.nextInt();
//			List<Employee>list=gp.viewTotalDaysandWages(id);
//			list.forEach(System.out::println);
//			
//			
//		
//		}
//	}while(choice!=0);
//	System.out.println("Thank you for visiting our services");
//	sc.close();
}
}
