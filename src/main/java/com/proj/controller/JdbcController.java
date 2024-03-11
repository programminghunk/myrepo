package com.proj.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.proj.util.Util;
import com.proj.util.Utility;

public class JdbcController {
	
	/*public void createTable()
	{
		Connection conn=Util.getConnection();
		
		String sql="CREATE TABLE EMPLOYEE(ID INT PRIMARY KEY, NAME VARCHAR(45),DEPT VARCHAR(45), SALARY INT)";
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(sql);
			pst.execute();
			System.out.println("Table created successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Table not created!!!");
		}
		
	}*/
	
	public void insertEmployee()
	{
		Connection conn=Util.getConnection();
		
		String sql="INSERT INTO EMPLOYEE VALUES(5,'Shyam','CSE',10000)";
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(sql);
			pst.execute();
			System.out.println("DATA created successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Table not created!!!");
		}
		
	}

}
