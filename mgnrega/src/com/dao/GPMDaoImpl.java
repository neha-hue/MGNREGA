package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.EmpProject;
import com.dto.Employee;
import com.dto.EmployeeImpl;
import com.dto.Eproj;


public class GPMDaoImpl implements GPMDao {
	private boolean isResultSetEmpty(ResultSet rs) throws SQLException {
		return (!rs.isBeforeFirst() && rs.getRow() == 0)?true:false;
	}
	
	private List<Employee> getEmployeeListFromResultSet(ResultSet resultSet) throws SQLException{
		List<Employee> list = new ArrayList<>();
		while(resultSet.next()) {
			//Create an object of Employee
			Employee emp=new EmployeeImpl();
			emp.setEmpid(resultSet.getInt("empid"));
			emp.setEname(resultSet.getString("ename"));
			emp.setAge(resultSet.getInt("age"));
			emp.setLocation(resultSet.getString("location"));
			emp.setWages(resultSet.getInt("wages"));
			emp.setMobilno(resultSet.getString("mobilno"));
			emp.setDays(resultSet.getInt("days"));
			emp.setPid(resultSet.getInt("pid"));
		list.add(emp);
		}
		return list;
	}
	
	private List<EmpProject> getEmpProjectListFromResultSet(ResultSet rs) throws SQLException{
		List<EmpProject> list = new ArrayList<>();
		while(rs.next()) {
			//Create an object of Employee
			EmpProject em=new EmpProject();
        	em.setEmpid(rs.getInt("empid"));
        	em.setEname(rs.getString("ename"));
        	em.setDays(rs.getInt("days"));
        	em.setWages(rs.getInt("wages"));
        	em.setName(rs.getString("name"));
        	em.setProjid(rs.getInt("projid"));
        	list.add(em);
		}
		return list;
	}
	
	private List<Eproj> getEprojListFromResultSet(ResultSet rs) throws SQLException{
		List<Eproj>list=new ArrayList<>();
		while(rs.next()) {
			Eproj ep=new Eproj();
			ep.setEmp_id(rs.getInt("emp_id"));
			ep.setP_id(rs.getInt("p_id"));
			list.add(ep);
		}
		return list;
	}
	
	
	/**
	 *
	 */
	public boolean loginGPM(String email,String password) {
		boolean mes=false;
		Connection con=null;
		try {
			con=DBUtils.connectToDatabase();
			PreparedStatement ps=con.prepareStatement("select * from gpm where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			

			ResultSet resultSet = ps.executeQuery();

//			if(isResultSetEmpty(resultSet)) {
//				throw new SQLException();
//			}
			if(resultSet.next()) {
				mes=true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				//close the exception
				DBUtils.closeConnection(con);				
			}catch(SQLException sqlEX) {
				sqlEX.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return mes;
	}
	
	
	public String addEmployee(Employee emp) {
		String message="Employee insertion failed";
	    Connection con=null;

			try {

				con=DBUtils.connectToDatabase();

				
				PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,null,?)");
				ps.setInt(1, emp.getEmpid());
				ps.setString(2, emp.getEname());
				ps.setInt(3, emp.getAge());
				ps.setString(4,emp.getLocation());
				ps.setInt(5, emp.getWages());
				ps.setString(6, emp.getMobilno());
				ps.setInt(7, emp.getPid());		
				ps.setInt(7, emp.getDays());
				

				
				
				if(ps.executeUpdate()>0) {
					message="employee  inserted succesfully";
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				try {
					
					DBUtils.closeConnection(con);;				
				}catch(SQLException sqlEX) {
					sqlEX.printStackTrace();
				}
			}
			
			return message;
	}
	
	public List<Employee> getAllEmployee()  {
		
		Connection connection = null;

		List<Employee> list = null;
		try {
			//connect to database
			connection = DBUtils.connectToDatabase();
			//prepare the query
			String SELECT_QUERY = "SELECT * FROM employee ";
			
			//get the prepared statement object
			PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
			
			//execute query
			ResultSet resultSet = ps.executeQuery();
			
			//check if result set is empty
			if(isResultSetEmpty(resultSet)) {
				throw new SQLException();
			}
			
			list = getEmployeeListFromResultSet(resultSet);
		}catch(SQLException sqlEx) {
			//code to log the error in the file
			sqlEx.printStackTrace();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);			
			}catch(SQLException sqlEX) {
				sqlEX.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return list;
	}
	
//	-----------------------Eproj---------------------------
public List<Eproj> getAllEproj()  {
		
		Connection connection = null;

		List<Eproj> list = null;
		try {
			//connect to database
			connection = DBUtils.connectToDatabase();
			//prepare the query
			String SELECT_QUERY = "select * from eproj";
			
			//get the prepared statement object
			PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
			
			//execute query
			ResultSet resultSet = ps.executeQuery();
			
			//check if result set is empty
			if(isResultSetEmpty(resultSet)) {
				throw new SQLException();
			}
			
			list = getEprojListFromResultSet(resultSet);
		}catch(SQLException sqlEx) {
			//code to log the error in the file
			sqlEx.printStackTrace();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);			
			}catch(SQLException sqlEX) {
				sqlEX.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return list;
	}
	
	
	
	
	public String assignEmpToProj(int empid,int projid) {
		
		Connection connection = null;
		String msg="not assigned any project";
		
		try {
			//connect to database
			connection = DBUtils.connectToDatabase();
			//prepare the query
			
			String SELECT_QUERY = "update employee set pid=? where empid=?";
			String str1="insert into eproj values(?,?)";
			//get the prepared statement object
			PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
			ps.setInt(1, projid);
			ps.setInt(2, empid);
			
			if(ps.executeUpdate()>0) {
				msg="project assign employee sucessfully";
			}
		}catch(SQLException sqlEx) {
			//code to log the error in the file
			sqlEx.printStackTrace();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);			
			}catch(SQLException sqlEX) {
				sqlEX.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return msg;
	}
	
	public List<Employee> viewTotalDaysandWages(int empid) {
		Connection connection = null;
//		Employee emp=null;
//		 List<EmpProject> list=null;
		List<Employee>list=new ArrayList<>();
		
		try {
			//connect to database
			connection = DBUtils.connectToDatabase();
			//prepare the query
			
			String SELECT_QUERY = "select e.wages,e.days,e.days*e.wages totalwages,e.empid,e.ename,e.age,e.location,e.mobilno,e.pid from employee e inner join project p on p.projid=e.pid where e.empid=?";
			//String str1="select e.wages,e.days,e.days*e.wages totalwages,e.empid,e.ename,e.age,e.location,e.mobilno,e.pid from employee e inner join eproj ep on e.empid=ep.emp_id inner join project p on p.projid=ep.p_id where e.empid=?";
			
			//get the prepared statement object
			PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
			ps.setInt(1, empid);
            ResultSet resultSet=ps.executeQuery();
            
			
			//check if result set is empty
//			if(isResultSetEmpty(resultSet)) {
//				throw new SQLException();
//			}
			while(resultSet.next()) {
				
				

				Employee  emp=new EmployeeImpl();
				

				emp.setEmpid(resultSet.getInt("empid"));
				emp.setEname(resultSet.getString("ename"));
				emp.setAge(resultSet.getInt("age"));
				emp.setLocation(resultSet.getString("location"));
				emp.setDays(resultSet.getInt("days"));
				emp.setWages(resultSet.getInt("totalwages"));
				emp.setPid(resultSet.getInt("pid"));
				emp.setMobilno(resultSet.getString("mobilno"));
				
				list.add(emp);
			}

			
            
//           list=getEmpProjectListFromResultSet(resultSet);
			
		
			
			
			
			
		}catch(SQLException sqlEx) {
			//code to log the error in the file
			sqlEx.printStackTrace();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);			
			}catch(SQLException sqlEX) {
				sqlEX.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return list;
	}

}
