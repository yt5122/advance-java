package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection1 {
	
		public static void getConnection() {
			
			String driver="org.postgresql.Driver";
			String url = "jdbc:postgresql://localhost:5432/advancejava";
			String username = "postgres";
			String password ="9751";
			
			try {
				Class.forName(driver);
			
			Connection con =DriverManager.getConnection(url , username , password);
			
				if (con == null) {
					
							System.out.println("db not connected");
					
				} else {

					System.out.println("db connected");
					
				}
			
			
			
			
			} catch (ClassNotFoundException e) {
					e.printStackTrace();
					
			} catch (SQLException e) {
		
				
				e.printStackTrace();
			}
		
			
			
		} 
  
		public static void main(String[] args) {
			
					getConnection();
		
		}
	}
