package com.amdocs.propertysearch.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	 public Connection getConnection() {
		Connection c= null;
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver"); //registration
			 c=DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:1521:orcl","scott","tiger"); //connection
		 }catch(Exception e) {
			 System.out.println("Connection Error");
		 }
		
		return c;
		
	  }
	}