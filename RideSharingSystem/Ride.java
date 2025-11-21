package RideSharingSystem;

public class Ride {
    private static int generateRideId ;
    String rideId;
    String customerId;
    String driverId;
    String source;
    String destination;
    double fare;
    String status;

    public Ride(String customerId, String driverId, String source, String destination, double fare) {
       // this.rideId = rideId;
        this.customerId = customerId;
        this.driverId = driverId;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.rideId = "RIDE"+(generateRideId++);
        this.status="Booked";
    }
    



    public String getRideId() {
        return rideId;
    }
    public void setRideId(String rideId) {
        this.rideId = rideId;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getDriverId() {
        return driverId;
    }
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public double getFare() {
        return fare;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }
    

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }




    @Override
    public String toString() {
        return "Ride [rideId=" + rideId + ", customerId=" + customerId + ", driverId=" + driverId + ", source=" + source
                + ", destination=" + destination + ", fare=" + fare + ", status=" + status + "]";
    }



    
    
}
