import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private  Car car1;

    @Before

    public void createCar(){
        car1 = new Car(100,2);

    }

    @Test
    public void testIsWorking() {
        boolean carDrived = car1.turnOnAndDrive(50);
        boolean carBroked = car1.isBrokenDown();

        assertEquals(!carBroked, carDrived);


    }

    @Test
    public void someMilesWorking() {
        assertFalse(car1.turnOnAndDrive(200));

    }

    @Test
    public void testGetMillage(){
        assertEquals(100, car1.getMileage(), 0.01);
    }

    @Test
    public void testGetGallons(){
        assertEquals(2, car1.getGaGallons(), 0.01);
    }






}