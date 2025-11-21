package Hospital_Management_System;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Hospital_function hos = new Hospital_function();
        Scanner sc = new Scanner(System.in);
		int ch=0;
		System.out.println("=================Hospital Management System=================");
		
		do {
			System.out.println("1.Add Patient \n2.Display All Patient \n3.Search Patient \n4.Discharge Patient \n5.Display Admitted Patients \n0.Exit");
			System.out.println("Enter the choice");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					hos.addPatient();
					break;
					
				case 2:
					hos.displayAllPatient();
					break;
					
				case 3:
					hos.searchByPatientId();
					break;
					
				case 4:
					hos.dischargePatient();
					break;
					
				case 5:
					hos.displayDischargePatient();
					break;
					
				case 0:
					System.out.println("Get Well Soon...");
					break;
					
				default:
					System.out.println("Invalid Choice");
					break;
			}
			
		} while (ch!=0);
    }
}
