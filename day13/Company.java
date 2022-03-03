package com.workout.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	private int id;
	private String name;
	private String description;
	private String location;
	private List<Employee> employeeList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int id, String name, String description, String location, List<Employee> employeeList) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
		this.employeeList = employeeList;
	}
	@Override
	public String toString() {
		return "Company id=" + id + ", name=" + name + ", description=" + description + ", location=" + location
				+ ", employeeList=" + employeeList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Company other = (Company) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
	
	public static Company createCompany(String details)
	{
		String[] spilltedDetail=details.split(",");
		
		Company company=new Company(Integer.parseInt(spilltedDetail[0]),spilltedDetail[1]
				, spilltedDetail[2],spilltedDetail[3], 
				new ArrayList<Employee>());
		
		return company;
		
	}
	

}
