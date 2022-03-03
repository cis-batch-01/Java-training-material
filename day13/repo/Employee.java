package com.workout.company.repo;

public class Employee {

	private Integer id;
	private String name;
	private String designation;
	private Long mobileNo;
	private Double salary;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(Integer id, String name, String designation, Long mobileNo, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.mobileNo = mobileNo;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nEmployee id=" + id + "\nname=" + name + "\ndesignation=" + designation +
				"\nmobileNo=" + mobileNo
				+ "\nsalary=" + salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
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
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (mobileNo == null) {
			if (other.mobileNo != null) {
				return false;
			}
		} else if (!mobileNo.equals(other.mobileNo)) {
			return false;
		}
		return true;
	}
	
	public static Employee createEmployee(String detail)
	{
		String[] splittedDetail=detail.split(",");
		Employee employee=new Employee(Integer.parseInt(splittedDetail[0]), splittedDetail[1]
				, splittedDetail[2], Long.parseLong(splittedDetail[3]),
				Double.parseDouble(splittedDetail[4]));
		return employee;
		
	}
	
}
