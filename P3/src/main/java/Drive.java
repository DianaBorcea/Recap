public interface Drive {

    /**
     * Attempts to drive # miles, returns true for success or false for fail
     */
    public boolean turnOnAndDrive(double milestToDrive);

    /**
     * Returns the number of miles this car has driven.
     */
    public double getMileage();

    /**
     * Returns the number of gas gallons has its tank.
     */
    public double getGaGallons();


    /**
 * Returns true if the car is broken down, and false otherwise.
 */
    public boolean isBrokenDown();

    /**
     * Sets the car as no longer broken down
     */
    public void repair();

    /**
     * Adds the given number of gallons of gas to the car’s gas tank
     */
    public void fillGas(double numberOfGallons);


}
