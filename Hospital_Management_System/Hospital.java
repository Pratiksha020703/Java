package Hospital_Management_System;

public class Hospital 
{
    private int patientId;
	private String name;
	private String address;
	private boolean isdischarge;

    public 

        Hospital(int patientId, String name, String address) {
        this.patientId = patientId;
        this.name = name;
        this.address = address;
        this.isdischarge = false;
    }
    

        public int getPatientId() {
        return patientId;
    }


    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public boolean isIsdischarge() {
        return isdischarge;
    }


    public void setIsdischarge(boolean isdischarge) {
        this.isdischarge = isdischarge;
    }


    @Override
    public String toString() {
        return "Hospital [patientId=" + patientId + ", name=" + name + ", address=" + address + ", isdischarge="
                + isdischarge + "]";
    }

    
        
}
