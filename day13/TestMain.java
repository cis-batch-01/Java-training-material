package com.workout.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char flag = 'n';
		Company company = null;

		System.out.println("Enter Company details");
		String cDetails = scan.nextLine();
		company = Company.createCompany(cDetails);
		List<Employee> employeeList = new ArrayList<Employee>();
		do {
			System.out.println("Enter Employee details");
			String eDetails = scan.nextLine();
			Employee emp = Employee.createEmployee(eDetails);
			employeeList.add(emp);
			// company.getEmployeeList().add(emp);

			System.out.println("Do you wnat to continue (y/n)");
			flag = scan.nextLine().charAt(0);
		} while (flag == 'y');
		company.setEmployeeList(employeeList);

		System.out.println(company);
	}
}
