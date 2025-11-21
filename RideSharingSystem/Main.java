package RideSharingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RideStatus rs = new RideStatus();

        int choice;
        do {
            System.out.println("\n====== Bike Ride System ======");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Driver");
            System.out.println("3. Book Bike Ride");
            System.out.println("4. Cancel Bike Ride");
            System.out.println("5. Display Customer Rides & Bill");
            System.out.println("6. Display Driver Rides");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Customer ID: ");
                    String cid = sc.next();
                    System.out.print("Enter Customer Name: ");
                    String cname = sc.next();
                    rs.customers.add(new Customer(cid, cname));
                    System.out.println("Customer added!");
                }

                case 2 -> {
                    System.out.print("Enter Driver ID: ");
                    String did = sc.next();
                    System.out.print("Enter Driver Name: ");
                    String dname = sc.next();
                    rs.drivers.add(new Driver(did, dname));
                    System.out.println("Driver added!");
                }

                case 3 -> rs.bookBikeRide();

                case 4 -> rs.cancelBikeRide();

                case 5 -> rs.displayCustomerRides();

                case 6 -> rs.displayDriverRides();

                
                case 0 -> System.out.println("Exiting system...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}
