package br.com.company.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.company.dao.EmployeesDAO;
import br.com.company.domain.ConnectionFactory;
import br.com.company.domain.Employees;

public class SelectTestWithObject {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionFactory().recoverConnection()){
			EmployeesDAO employeesDAO = new EmployeesDAO(con);
			List<Employees> employeesList = employeesDAO.readData();
			employeesList.stream().forEach(el -> System.out.println(el));
			}

	}

}
