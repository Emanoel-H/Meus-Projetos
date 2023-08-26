package br.com.company.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.company.dao.EmployeesDAO;
import br.com.company.domain.ConnectionFactory;

public class UpdateTestWithObject {

	public static void main(String[] args) throws SQLException {
		
		try (Connection con = new ConnectionFactory().recoverConnection()){
			EmployeesDAO employeesDAO = new EmployeesDAO(con);
			employeesDAO.updateData();
			}
	}

}
