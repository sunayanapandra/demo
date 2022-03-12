package com.resultapp.model;

import com.resultapp.dao.EmployeeDao;

public class EmployeeTest {
	public static void main(String[]args) throws Exception {
		
		//employee details
		Employee E1 =  new Employee("sandeep");
System.out.println(E1.name + "-" + E1.reg_no);
		
		EmployeeDao employeeDAO = new EmployeeDao();
		employeeDAO.addEmployee(E1);
		
	}

		
}


