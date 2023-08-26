package br.com.company.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.company.dao.EmployeesDAO;
import br.com.company.domain.ConnectionFactory;

public class DeleteTestWithObject {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Welcome to Dunder Muffin Paper Company");
		System.out.println("            Deleting System           ");
		System.out.println("======================================");
		System.out.println("Type the id of the fired employee: ");
		int id = sc.nextInt();
		
		try (Connection con = new ConnectionFactory().recoverConnection()){
			EmployeesDAO employeesDAO = new EmployeesDAO(con);
			
			employeesDAO.deleteData(id);
		}
		sc.close();
	}

}
