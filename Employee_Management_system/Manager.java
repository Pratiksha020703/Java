package java.JavaProject14_25.src.Employee_Management_system;

public class Manager extends Employee{
    String departmentName;

	public Manager(int id, String name, double salary, String departmentName) 
	{
		super(id, name, salary);
		this.departmentName = departmentName;
	}
	
	@Override
	public void employeeDetails()
	{
		System.out.println("ID:"+id+" Name: "+name+" Salary:"+salary+" Department name:"+departmentName);
	}


}
