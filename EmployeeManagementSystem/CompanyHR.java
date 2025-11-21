package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyHR {
    ArrayList<Department> departments = new ArrayList<Department>();
	Scanner sc=new Scanner(System.in);
	static int id = 1001;
	public void addDepartment()
	{
		System.out.println("Enter Department name:");
		String dname = sc.next();
		Department d = new Department(dname);
		departments.add(d);
	}
	
	public void displayDepartment()
	{
		for(Department d : departments)
		{
			System.out.println(d.toString());
		}
	}

	public void addEmployeeToDept()
	{
		System.out.println("Enter department name:");
		String dname = sc.next();
		for(Department d: departments)
		{
			if(d.departmentName.equalsIgnoreCase(dname))
			{
				System.out.println("Enter your choice- \n1.Employee \n2.Manager");
				int ch=sc.nextInt();
				System.out.println("Enter details name, salary:");
				
				String name = sc.next();
				double salary = sc.nextDouble();
				if(ch==1) 
				{
					Employee emp = new Employee(id++, name, salary);
					d.addEmployee(emp);
					System.out.println("Employee added successfully...");
					return;
				}
				else if(ch==2)
				{	
					Manager mgr=new Manager(id++, name, salary, d.departmentName);
					d.addEmployee(mgr);
					System.out.println("Manager added successfully...");
					return;
				}
			}
		}
		System.out.println("Department not found");
	}
	
	public void displayDeptEmployees()
	{
		System.out.println("Enter department name:");
		String name = sc.next();
		for(Department d: departments)
		{
			if(d.departmentName.equalsIgnoreCase(name))
			{
				d.displayEmployees();
			}
		}
	}
	
	public void removeEmployeeFromDept()
	{
		System.out.println("Enter Department name:");
		String dname = sc.next();
		for(Department d: departments)
		{
			if(d.departmentName.equalsIgnoreCase(dname))
			{
				System.out.println("Enter employee id:");
				int id = sc.nextInt();
				d.removeEmployee(id);
				System.out.println("Remove employee of ID:"+id+" successfully");
				Employee.empCount--;
				return;
			}
		}
		System.out.println("Department not found");
	}
	
	public void applyRaiseToAll() 
	{
		System.out.println("Enter hike percentage:");
		double percent = sc.nextDouble();
		Employee.setRaise(percent);
		for(Department d: departments)
		{
			for(Employee e: d.employees)
			{
				e.applyRaise();
			}
		}
	}
	
	public void displayEmpCount()
	{
		System.out.println("Enter Department name:");
		String dname = sc.next();
		for(Department d: departments)
		{
			if(d.departmentName.equalsIgnoreCase(dname))
			{
				Employee.displayTotalCount();
			}
		}
	}

}
