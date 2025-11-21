package AirlineTicketBooking;

import java.util.ArrayList;


public class PassengerDetails {
    private static int id;
    private String name;
    private int seatNo;

    
    public PassengerDetails(int id, String name, int seatNo) {
        this.id = id;
        this.name = name;
        this.seatNo = seatNo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    


    @Override
    public String toString() {
        return "PassengerManagement [id=" + id + ", name=" + name + ", seatNo=" + seatNo + "]";
    }

    

    
}
