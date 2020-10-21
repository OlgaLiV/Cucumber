package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HWMetaData {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	@Test
	public void resultSet() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_emp_emergency_contacts");
		ResultSetMetaData rsMetaData = rs.getMetaData();
		List<String> emergencyContacts = new ArrayList<>();
		for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
			String columnNames = rsMetaData.getColumnName(i);
			emergencyContacts.add(columnNames);
		}
		System.out.println(emergencyContacts);
		for (String emgContact : emergencyContacts) {
			System.out.println(emgContact);
		}

		System.out.println("---- Table Name ----");
		System.out.println(rsMetaData.getTableName(1));
		System.out.println("---- Column type name ----");
		for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
			String colTypeName = rsMetaData.getColumnTypeName(i);
			System.out.println(colTypeName);
		}
		rs.close();
		st.close();
		conn.close();
	}

}
