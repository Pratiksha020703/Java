package RideSharingSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    private static int generateCustomerId;
    String customerId;
    String name;

    List<Ride> rides;

    public Customer(String customerId, String name) {
        rides = new ArrayList<>();
        this.customerId = customerId;
        this.name = name;
        generateCustomerId++;
    }

    public String getCustomerId() {
        return customerId;
    }

    // public void setCustomerId(String customerId) {
    //     this.customerId = customerId;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public void addCustomerRide(Ride rideId){
        for (Ride id : rides) {
            if (id.getCustomerId() == rideId.getCustomerId()) {
                System.out.println("Customer is already added..");
                return;
            }
        }
        rides.add(rideId);
        System.out.println("Customer added successfully...");
    }

     public void removeCustomerRide(String rid){
        Iterator<Ride> itr = rides.iterator();
		while(itr.hasNext()) {
			Ride id = itr.next();
			if(id.getCustomerId() == rid) {
                
				rides.remove(rid);
				System.out.println("Customer removed Successfully...");
				return;
			}
		}
     }

    public void displayRides() {
        if (rides.isEmpty()) {
            System.out.println(name + " has no rides.");
            return;
        }
        System.out.println("Rides for " + name + ":");
        for (Ride r : rides) {
            System.out.println(r);
        }
    }

    // Calculate total fare for this customer
    public double calculateTotalFare() {
        double total = 0;
        for (Ride r : rides) {
            if (!r.getStatus().equalsIgnoreCase("Cancel")) {
                total += r.getFare();
            }
        }
        return total;
    }
    
}
