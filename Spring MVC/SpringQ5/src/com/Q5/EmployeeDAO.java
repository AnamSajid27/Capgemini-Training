package com.Q5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	private Connection con;
	
	public  EmployeeDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	   	    this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi", "root", "admin@123");
			}catch (Exception e) {
				// TODO: handle exception
			}
	}
	
	public void insertUser(Employee employee) throws Exception {
		 String employeeName=employee.getEmployeeName();
		
		 String employeeDepartment=employee.getEmployeeDepartment();
		 String employeeDesignation=employee.getEmployeeDesignation();
		 int employeeSalary=employee.getEmployeeSalary();
		 
		 PreparedStatement preparedStatement = con.prepareStatement("insert into employee (employeeName,employeeDepartment,employeeDesignation,employeeSalary) values(?,?,?,?)");
		// preparedStatement.setInt(1, 1);
    	 preparedStatement.setString(1, employeeName);
    	 preparedStatement.setString(2,employeeDepartment);
    	 preparedStatement.setString(3, employeeDesignation);
    	 preparedStatement.setInt(4,employeeSalary);
    	 preparedStatement.executeUpdate();
		
	}
	
	public ResultSet getDetails() throws Exception{
		PreparedStatement preparedStatement= con.prepareStatement("select * from employee");
		ResultSet resultSet=preparedStatement.executeQuery();
		return resultSet;
	}

	public void deleteEmployee(int id)throws Exception{
		
		PreparedStatement preparedStatement = con.prepareStatement("DELETE from employee where employeeId=?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}
	
	public ResultSet getDetailById(String id) throws Exception {
		PreparedStatement preparedStatement= con.prepareStatement("select * from employee where employeeId=?");
		//Integer i = Integer.parseInt(id);
		
		preparedStatement.setString(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		return resultSet;
	}
	
	public void updateDetails(Employee employee) throws Exception {
		String sql = "UPDATE employee SET employeeName=?,employeeDepartment=?,employeeDesignation=?,employeeSalary=? where employeeId=?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, employee.getEmployeeName());
		preparedStatement.setString(2, employee.getEmployeeDepartment());
		preparedStatement.setString(3, employee.getEmployeeDesignation());
		preparedStatement.setInt(4, employee.getEmployeeSalary());
		preparedStatement.setInt(5, employee.getEmployeeId());
		
		preparedStatement.executeUpdate();
	}
}
