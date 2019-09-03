import java.util.Random;

public class Car implements Drive {

    private static final int MILES_PER_GALLON = 25;

    private double milesDriven;
    private double gasGallons;
    private boolean brokenDown;



    public Car(double milesDriven, double gasGallons) {
        this.milesDriven = milesDriven;
        this.gasGallons = gasGallons;
        this.brokenDown = false;
    }

    public boolean turnOnAndDrive(double milestToDrive) {
        if(this.brokenDown) return false;
        if(isCarBreakingDown()) return false;
        return enoughGasGallons(milestToDrive);

    }



    public boolean isCarBreakingDown(){
        Random random = new Random();
        if (random.nextInt(100) + 1 <= getBreakDownChance()){
            this.brokenDown = true;
            return true;
        }
        return false;
    }

    public boolean enoughGasGallons( double milesToDrive){
        double gallonsNeeded = milesToDrive / MILES_PER_GALLON ;
        if(milesToDrive/25 <= this.gasGallons){
            this.gasGallons -=gallonsNeeded;
            this.milesDriven += milesToDrive;
            return true;
        }
        this.milesDriven += this.gasGallons *MILES_PER_GALLON;
        this.gasGallons = 0;
        return false;

    }

    public int getBreakDownChance(){
        return (((int)milesDriven -1)/10000 +1)*10;

    }


    public double getMileage() {
        return this.milesDriven;
    }

    public double getGaGallons() {
        return this.gasGallons;
    }

    public boolean isBrokenDown() {
        return this.brokenDown;
    }

    public void repair() {
        this.brokenDown = false;

    }

    public void fillGas(double numberOfGallons) {
        this.gasGallons += numberOfGallons;

    }
}
