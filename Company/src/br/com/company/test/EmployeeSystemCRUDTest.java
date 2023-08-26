package br.com.company.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.company.dao.EmployeesDAO;
import br.com.company.domain.ConnectionFactory;

public class EmployeeSystemCRUDTest {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		try (Connection con = new ConnectionFactory().recoverConnection()){
			EmployeesDAO employeesDAO = new EmployeesDAO(con);
				employeesDAO.displayMenu();
				input = sc.nextInt();
				employeesDAO.enterSystem(input, employeesDAO);
			
			System.out.println();
			sc.close();
		}

	}

}
