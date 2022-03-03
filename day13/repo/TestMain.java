package com.workout.company.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char flag = 'n';
		CompanyRepositoryImpl comImp=new CompanyRepositoryImpl();
		EmployeeRepositoryImpl empImpl=new EmployeeRepositoryImpl();
		do
		{
		System.out.println("1.Add a Company\n2.Get all Company\n3.get a Company\n"
				+ "4.remove a company\n5.update a company");
		int cOption=Integer.parseInt(scan.nextLine());
		switch(cOption)
		{
		case 1:
			System.out.println("Enter Company details");
			String cDetails = scan.nextLine();
			Company company = Company.createCompany(cDetails);
			comImp.addCompany(company);
			char empflag='n';
			do
			{
			System.out.println("Add a Employee");
			System.out.println("Enter Employee details");
			String eDetails = scan.nextLine();
			Employee emp = Employee.createEmployee(eDetails);
			
			empImpl.addEmployee(emp, company);
			
			System.out.println("Do you wnat to continue (y/n)");
			empflag = scan.nextLine().charAt(0);
			}while(empflag=='y');
			break;
		case 2:
			List<Company> comList=comImp.getAllCompany();
			for(Company comp:comList)
			{
				System.out.println(comp);
			}
			break;
		case 3:
			System.out.println("Enter company id");
			int cId=Integer.parseInt(scan.nextLine());
			Company resCompany=comImp.getCompany(cId);
			System.out.println(resCompany);
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
		
		System.out.println("Do you wnat to continue (y/n)");
		flag = scan.nextLine().charAt(0);
	} while (flag == 'y');
		
	}
}
