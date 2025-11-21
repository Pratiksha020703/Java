package RideSharingSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {
    public static int generateDiverId;
    String driverId;
    String name;

    List<Ride> rides;

    public Driver(String driverId, String name) {
        rides = new ArrayList<>();
        this.driverId = driverId;
        this.name = name;
        generateDiverId++;
    }
    public String getDriverId() {
        return driverId;
    }
    // public void setDriverId(String driverId) {
    //     this.driverId = driverId;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }

    public void addDriverRide(Ride rideDiverId){
        for (Ride dRideid : rides) {
            if (dRideid.getDriverId() == rideDiverId.getDriverId()) {
                System.out.println("Diver is already added..");
                return;
            }
        }
        rides.add(rideDiverId);
        System.out.println("Diver added successfully...");
    }
    
    public void removeDriverRide(String rideDiverId){
        Iterator<Ride> itr = rides.iterator();
		while(itr.hasNext()) {
			Ride id = itr.next();
			// if(id.getCustomerId() == rideDiverId) {
			// 	rides.remove(rideDiverId);
			// 	System.out.println("Diver removed Successfully...");
			// 	return;
			// }
            if (id.getCustomerId().equals(rideDiverId)) 
            {
                itr.remove();
                System.out.println("Removed successfully...");
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


}
