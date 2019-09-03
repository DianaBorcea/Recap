public class PartTwo {

    public double testCar(){
        Car car1 = new Car(0, 10);
        double miles = 10.0;

        while(true){
            if(car1.turnOnAndDrive(miles)){
                miles +=10;
            }
            else if(!car1.isBrokenDown()){
                car1.fillGas(10);
            }
            else{
                return car1.getMileage();
            }
        }

    }
}
