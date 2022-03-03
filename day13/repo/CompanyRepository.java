package com.workout.company.repo;

import java.util.List;

public interface CompanyRepository {

	public List<Company> getAllCompany();
	public Company getCompany(int id);
	public boolean addCompany(Company company);
	public boolean removeCompany(int id);
	public boolean updateCompany(int id,Company company);
	
}
