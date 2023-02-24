package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.EmpProject;
import com.dto.Employee;
import com.dto.EmployeeImpl;
import com.dto.GPM;
import com.dto.GPMImpl;
import com.dto.Project;
import com.dto.ProjectImpl;

public class BDODaoImpl implements BDODao {
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
//			emp.setPid(resultSet.getInt("pid"));
			
		list.add(emp);
		}
		return list;
	}
	private List<Project> getProjectListFromResultSet(ResultSet resultSet) throws SQLException{
		List<Project> list = new ArrayList<>();

		while(resultSet.next()) {
			//Create an object of Employee
			Project emp=new ProjectImpl();
			emp.setProjid(resultSet.getInt("projid"));
			emp.setName(resultSet.getString("name"));
			emp.setProdesc(resultSet.getString("projdesc"));
			
			
			emp.setDate(resultSet.getDate("date").toLocalDate());
			emp.setProjDuration(resultSet.getInt("duration"));
			
			
		list.add(emp);
		}
		return list;
	}
	private List<GPM> getGPMListFromResultSet(ResultSet resultSet) throws SQLException{
		List<GPM> list = new ArrayList<>();
		while(resultSet.next()) {
			
			GPM emp=new GPMImpl();
			emp.setGpmid(resultSet.getInt("gpmid"));
			emp.setName(resultSet.getString("name"));
			emp.setEmail(resultSet.getString("email"));
			emp.setPassword(resultSet.getString("password"));
			emp.setLocation(resultSet.getString("location"));
			emp.setMobileno(resultSet.getString("mobilno"));
//			emp.setPrid(resultSet.getInt("prid"));
			
		list.add(emp);
		}
		return list;
	}
public String loginBDO(String email,String password) {
	String mes="invalid username or password";
	Connection con=null;
	try {
		con=DBUtils.connectToDatabase();
		PreparedStatement ps=con.prepareStatement("select * from bdo where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		

		ResultSet resultSet = ps.executeQuery();

//		if(isResultSetEmpty(resultSet)) {
//			throw new SQLException();
//		}
		if(resultSet.next()) {
			mes="welcome"+" "+resultSet.getString("username");
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
public String addProject(Project proj) {
	String message="Employee insertion failed";
    Connection con=null;

		try {

			con=DBUtils.connectToDatabase();

			
			PreparedStatement ps=con.prepareStatement("insert into project values(?,?,?,?,?)");
			ps.setInt(1, proj.getProjid());
			ps.setString(2, proj.getName());
			ps.setString(3, proj.getProdesc());
			
			ps.setDate(4, Date.valueOf(proj.getDate()));
			ps.setInt(5, proj.getProjDuration());
			

			
			
			if(ps.executeUpdate()>0) {
				message="department inserted succesfully";
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

public List<Project> getAllProject()  {
	
	Connection connection = null;
	List<Project> list = null;
	try {
		//connect to database
		connection = DBUtils.connectToDatabase();
		//prepare the query
		String SELECT_QUERY = "SELECT * FROM project ";
		
		//get the prepared statement object
		PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
		
		//execute query
		ResultSet resultSet = ps.executeQuery();
		
		//check if result set is empty
		if(isResultSetEmpty(resultSet)) {
			throw new SQLException();
		}
		
		list = getProjectListFromResultSet(resultSet);
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

public String addGPM(GPM gpm) {
	String message="Employee insertion failed";
    Connection con=null;


		try {

			con=DBUtils.connectToDatabase();

			
			PreparedStatement ps=con.prepareStatement("insert into gpm values(?,?,?,?,?,?,null)");
			ps.setInt(1, gpm.getGpmid());
			ps.setString(2, gpm.getName());
			ps.setString(3, gpm.getEmail());
			ps.setString(4, gpm.getPassword());
			ps.setString(5, gpm.getLocation());
			ps.setString(6, gpm.getMobileno());
//			ps.setInt(7, gpm.getPrid());

			
			
			if(ps.executeUpdate()>0) {
				message="department inserted succesfully";
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


public List<GPM> getAllGPM()  {
	
	Connection connection = null;

	List<GPM> list = null;
	try {
		//connect to database
		connection = DBUtils.connectToDatabase();
		//prepare the query
		String SELECT_QUERY = "SELECT * FROM gpm ";
		
		//get the prepared statement object
		PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
		
		//execute query
		ResultSet resultSet = ps.executeQuery();
		
		//check if result set is empty
		if(isResultSetEmpty(resultSet)) {
			throw new SQLException();
		}
		
		list = getGPMListFromResultSet(resultSet);
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

public String assignProjToGpm(int projid,int gpmid) {
	
	Connection connection = null;
	String msg="not assigned any project";
	
	try {
		//connect to database
		connection = DBUtils.connectToDatabase();
		//prepare the query
		
		String SELECT_QUERY = "update gpm set prid=? where gpmid=?";
		
		//get the prepared statement object
		PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
		ps.setInt(1, projid);
		ps.setInt(2, gpmid);
		
		if(ps.executeUpdate()>0) {
			msg="project assign sucessfully";
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

//select mp.projName, me.empName,me.empAddress,me.empMobile,me.empWages  from mgnregaEmp me inner join mgnregaProject mp inner join mgnregaEmpProject mep on mep.projId = mp.projId and mep.empId = me.empId where mp.projName = ?"
public List<Employee> getAllEmployee(String pname) {
	Connection connection = null;
//	Employee emp=null;
//	 List<EmpProject> list=null;
	List<Employee>list=new ArrayList<>();
	
	try {
		//connect to database
		connection = DBUtils.connectToDatabase();
		//prepare the query
		
		String SELECT_QUERY = "select e.empid ,e.ename,e.days,e.wages,p.name from employee e inner join project p on e.pid=p.projid where p.name=?";
			
		
		//get the prepared statement object
		PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
		ps.setString(1, pname);
        ResultSet resultSet=ps.executeQuery();
        
		
		//check if result set is empty
//		if(isResultSetEmpty(resultSet)) {
//			throw new SQLException();
//		}
		while(resultSet.next()) {
			Employee  emp=new EmployeeImpl();
			

			emp.setEmpid(resultSet.getInt("empid"));
			emp.setEname(resultSet.getString("ename"));
//			emp.setAge(rs.getInt("age"));
//			emp.setLocation(rs.getString("location"));
			emp.setDays(resultSet.getInt("days"));
			emp.setWages(resultSet.getInt("wages"));
//			emp.setMobilno(rs.getString("mobilno"));
			
			
			
			
			list.add(emp);
		}

		
        
//       list=getEmpProjectListFromResultSet(resultSet);
		
	
		
		
		
		
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
