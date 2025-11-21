package java.JavaProject14_25.src.Employee_Management_system;

public class Employee {
    int id;
	String name;
	double salary;
	
	static int empCount;
	static double raisePercent;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		empCount++;
	}
	
	public void employeeDetails()
	{
		System.out.println("ID:"+id+" Name:"+name+" Salary:"+salary);
	}
	
	public static void displayTotalCount()
	{
		System.out.println("Total Employee Count:"+empCount);
	}
	
	public static void setRaise(double percent)
	{
		raisePercent = percent;
	}
	
	public void applyRaise()
	{
		double hike = salary * raisePercent/100;
		salary = salary + hike;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
