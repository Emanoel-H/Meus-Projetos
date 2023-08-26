package br.com.company.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.company.domain.ConnectionFactory;

public class InsertTest {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recoverConnection();
		
		Statement stm = connection.createStatement();
		
		stm.execute("INSERT INTO employees (name, surname) VALUES ('Pam', 'Beesly')", Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = stm.getGeneratedKeys();
		
		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("The employee Id created was: " + id);
		}
		
		
	}

}
