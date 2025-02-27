package com.tnsif.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//demo for JDBC

public class JDBCselect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load and register the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("load is over");
		
		//establish the connection
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/harsha","postgres","meghu123");
		// create statement
		Statement st= con.createStatement();
		//execute query
		String strselect = "select name,sbranch from student";
		System.out.println("The SQL statement is"+ strselect);
		//process the result
		ResultSet rs = st.executeQuery(strselect);
		System.out.println("The recordds are");
		int rowcount=0;
		while(rs.next()) {
			String name = rs.getString("name");
			String sbranch = rs.getString("sbranch");
			System.out.println(name+" "+sbranch);
		}
		
	}

}
