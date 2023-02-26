package com.ui;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.dao.BDODao;
import com.dao.BDODaoImpl;
import com.dao.GPMDao;
import com.dao.GPMDaoImpl;
import com.dto.Employee;
import com.dto.EmployeeImpl;
import com.dto.Eproj;
import com.dto.GPM;
import com.dto.GPMImpl;
import com.dto.Project;
import com.dto.ProjectImpl;
import com.style.ConsoleColors;

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
//	System.out.println(ConsoleColors.BOXING+ConsoleColors.CYAN_BACKGROUND+ConsoleColors.WHITE_BOLD_BRIGHT+"Welcome to MGNREGA : "+ ConsoleColors.RESET);
//	System.out.println();
//	System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Choose Option from Below According to your Designation  : " + ConsoleColors.RESET);
	
	home();
	
	
	
	
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

	 
	 //----------------------------------------------function making----------------------------------------
	
}
public static void home() {
	BDODao bd=new BDODaoImpl();
	GPMDao gp=new GPMDaoImpl();
	int c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println(ConsoleColors.BOXING+ConsoleColors.PURPLE_UNDERLINED+ConsoleColors.PURPLE_BACKGROUND_BRIGHT+ConsoleColors.WHITE_BOLD_BRIGHT+"******************************************WELCOME TO MGNREGA*************************************************** "+ConsoleColors.RESET);
//	System.out.println("select 1 for login BDO");
//	System.out.println("select 2 for login gpm member");
	System.out.println(ConsoleColors.RED_BOLD +"Press 1 to" +ConsoleColors.GREEN_BOLD + " logIn as BDO." + ConsoleColors.RESET);
	System.out.println(ConsoleColors.RED_BOLD +"Press 2 to" +ConsoleColors.GREEN_BOLD + " logIn as Gram Panchayat Member."+ ConsoleColors.RESET);
	System.out.println(ConsoleColors.RED_BOLD +"Press 3 to" +ConsoleColors.GREEN_BOLD + " System for exit "+ ConsoleColors.RESET);
	c=sc.nextInt();
	int choice=0;
	int choice1=0;
	if(c==1) {
		System.out.println(ConsoleColors.YELLOW_BOLD +"enter email"+ ConsoleColors.RESET);
		String emails=sc.next();
		System.out.println(ConsoleColors.YELLOW_BOLD +"enter password"+ ConsoleColors.RESET);
		String passwords=sc.next();
		//System.out.println(bd.loginBDO(email, password));
		
		if(bd.loginBDO(emails, passwords)) {
			
			do {
				
				System.out.println(ConsoleColors.PURPLE_BOLD+"1. add project"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"2. view all project"+ ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"3. add gpm"+ ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"4. view all gpm"+ ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"5. assignProjToGpm"+ ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"6. view all employee"+ ConsoleColors.RESET);
				System.out.println(ConsoleColors.PURPLE_BOLD+"0. for Exit"+ ConsoleColors.RESET);
				System.out.print(ConsoleColors.PURPLE_BOLD+"Enter selection "+ ConsoleColors.RESET);
				choice=sc.nextInt();
				if(choice==1) {
					System.out.println(ConsoleColors.BLUE_BOLD+"enter id"+ConsoleColors.RESET);
					int id=sc.nextInt();
					System.out.println(ConsoleColors.BLUE_BOLD+"enter name"+ConsoleColors.RESET);
					String name=sc.next();
					System.out.println(ConsoleColors.BLUE_BOLD+"enter project description"+ConsoleColors.RESET);
					String desc=sc.next();
//					System.out.println("enter nofodays");
//					int noOfDays=sc.nextInt();
					System.out.println(ConsoleColors.BLUE_BOLD+"enter date"+ConsoleColors.RESET);
					String date=sc.next();
					System.out.println(ConsoleColors.BLUE_BOLD+"enter duration"+ConsoleColors.RESET);
					int duration=sc.nextInt();
					bd.addProject(new ProjectImpl(id,name,desc,LocalDate.parse(date),duration));
				}
				else if(choice==2) {
					List<Project> list=bd.getAllProject();
					list.forEach(System.out::println);
					
				}
				else if(choice==3) {
					System.out.println(ConsoleColors.RED_BOLD+"enter id"+ConsoleColors.RESET);
					int id=sc.nextInt();
					System.out.println(ConsoleColors.RED_BOLD+"enter name"+ConsoleColors.RESET);
					String name=sc.next();
					System.out.println(ConsoleColors.RED_BOLD+"enter email");
					String email=sc.next();
					System.out.println(ConsoleColors.RED_BOLD+"enter password"+ConsoleColors.RESET);
					String password=sc.next();
					System.out.println(ConsoleColors.RED_BOLD+"enter location"+ConsoleColors.RESET);
					String location=sc.next();
					System.out.println(ConsoleColors.RED_BOLD+"enter mobilno"+ConsoleColors.RESET);
					String mobilno=sc.next();
					System.out.println("enter prid");
					int prid=sc.nextInt();
					bd.addGPM(new GPMImpl(id,name,email,password,location,mobilno,prid));
							
				}
				else if(choice==4) {
					List<GPM> list=bd.getAllGPM();
					list.forEach(System.out::println);
				}
				else if(choice==5) {
					System.out.println(ConsoleColors.RED_BOLD+"enter projid"+ConsoleColors.RESET);
					int projid=sc.nextInt();
					System.out.println(ConsoleColors.RED_BOLD+"enter gpmid"+ConsoleColors.RESET);
					int gpmid=sc.nextInt();
					bd.assignProjToGpm(projid, gpmid);
				}
				else if(choice==6) {
					System.out.println(ConsoleColors.RED_BOLD+"enter name"+ConsoleColors.RESET);
					String pname=sc.next();
					List<Employee> list=bd.getAllEmployee(pname);
					list.forEach(System.out::println);
				}
		}while(choice!=0);
		System.out.println(ConsoleColors.GREEN_ITALIC+"Thank you for visiting our services of BDO"+ConsoleColors.RESET);
//		System.out.println(ConsoleColors.RED_BOLD +"Press 2 to" +ConsoleColors.GREEN_BOLD + " logIn as gpm." + ConsoleColors.RESET);
//		System.out.println(ConsoleColors.RED_BOLD +"Press 3 to" +ConsoleColors.GREEN_BOLD + " System for exit "+ ConsoleColors.RESET);
//		c=sc.nextInt();
		home();
		
//		sc.close();
		}
		else {
			System.out.println(ConsoleColors.GREEN_ITALIC+"invalid username and password"+ConsoleColors.RESET);
		}
		
	}
	
	else if(c==2) {
		System.out.println(ConsoleColors.YELLOW_BOLD+"enter email"+ConsoleColors.RESET);
		String email=sc.next();
		System.out.println(ConsoleColors.YELLOW_BOLD+"enter password"+ConsoleColors.RESET);
		String password=sc.next();
		//System.out.println(gp.loginGPM(email, password));
		if(gp.loginGPM(email, password)) {
			do {System.out.println(ConsoleColors.RED_BOLD+"1. addEmployee"+ConsoleColors.RESET);
			System.out.println(ConsoleColors.RED_BOLD+"2. getAllEmployee"+ConsoleColors.RESET);
			System.out.println(ConsoleColors.RED_BOLD+"3. assignEmpToProj"+ConsoleColors.RESET);
			System.out.println(ConsoleColors.RED_BOLD+"4. viewTotalDaysandWages"+ConsoleColors.RESET);
			System.out.println(ConsoleColors.RED_BOLD+"5. getAlleproj"+ConsoleColors.RESET);
			System.out.println(ConsoleColors.RED_BOLD+"0. for Exit"+ConsoleColors.RESET);
			System.out.print(ConsoleColors.RED_BOLD+"Enter selection "+ConsoleColors.RESET);
			choice1=sc.nextInt();
			
			
			if(choice1==1) {
				System.out.println(ConsoleColors.BLACK_BOLD+"enter id"+ConsoleColors.RESET);
				int id=sc.nextInt();
				System.out.println(ConsoleColors.BLACK_BOLD+"enter name"+ConsoleColors.RESET);
				String name=sc.next();
				System.out.println(ConsoleColors.BLACK_BOLD+"enter age"+ConsoleColors.RESET);
				int age=sc.nextInt();
				System.out.println(ConsoleColors.BLACK_BOLD+"enter location"+ConsoleColors.RESET);
				String location=sc.next();
				System.out.println(ConsoleColors.BLACK_BOLD+"enter wages"+ConsoleColors.RESET);
				int wages=sc.nextInt();
				System.out.println(ConsoleColors.BLACK_BOLD+"enter mobilno"+ConsoleColors.RESET);
				String mobilno=sc.next();
				System.out.println(ConsoleColors.BLACK_BOLD+"enter days"+ConsoleColors.RESET);
				int days=sc.nextInt();
				System.out.println(ConsoleColors.BLACK_BOLD+"enter pid"+ConsoleColors.RESET);
				int pid=sc.nextInt();
				gp.addEmployee(new EmployeeImpl(id,name,age,location,wages,mobilno,days,pid));
			}
			else if(choice1==2) {
				List<Employee>list=gp.getAllEmployee();
				list.forEach(System.out::println);
			}
			else if(choice1==3) {
				System.out.println(ConsoleColors.BLUE_ITALIC+"enter empid"+ConsoleColors.RESET);
				int empid=sc.nextInt();
				System.out.println(ConsoleColors.BLUE_ITALIC+"enter projid"+ConsoleColors.RESET);
				int projid=sc.nextInt();
				gp.assignEmpToProj(empid, projid);
				
			}
			else if(choice1==4) {
				System.out.println(ConsoleColors.RED_BOLD+"enter projid"+ConsoleColors.RESET);
				int id=sc.nextInt();
				List<Employee>list=gp.viewTotalDaysandWages(id);
				list.forEach(System.out::println);
				
				
			
			}
			else if(choice1==5) {
				List<Eproj> list=gp.getAllEproj();
				list.forEach(System.out::println);


			}
			
				
			}while(choice1!=0);
			System.out.println(ConsoleColors.GREEN_ITALIC+"thank you for visiting our services GPM"+ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD +"Press 1 to" +ConsoleColors.GREEN_BOLD + " logIn as bdo." + ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD +"Press 3 to" +ConsoleColors.GREEN_BOLD + " System for exit "+ ConsoleColors.RESET);
//			c=sc.nextInt();
//			sc.close();
			home();
		}
		else {
			System.out.println(ConsoleColors.GREEN_ITALIC+"invalid email and password"+ConsoleColors.RESET);
		}
		
	}
	else if(c==3) {
		System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "APPLICATION CLOSED : EXITED" + ConsoleColors.RESET);
		System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "Thanks for Visiting" + ConsoleColors.RESET);
		System.exit(0);
	}
}
}
