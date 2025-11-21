package Hospital_Management_System;

import java.util.Scanner;

public class Hospital_function
{
    Scanner sc = new Scanner(System.in);
	Hospital hos[];
	
	static int p_count;

	public
	Hospital_function() 
    {
		hos=new Hospital[100];
		p_count = 0;
	}

    void addPatient() 
    {	
		System.out.println("Enter the Patient id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter the Patient name : ");
		String p_name = sc.next();
		
        System.out.println("Enter the Patient Address : ");
		String p_add = sc.next();
		hos[p_count]=new Hospital(id, p_name, p_add);
		p_count++;
        System.out.println(" Patient Admitted Successfully..");
		
	}


    void searchByPatientId() 
    {
        System.out.println("Enter Patient Id : ");
        int id = sc.nextInt();
            for(int i = 0;i<p_count;i++) {
                if(hos[i].getPatientId()==id) {
                    System.out.println("Found");
                    System.out.println(hos[i].toString());
                    return;
                }
                
            }
        System.out.println("Not found");
	}

    void displayAllPatient() 
    {
	    for(int i = 0;i<p_count;i++)
        {
		    System.out.println(hos[i].toString());
	    }
    }

    void dischargePatient()
    {
        System.out.println("Enter Patient Id : ");
        int id = sc.nextInt();
        for(int i = 0;i<p_count;i++) 
        {
            if(hos[i].getPatientId()==id) 
            {
                System.out.println("Found");
                if (hos[i].isIsdischarge() == false) 
                {
                    hos[i].setIsdischarge(true);
                    System.out.println(" Patient Discharge Successfully..");
                    return;
                }

                else
                {
                    System.out.println("Not found");
                }                    
            }
	    }
    }

    void displayDischargePatient(){
        for(int i = 0;i<p_count;i++)
        {
            if (hos[i].isIsdischarge() == false) {

                System.out.println(hos[i].toString());
            }
		    
	    }
    }


}
