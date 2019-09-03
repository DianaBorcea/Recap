public class Vehicle {

   private boolean isParked;
   private int parkingNumber;

    public Vehicle() {
        this.isParked = false;
        this.parkingNumber = -1;
    }

    public boolean isParked() {
        return isParked;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }



    public void setParkingNumber(int parkingNumber) {
        this.parkingNumber = parkingNumber;
    }
}
