package com.proj.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util{
	public static Connection getConnection()
	{
		Connection conn=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("ERROR NOT FOURND");
		//e.printStackTrace();
	}
    //Getting the connection
    String mysqlUrl = "jdbc:mysql://localhost:3306/employee_db";
    try {
		conn = DriverManager.getConnection(mysqlUrl, "root", "root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return conn;
	}

}
