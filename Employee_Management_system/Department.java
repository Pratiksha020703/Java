package java.JavaProject14_25.src.Employee_Management_system;

import java.util.ArrayList;

public class Department {
    String departmentName;
	ArrayList<Employee> employees;
	
	public Department(String departmentName) 
	{
		super();
		this.departmentName = departmentName;
		this.employees=new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
		System.out.println("Employee added successfully...");
	}
	
	public void removeEmployee(int id)
	{
		for(Employee e: employees)
		{
			if(e.id==id)
			{
				employees.remove(e);
				System.out.println("Employee removed successfully...");
				return;
			}
		}
	}
	
	public void displayEmployees()
	{
		for(Employee e:employees)
		{
			e.employeeDetails();
		}
	}

	@Override
	public String toString()
	{
		return "Department [departmentName=" + departmentName + ", employees=" + employees + "]";
	}
	

}
