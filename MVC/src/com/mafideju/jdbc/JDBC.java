package com.mafideju.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String user = "springstudent";
		String pass = "springstudent";

		try {
			
			System.out.println("Conectando na base de dados" + jdbcUrl);
			Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);
 			
			System.out.println("CONECTADO AO MYSQL --- =)" + connection);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
