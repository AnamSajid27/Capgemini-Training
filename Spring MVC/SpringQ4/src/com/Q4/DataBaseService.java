package com.Q4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;


@Service()
public class DataBaseService {
	private Connection con;
	
	public DataBaseService() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
   	    this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi", "root", "admin@123");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertData(UserModel user) throws Exception {
		 String password = user.getPassword();
    	 String username = user.getUsername();
    	 String email = user.getEmail();
    	 
    	 PreparedStatement preparedStatement = con.prepareStatement("insert into user values(?,?,?)");
    	 preparedStatement.setString(1, username);
    	 preparedStatement.setString(2, email);
    	 preparedStatement.setNString(3, password);
    	 
    	 preparedStatement.executeUpdate();
    	 
	}
	
	public boolean  getData(UserModel user) throws Exception {
		 PreparedStatement pst=con.prepareStatement("select * from user where username=?");
    	 pst.setString(1, user.getUsername());
    	 
		 ResultSet resultSet = pst.executeQuery();
		 if(resultSet.next()==false) {
				return false;
			}
			String Uname="";
			String pass="";
			while(resultSet.next()){
				Uname=resultSet.getString(1);
				pass=resultSet.getString(3);
			}
			
			if(Uname.equals(user.getUsername()) && pass.equals(user.getPassword()))
				return true;
			else 
			  return false;
		
	}
		

}
