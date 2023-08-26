package br.com.company.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection recoverConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useTimezone=true&serverTimezone=UTC",
				"root" , "82551210Eh.");
		
//		return DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root");
	}
}
