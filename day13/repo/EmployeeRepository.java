package com.workout.company.repo;

import java.util.List;

public interface EmployeeRepository {
	
	public List<Employee> getAllEmployee(Company company);
	public Employee getEmployee(int id,Company company);
	public boolean addEmployee(Employee employee,Company company);
	public boolean removeEmployee(int id,Company company);
	public boolean updateEmployee(int id,Employee employee,Company company);

}
