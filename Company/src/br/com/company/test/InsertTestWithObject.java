package br.com.company.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.company.dao.EmployeesDAO;
import br.com.company.domain.ConnectionFactory;
import br.com.company.domain.Employees;

public class InsertTestWithObject {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Welcome to Dunder Muffin Paper Company");
		System.out.println("            Sign-up System            ");
		System.out.println("======================================");
		System.out.println("Type your first name: ");
		String name = sc.nextLine();
		
		System.out.println("Type your surname: ");
		String surname = sc.nextLine();
		
		Employees employee = new Employees(name, surname);
		
		try (Connection con = new ConnectionFactory().recoverConnection()){
			EmployeesDAO employeesDAO = new EmployeesDAO(con);
			employeesDAO.createData(employee);
		}
		System.out.println(employee);
		sc.close();
	}
}
