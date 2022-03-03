package com.workout.company.repo;

import java.util.ArrayList;
import java.util.List;

public class CompanyRepositoryImpl implements CompanyRepository {
	
	static List<Company> companyList=new ArrayList<Company>();

	public List<Company> getAllCompany() {
		
		return companyList;
	}

	public Company getCompany(int id) {
		
		Company resCompany=null;
		for(Company company:companyList)
		{
			if(company.getId()==id)
			{
				resCompany=company;
			}
		}
		return resCompany;
	}

	public boolean addCompany(Company company) {
		
		return companyList.add(company);
	}

	public boolean removeCompany(int id) {
		Company company=getCompany(id);
		return companyList.remove(company);
	}

	public boolean updateCompany(int id, Company company) {
		companyList.remove(id);
		return companyList.add(company);
	}
	
	

}
