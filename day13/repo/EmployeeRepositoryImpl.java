package com.workout.company.repo;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	public List<Employee> getAllEmployee(Company company) {
		return company.getEmployeeList();
	}

	public Employee getEmployee(int id, Company company) {
		List<Employee> empList=company.getEmployeeList();
		Employee resEmp=null;
		for(Employee employee:empList)
		{
			if(employee.getId()==id)
			{
				resEmp=employee;
			}
		}
		
		return resEmp;
	}

	public boolean addEmployee(Employee employee, Company company) {
		
		return company.getEmployeeList().add(employee);
	}

	public boolean removeEmployee(int id, Company company) {
		
		Employee emp=getEmployee(id,company);
		
		return company.getEmployeeList().remove(emp);
	}

	public boolean updateEmployee(int id, Employee employee, Company company) {
		
		company.getEmployeeList().remove(id);
		
		return company.getEmployeeList().add(employee);
	}

	

}
