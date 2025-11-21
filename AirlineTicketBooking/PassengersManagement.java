package AirlineTicketBooking;

import java.util.ArrayList;

import EmployeeManagementSystem.Employee;

public class PassengersManagement {
    boolean flag;
    ArrayList<PassengerDetails> passengers;

    public PassengersManagement() {

    }
    
    public void addPassengers(PassengerDetails p)
	{
		passengers.add(p);
		System.out.println("Passengers added successfully...");
	}

    public void removePassengers(int id)
	{
		for(PassengerDetails p: passengers)
		{
			if(p.getId()==id)
			{
				passengers.remove(p);
				System.out.println("Employee removed successfully...");
				return;
			}
		}
	}

    public void searchPassengers(int seatNo){
        for (PassengerDetails p : passengers) {
            if (p.getSeatNo()==seatNo) {
                flag = true;
                System.out.println("Passenger matched successfully...");
                return;
            }
        }
    }

    public void displayPassengers()
	{
		for(PassengerDetails p: passengers)
		{
			p.toString();
		}
	}
}
