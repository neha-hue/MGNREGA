//package com.ui;
//
//
//import java.time.LocalDate;
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.Scanner;
//
//import com.dao.BDODao;
//import com.dao.BDODaoImpl;
//import com.dao.GPMDao;
//import com.dao.GPMDaoImpl;
//import com.dto.Employee;
//import com.dto.EmployeeImpl;
//import com.dto.Eproj;
//import com.dto.GPM;
//import com.dto.GPMImpl;
//import com.dto.Project;
//import com.dto.ProjectImpl;
//import com.style.ConsoleColors;
//
//
//public class Main {
//	
//public static void main(String[] args) {
//
//	home();
//	
//	 //----------------------------------------------function making----------------------------------------
//	
//}
//public static void home() {
//	BDODao bd=new BDODaoImpl();
//	GPMDao gp=new GPMDaoImpl();
//	int c=0;
//	
//	Scanner sc=new Scanner(System.in);
//	System.out.println(ConsoleColors.BOXING+ConsoleColors.PURPLE_UNDERLINED+ConsoleColors.PURPLE_BACKGROUND_BRIGHT+ConsoleColors.WHITE_BOLD_BRIGHT+"******************************************WELCOME TO MGNREGA*************************************************** "+ConsoleColors.RESET);
////	System.out.println("select 1 for login BDO");
////	System.out.println("select 2 for login gpm member");
//	System.out.println(ConsoleColors.RED_BOLD +"Press 1 to" +ConsoleColors.GREEN_BOLD + " logIn as BDO." + ConsoleColors.RESET);
//	System.out.println(ConsoleColors.RED_BOLD +"Press 2 to" +ConsoleColors.GREEN_BOLD + " logIn as Gram Panchayat Member."+ ConsoleColors.RESET);
//	System.out.println(ConsoleColors.RED_BOLD +"Press 3 to" +ConsoleColors.GREEN_BOLD + " System for exit "+ ConsoleColors.RESET);
//	c=sc.nextInt();
//	int choice=0;
//	int choice1=0;
//	
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	if(c==1) {
//		System.out.println(ConsoleColors.YELLOW_BOLD +"enter email"+ ConsoleColors.RESET);
//		String emails=sc.next();
//		System.out.println(ConsoleColors.YELLOW_BOLD +"enter password"+ ConsoleColors.RESET);
//		String passwords=sc.next();
//		//System.out.println(bd.loginBDO(email, password));
//		
//		if( emails.equalsIgnoreCase("neha") && passwords.equalsIgnoreCase("neha")) {
//			
//			do {
//				
//				System.out.println(ConsoleColors.PURPLE_BOLD+"1. add project"+ConsoleColors.RESET);
//				System.out.println(ConsoleColors.PURPLE_BOLD+"2. view all project"+ ConsoleColors.RESET);
//				System.out.println(ConsoleColors.PURPLE_BOLD+"3. add gpm"+ ConsoleColors.RESET);
//				System.out.println(ConsoleColors.PURPLE_BOLD+"4. view all gpm"+ ConsoleColors.RESET);
//				System.out.println(ConsoleColors.PURPLE_BOLD+"5. assignProjToGpm"+ ConsoleColors.RESET);
//				System.out.println(ConsoleColors.PURPLE_BOLD+"6. view all employee"+ ConsoleColors.RESET);
//				System.out.println(ConsoleColors.PURPLE_BOLD+"0. for Exit"+ ConsoleColors.RESET);
//				System.out.print(ConsoleColors.PURPLE_BOLD+"Enter selection "+ ConsoleColors.RESET);
//				choice=sc.nextInt();
//				if(choice==1) {
//					System.out.println(ConsoleColors.BLUE_BOLD+"enter id"+ConsoleColors.RESET);
//					int id=sc.nextInt();
//					System.out.println(ConsoleColors.BLUE_BOLD+"enter name"+ConsoleColors.RESET);
//					String name=sc.next();
//					System.out.println(ConsoleColors.BLUE_BOLD+"enter project description"+ConsoleColors.RESET);
//					String desc=sc.next();
////					System.out.println("enter nofodays");
////					int noOfDays=sc.nextInt();
//					System.out.println(ConsoleColors.BLUE_BOLD+"enter date"+ConsoleColors.RESET);
//					String date=sc.next();
//					System.out.println(ConsoleColors.BLUE_BOLD+"enter duration"+ConsoleColors.RESET);
//					int duration=sc.nextInt();
//					System.out.println(ConsoleColors.BLUE_BOLD+bd.addProject(new ProjectImpl(id,name,desc,LocalDate.parse(date),duration))+ConsoleColors.RESET);
//					
//				}
//				else if(choice==2) {
//					System.out.println(ConsoleColors.BLUE_BOLD);
//					List<Project> list=bd.getAllProject();
//					list.forEach(System.out::println);
//					System.out.println(ConsoleColors.RESET);
//					
//				}
//				else if(choice==3) {
//					System.out.println(ConsoleColors.RED_BOLD+"enter id"+ConsoleColors.RESET);
//					int id=sc.nextInt();
//					System.out.println(ConsoleColors.RED_BOLD+"enter name"+ConsoleColors.RESET);
//					String name=sc.next();
//					System.out.println(ConsoleColors.RED_BOLD+"enter email");
//					String email=sc.next();
//					System.out.println(ConsoleColors.RED_BOLD+"enter password"+ConsoleColors.RESET);
//					String password=sc.next();
//					System.out.println(ConsoleColors.RED_BOLD+"enter location"+ConsoleColors.RESET);
//					String location=sc.next();
//					System.out.println(ConsoleColors.RED_BOLD+"enter mobilno"+ConsoleColors.RESET);
//					String mobilno=sc.next();
//					System.out.println("enter prid");
//					int prid=sc.nextInt();
//					
//					System.out.println(ConsoleColors.RED_BOLD+bd.addGPM(new GPMImpl(id,name,email,password,location,mobilno,prid))+ConsoleColors.RESET);
//							
//				}
//				else if(choice==4) {
//					System.out.println(ConsoleColors.BLUE_BOLD);
//					List<GPM> list=bd.getAllGPM();
//					list.forEach(System.out::println);
//					System.out.println(ConsoleColors.RESET);
//				}
//				else if(choice==5) {
//					System.out.println(ConsoleColors.RED_BOLD+"enter projid"+ConsoleColors.RESET);
//					int projid=sc.nextInt();
//					System.out.println(ConsoleColors.RED_BOLD+"enter gpmid"+ConsoleColors.RESET);
//					int gpmid=sc.nextInt();
//					
//					System.out.println(ConsoleColors.RED_BOLD+bd.assignProjToGpm(projid, gpmid)+ConsoleColors.RESET);
//				}
//				else if(choice==6) {
//					System.out.println(ConsoleColors.RED_BOLD+"enter pname");
//					String pname=sc.next();
//					List<Employee> list=bd.getAllEmployee(pname);
//					list.forEach(System.out::println);
//					System.out.println(ConsoleColors.RESET);
//				}
//				else {
//					System.out.println(ConsoleColors.RED_BOLD+"wrong selection please try again"+ConsoleColors.RESET);
//				}
//				
//		}while(choice!=0);
//		System.out.println(ConsoleColors.GREEN_ITALIC+"Thank you for visiting our services of BDO"+ConsoleColors.RESET);
////		System.out.println(ConsoleColors.RED_BOLD +"Press 2 to" +ConsoleColors.GREEN_BOLD + " logIn as gpm." + ConsoleColors.RESET);
////		System.out.println(ConsoleColors.RED_BOLD +"Press 3 to" +ConsoleColors.GREEN_BOLD + " System for exit "+ ConsoleColors.RESET);
////		c=sc.nextInt();
//		home();
//		
////		sc.close();
//		}
//		
//		else {
//			System.out.println(ConsoleColors.GREEN_ITALIC+"invalid username and password"+ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD+"Try again"+ConsoleColors.RESET);
//			home();
//		}
//		
//	}
//	
//	else if(c==2) {
//		System.out.println(ConsoleColors.YELLOW_BOLD+"enter email"+ConsoleColors.RESET);
//		String email=sc.next();
//		System.out.println(ConsoleColors.YELLOW_BOLD+"enter password"+ConsoleColors.RESET);
//		String password=sc.next();
//		//System.out.println(gp.loginGPM(email, password));
//		if(gp.loginGPM(email, password)) {
//			do {System.out.println(ConsoleColors.RED_BOLD+"1. addEmployee"+ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD+"2. getAllEmployee"+ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD+"3. assignEmpToProj"+ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD+"4. viewTotalDaysandWages"+ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD+"5. getAlleproj"+ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD+"0. for Exit"+ConsoleColors.RESET);
//			System.out.print(ConsoleColors.RED_BOLD+"Enter selection "+ConsoleColors.RESET);
//			choice1=sc.nextInt();
//			
//			
//			if(choice1==1) {
//				System.out.println(ConsoleColors.BLACK_BOLD+"enter id"+ConsoleColors.RESET);
//				int id=sc.nextInt();
//				System.out.println(ConsoleColors.BLACK_BOLD+"enter name"+ConsoleColors.RESET);
//				String name=sc.next();
//				System.out.println(ConsoleColors.BLACK_BOLD+"enter age"+ConsoleColors.RESET);
//				int age=sc.nextInt();
//				System.out.println(ConsoleColors.BLACK_BOLD+"enter location"+ConsoleColors.RESET);
//				String location=sc.next();
//				System.out.println(ConsoleColors.BLACK_BOLD+"enter wages"+ConsoleColors.RESET);
//				int wages=sc.nextInt();
//				System.out.println(ConsoleColors.BLACK_BOLD+"enter mobilno"+ConsoleColors.RESET);
//				String mobilno=sc.next();
//				System.out.println(ConsoleColors.BLACK_BOLD+"enter days"+ConsoleColors.RESET);
//				int days=sc.nextInt();
//				System.out.println(ConsoleColors.BLACK_BOLD+"enter pid"+ConsoleColors.RESET);
//				int pid=sc.nextInt();
//				
//				System.out.println(ConsoleColors.GREEN_BOLD+gp.addEmployee(new EmployeeImpl(id,name,age,location,wages,mobilno,days,pid))+ConsoleColors.RESET);
//			}
//			else if(choice1==2) {
//				System.out.println(ConsoleColors.BLUE_BOLD);
//				List<Employee>list=gp.getAllEmployee();
//				list.forEach(System.out::println);
//				System.out.println(ConsoleColors.RESET);
//			}
//			else if(choice1==3) {
//				System.out.println(ConsoleColors.BLUE_ITALIC+"enter empid"+ConsoleColors.RESET);
//				int empid=sc.nextInt();
//				System.out.println(ConsoleColors.BLUE_ITALIC+"enter projid"+ConsoleColors.RESET);
//				int projid=sc.nextInt();
//				
//				System.out.println(ConsoleColors.GREEN_BOLD+gp.assignEmpToProj(empid, projid)+ConsoleColors.RESET);
//				
//			}
//			else if(choice1==4) {
//				System.out.println(ConsoleColors.RED_BOLD+"enter empid");
//				int id=sc.nextInt();
//				List<Employee>list=gp.viewTotalDaysandWages(id);
//				list.forEach(System.out::println);
//				System.out.println(ConsoleColors.RESET);
//				
//				
//			
//			}
//			else if(choice1==5) {
//				System.out.println(ConsoleColors.BLUE_ITALIC);
//				List<Eproj> list=gp.getAllEproj();
//				list.forEach(System.out::println);
//				System.out.println(ConsoleColors.RESET);
//
//
//			}
//			else {
//				System.out.println(ConsoleColors.RED_BOLD+"wrong selection please try again"+ConsoleColors.RESET);
//			}
//			
//				
//			}while(choice1!=0);
//			System.out.println(ConsoleColors.GREEN_ITALIC+"thank you for visiting our services GPM"+ConsoleColors.RESET);
////			System.out.println(ConsoleColors.RED_BOLD +"Press 1 to" +ConsoleColors.GREEN_BOLD + " logIn as bdo." + ConsoleColors.RESET);
////			System.out.println(ConsoleColors.RED_BOLD +"Press 3 to" +ConsoleColors.GREEN_BOLD + " System for exit "+ ConsoleColors.RESET);
////			c=sc.nextInt();
////			sc.close();
//			home();
//		}
//		else {
//			System.out.println(ConsoleColors.GREEN_ITALIC+"invalid email and password"+ConsoleColors.RESET);
//			System.out.println(ConsoleColors.RED_BOLD+"Try again"+ConsoleColors.RESET);
//			home();
//		}
//		
//	}
//	else if(c==3) {
//		System.out.println(ConsoleColors.BROWN_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "------------------------------APPLICATION CLOSED : EXITED------------------------------------" + ConsoleColors.RESET+"\n");
//		System.out.println(ConsoleColors.BROWN_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "------------------------------Thanks for Visiting---------------------------------------------" + ConsoleColors.RESET);
//		System.exit(1);
//	}
//	
//	else {
//		System.out.println(ConsoleColors.RED_BOLD+"please select from 1 to 3 only"+ConsoleColors.RESET);
//		home();
//	}
//}
//}

























package com.ui;


import java.time.LocalDate;
import java.util.InputMismatchException;
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


public class Main {
	
public static void main(String[] args) {

	home();
	
	 //----------------------------------------------function making----------------------------------------
	
}

	public static void home() {
		try {
		BDODao bd=new BDODaoImpl();
		GPMDao gp=new GPMDaoImpl();
		int c=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println(ConsoleColors.BOXING+ConsoleColors.PURPLE_UNDERLINED+ConsoleColors.PURPLE_BACKGROUND_BRIGHT+ConsoleColors.WHITE_BOLD_BRIGHT+"******************************************WELCOME TO MGNREGA*************************************************** "+ConsoleColors.RESET);
//		System.out.println("select 1 for login BDO");
//		System.out.println("select 2 for login gpm member");
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
				
				if( emails.equalsIgnoreCase("neha") && passwords.equalsIgnoreCase("neha")) {
					
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
//							System.out.println("enter nofodays");
//							int noOfDays=sc.nextInt();
							System.out.println(ConsoleColors.BLUE_BOLD+"enter date"+ConsoleColors.RESET);
							String date=sc.next();
							System.out.println(ConsoleColors.BLUE_BOLD+"enter duration"+ConsoleColors.RESET);
							int duration=sc.nextInt();
							System.out.println(ConsoleColors.BLUE_BOLD+bd.addProject(new ProjectImpl(id,name,desc,LocalDate.parse(date),duration))+ConsoleColors.RESET);
							
						}
						else if(choice==2) {
							System.out.println(ConsoleColors.BLUE_BOLD);
							List<Project> list=bd.getAllProject();
							list.forEach(System.out::println);
							System.out.println(ConsoleColors.RESET);
							
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
							
							System.out.println(ConsoleColors.RED_BOLD+bd.addGPM(new GPMImpl(id,name,email,password,location,mobilno,prid))+ConsoleColors.RESET);
									
						}
						else if(choice==4) {
							System.out.println(ConsoleColors.BLUE_BOLD);
							List<GPM> list=bd.getAllGPM();
							list.forEach(System.out::println);
							System.out.println(ConsoleColors.RESET);
						}
						else if(choice==5) {
							System.out.println(ConsoleColors.RED_BOLD+"enter projid"+ConsoleColors.RESET);
							int projid=sc.nextInt();
							System.out.println(ConsoleColors.RED_BOLD+"enter gpmid"+ConsoleColors.RESET);
							int gpmid=sc.nextInt();
							
							System.out.println(ConsoleColors.RED_BOLD+bd.assignProjToGpm(projid, gpmid)+ConsoleColors.RESET);
						}
						else if(choice==6) {
							System.out.println(ConsoleColors.RED_BOLD+"enter empid");
							int empid=sc.nextInt();
							List<Employee> list=bd.getAllEmployee(empid);
							list.forEach(System.out::println);
							System.out.println(ConsoleColors.RESET);
						}
						else if(choice>6) {
							System.out.println(ConsoleColors.RED_BOLD+"wrong selection please try again"+ConsoleColors.RESET);
						}
						
				}while(choice!=0);
				System.out.println(ConsoleColors.GREEN_ITALIC+"Thank you for visiting our services of BDO"+ConsoleColors.RESET);
//				System.out.println(ConsoleColors.RED_BOLD +"Press 2 to" +ConsoleColors.GREEN_BOLD + " logIn as gpm." + ConsoleColors.RESET);
//				System.out.println(ConsoleColors.RED_BOLD +"Press 3 to" +ConsoleColors.GREEN_BOLD + " System for exit "+ ConsoleColors.RESET);
//				c=sc.nextInt();
				home();
				
//				sc.close();
				}
				
				else {
					System.out.println(ConsoleColors.GREEN_ITALIC+"invalid username and password"+ConsoleColors.RESET);
					System.out.println(ConsoleColors.RED_BOLD+"Try again"+ConsoleColors.RESET);
					home();
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
					//System.out.println(ConsoleColors.RED_BOLD+"5. getAlleproj"+ConsoleColors.RESET);
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
						
						System.out.println(ConsoleColors.GREEN_BOLD+gp.addEmployee(new EmployeeImpl(id,name,age,location,wages,mobilno,days,pid))+ConsoleColors.RESET);
					}
					else if(choice1==2) {
						System.out.println(ConsoleColors.BLUE_BOLD);
						List<Employee>list=gp.getAllEmployee();
						list.forEach(System.out::println);
						System.out.println(ConsoleColors.RESET);
					}
					else if(choice1==3) {
						System.out.println(ConsoleColors.BLUE_ITALIC+"enter empid"+ConsoleColors.RESET);
						int empid=sc.nextInt();
						System.out.println(ConsoleColors.BLUE_ITALIC+"enter projid"+ConsoleColors.RESET);
						int projid=sc.nextInt();
						
						System.out.println(ConsoleColors.GREEN_BOLD+gp.assignEmpToProj(empid, projid)+ConsoleColors.RESET);
						
					}
					else if(choice1==4) {
						System.out.println(ConsoleColors.RED_BOLD+"enter empid");
						int id=sc.nextInt();
						List<Employee>list=gp.viewTotalDaysandWages(id);
						list.forEach(System.out::println);
						System.out.println(ConsoleColors.RESET);
						
						
					
					}
					else if(choice1==5) {
						System.out.println(ConsoleColors.BLUE_ITALIC);
						List<Eproj> list=gp.getAllEproj();
						list.forEach(System.out::println);
						System.out.println(ConsoleColors.RESET);


					}
					else if( choice1>5) {
						System.out.println(ConsoleColors.RED_BOLD+"wrong selection please try again"+ConsoleColors.RESET);
					}
					
						
					}while(choice1!=0);
					System.out.println(ConsoleColors.GREEN_ITALIC+"thank you for visiting our services GPM"+ConsoleColors.RESET);
//					System.out.println(ConsoleColors.RED_BOLD +"Press 1 to" +ConsoleColors.GREEN_BOLD + " logIn as bdo." + ConsoleColors.RESET);
//					System.out.println(ConsoleColors.RED_BOLD +"Press 3 to" +ConsoleColors.GREEN_BOLD + " System for exit "+ ConsoleColors.RESET);
//					c=sc.nextInt();
//					sc.close();
					home();
				}
				else {
					System.out.println(ConsoleColors.GREEN_ITALIC+"invalid email and password"+ConsoleColors.RESET);
					System.out.println(ConsoleColors.RED_BOLD+"Try again"+ConsoleColors.RESET);
					home();
				}
				
			}
			else if(c==3) {
				System.out.println(ConsoleColors.BROWN_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "------------------------------APPLICATION CLOSED : EXITED------------------------------------" + ConsoleColors.RESET+"\n");
				System.out.println(ConsoleColors.BROWN_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT + "------------------------------Thanks for Visiting---------------------------------------------" + ConsoleColors.RESET);
				System.exit(1);
			}
			
			else {
				System.out.println(ConsoleColors.RED_BOLD+"please select from 1 to 3 only"+ConsoleColors.RESET);
				home();
			}
			
	}


	catch(InputMismatchException e) {
         System.out.println(ConsoleColors.RED_BOLD+"type only number"+ConsoleColors.RESET);
         home();

	}

	}
}

