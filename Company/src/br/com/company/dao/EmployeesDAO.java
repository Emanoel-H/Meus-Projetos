package br.com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.company.domain.Employees;

public class EmployeesDAO {
	private Connection con;
	
	public EmployeesDAO(Connection connection) {
		this.con = connection;
	}
	
	public void displayMenu() {
		System.out.println("==========================================");
		System.out.println("Welcome to Dunder Muffin Employee's System");
		System.out.println("Type \n1- Sign up \n2- Display all Employees"
				+ " \n3- Edit the data \n4- Fire an Employee \n9 Exit System");
		System.out.println("==========================================");
	}
	
	
	public void enterSystem(int input, EmployeesDAO edao) throws SQLException {
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		switch (input) {
			case 1:
				System.out.println("======================================");
				System.out.println("Welcome to Dunder Muffin Paper Company");
				System.out.println("            Sign-up System            ");
				System.out.println("======================================");
				System.out.println("Type your first name: ");
				String name = scanner1.nextLine();
				System.out.println("Type your surname: ");
				String surname = scanner1.nextLine();
				Employees employee = new Employees(name, surname);
				edao.createData(employee);
				System.out.println(employee);
				break;
			case 2:
				System.out.println("This is the Employee's List");
				List<Employees> employeesList = edao.readData();
				employeesList.stream().forEach(el -> System.out.println(el));
				break;
			case 3:
				edao.updateData();
				break;
			case 4:
				System.out.println("======================================");
				System.out.println("Welcome to Dunder Muffin Paper Company");
				System.out.println("            Deleting System           ");
				System.out.println("======================================");
				System.out.println("Type the id of the fired employee: ");
				int id = scanner2.nextInt();
				edao.deleteData(id);
			default:
				System.out.println("Type a valid option");
				
		}
			scanner1.close();
	}
	
	public void createData(Employees employee) throws SQLException {
		String sql = "INSERT INTO employees (name, surname) VALUES (?, ?)";
		
		try (PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			pstm.setString(1, employee.getName());
			pstm.setString(2, employee.getSurname());
			
			pstm.execute();
			
			try (ResultSet rst = pstm.getGeneratedKeys()){
				while(rst.next()) {
					employee.setId(rst.getInt(1));
				}
			}
		}
		
	}
	
	public List<Employees> readData() throws SQLException{
		List<Employees> employees = new ArrayList<Employees>();
		String sql = "SELECT * FROM employees";
		
		try(PreparedStatement pstm = con.prepareStatement(sql)){
			pstm.execute();
			
			try (ResultSet rst = pstm.getResultSet()){
				while (rst.next()) {
					Employees employee = new Employees(rst.getInt(1), rst.getString(2), rst.getString(3));
					
					employees.add(employee);
				}
			}
		}
		return employees;
	}
	
	public void updateData () throws SQLException {
		String name;
		String surname;
		int id;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Welcome to Dunder Muffin Paper Company");
		System.out.println("             Update System            ");
		System.out.println("======================================");
		System.out.println("Which id you want to update? ");
		id = sc1.nextInt();
		System.out.println("type the new name: \n");
		name = sc2.nextLine();
		System.out.println("type the new surname: ");
		surname = sc3.nextLine();
		
		String sql = "UPDATE employees SET name = ?, surname = ? WHERE id = ?";
		
		try(PreparedStatement pstm = con.prepareStatement(sql)){
			pstm.setString(1, name);
			pstm.setString(2, surname);
			pstm.setInt(3, id);
			
			pstm.execute();
		}
		sc1.close();
		sc2.close();
		sc3.close();
	}
	
	public void deleteData(int id) throws SQLException {
		String sql = "DELETE FROM employees WHERE id = ?";
		
		try(PreparedStatement pstm = con.prepareStatement(sql)){
			pstm.setInt(1, id);
			
			pstm.execute();
			
			int rowsAffected = pstm.getUpdateCount();
			
			System.out.println("The total rows affected were: " + rowsAffected);
		}
	}
	

}
