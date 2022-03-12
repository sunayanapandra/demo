package com.resultapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.resultapp.model.Employee;

public class EmployeeDao {
	public void addEmployee(Employee employee) throws Exception {
		//Step 1 : Database Driver ( Optional)
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Step 2: Get the Connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user", "rev_user");
	//	insert into Employee(name) values ('sunnu')
		String query = "insert into Employee(name) values ('" + employee.name + "')" ;
				System.out.println(query);
				Statement statement = connection.createStatement();
				int rows = statement.executeUpdate(query);
				System.out.println("No of rows inserted:" + rows);
				
				
			}
		
	}


