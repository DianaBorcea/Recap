import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

    static ParkingLot parkingLot;
    static Car car, car1;
    static Bus bus;

    @BeforeClass
    public static void createVehicle() {
         car = new Car("CJ38TYR");
         car1 = new Car("Cj0osos;");
         bus = new Bus("dhdh");
         parkingLot = new ParkingLot();
    }

    @Test
    public void parkVehicleTest(){
        assertTrue(parkingLot.parkVehicle(car));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parkVehicleTestError(){
        assertTrue(parkingLot.parkVehicle(car1));
        parkingLot.parkVehicle(car1);

    }

    @Test
    public void parkMyBus(){
        assertTrue(parkingLot.parkVehicle(bus));
    }


    @Test(expected = IllegalArgumentException.class)
    public void parkVehicleBusTestError(){
        assertTrue(parkingLot.parkVehicle(bus));
        parkingLot.parkVehicle(bus);

    }

    @Test
    public void noMorePlacesAvailable(){
        ParkingLot parkingLot = new ParkingLot();
        for (int i= 0; i<20; i++){
            parkingLot.parkVehicle(new Bus("fff"));
        }
        assertEquals(parkingLot.parkVehicle(new Bus("DF")), false);


    }

}