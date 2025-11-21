package RideSharingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RideStatus {
    Scanner sc = new Scanner(System.in);

    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Driver> drivers = new ArrayList<>();
    ArrayList<Ride> rides = new ArrayList<>();


    public void bookBikeRide() 
    {
        Customer foundCustomer = null;
        Driver foundDriver=null;
        System.out.print("Enter Customer ID: ");
        String cid = sc.next();
        System.out.print("Enter Driver ID: ");
        String did = sc.next();

        for (Customer cId : customers) {
            if (cId.getCustomerId() == cid) {
                foundCustomer = cId;
                return;
            }
        }

        for (Driver dId : drivers) {
            if (dId.getDriverId() == did) {
                foundDriver = dId;
                return;
            }
        }

        if (foundCustomer == null || foundDriver  == null) {
            System.out.println(" Invalid Customer or Driver ID!");
            return;
        }
    
        System.out.print("Enter Source: ");
        String src = sc.next();
        System.out.print("Enter Destination: ");
        String dest = sc.next();
        System.out.print("Enter Fare: ");
        double fare = sc.nextDouble();

        Ride ride = new Ride(cid, did, src, dest, fare);
        rides.add(ride);
        foundCustomer.addCustomerRide(ride);;
        foundDriver.addDriverRide(ride);

        System.out.println("Bike Ride booked successfully! Ride ID: " + ride.getRideId());

    }
     

    public void cancelBikeRide() 
    {
        Ride rideToCancel = null;
        
        System.out.print("Enter Customer ID: ");
        String cid = sc.next();
        System.out.print("Enter Ride ID: ");
        String rid = sc.next();

        for (Ride r : rides) {
            if (r.getRideId() == rid && r.getDriverId()==cid) {
                rideToCancel = r;
                return;
            }
        }

        if (rideToCancel == null) {
            System.out.println(" Ride not found for given Customer");
            return;
        }

        if (rideToCancel.getStatus()=="Cancel") {
            System.out.println("Ride is already cancelled!");
            return;
        }
        else{
            rideToCancel.setStatus("Cancel");
            System.out.println("Bike Ride " + rid + " cancelled successfully!");
        }

    }

    // Display rides for a customer
    public void displayCustomerRides() {
        System.out.print("Enter Customer ID: ");
        String cid = sc.next();

        for (Customer c : customers) {
            if (c.getCustomerId().equals(cid)) {
                c.displayRides();
                System.out.println("Total Bill: " + c.calculateTotalFare());
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    // Display rides for a driver
    public void displayDriverRides() {
        System.out.print("Enter Driver ID: ");
        String did = sc.next();

        for (Driver d : drivers) {
            if (d.getDriverId().equals(did)) {
                d.displayRides();
                return;
            }
        }
        System.out.println("Driver not found.");
    }
    
}
