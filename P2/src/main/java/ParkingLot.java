public class ParkingLot {

    boolean parkingPlaces[] = new boolean [100];


    public ParkingLot() {
        for(int i=0; i<=99; i++){
            parkingPlaces[i] = true;
        }
    }



    public boolean parkVehicle(Vehicle vehicle) {
        if(vehicle.isParked()){
            throw new IllegalArgumentException("Vehiculul este parcat!");
        }
        else {
            if (vehicle instanceof Car) {
                return parkCar(vehicle);

            } else if (vehicle instanceof Bus) {
                return parkBus(vehicle);
            }
        }
        return false;
    }

    private boolean parkBus(Vehicle vehicle) {
        for(int i = 0; i < 99; i += 10){
            if(findBusPlaces(i , i+9, vehicle)){
                return true;
            }

        }
        return false;

    }

    public boolean findBusPlaces(int startPosition, int endPosition, Vehicle vehicle){
        int count = 0;
       while(startPosition<=endPosition){
           if(parkingPlaces[startPosition]){
               count++;
           }
           else{
               count = 0;
           }
           if (count == 5 ){
               for(int i = startPosition -4 ; i<=startPosition; i++){
                   parkingPlaces[i] = false;

               }
               vehicle.setParked(true);
               vehicle.setParkingNumber(startPosition-4);
               return true;

           }

           startPosition++;
       }
       return false;

    }

    public boolean parkCar(Vehicle vehicle){
        for(int i=0; i<=99; i++){
            if(parkingPlaces[i]) {
                parkingPlaces[i] = false;
                vehicle.setParked(true);
                vehicle.setParkingNumber(i);
                return true;
            }
        }
        return false;

    }
}
