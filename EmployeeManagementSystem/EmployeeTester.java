package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeTester {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		CompanyHR hr = new CompanyHR();
		do {
			
			System.out.println("1.Add Department 2.Add Employee/Manager"
					+ " 3.Display Employees of a Department 4.Remove Employee"
					+ " 5.Apply Raise to all Employees 6.Exit 7.Display all departments"
					+ " 8.Display employee count");
			
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				hr.addDepartment();
				break;
			case 2:
				hr.addEmployeeToDept();
				break;
			case 3:
				hr.displayDeptEmployees();
				break;
			case 4:
				hr.removeEmployeeFromDept();
				break;
			case 5:
				hr.applyRaiseToAll();
				break;
			case 6:
				System.out.println("Exiting ...");
				break;
			case 7:
				hr.displayDepartment();
				break;
			case 8:
				hr.displayEmpCount();
				break;
			}	
			
		}while(ch != 8);
	}

}
