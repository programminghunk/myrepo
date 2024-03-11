package com.proj.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR NOT FOURND");
			
			//e.printStackTrace();
		}
	    //Getting the connection
	   
	    
	    System.out.println("Connection established: "+conn);
		
	}

}
