package exercises.technology;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class Program {

    Computer testComputer;

    Laptop testLaptop;

    SmartPhone testSmartPhone;

    @Before

    public void createComputer() {
        testComputer = new Computer(24, 2, true, 5, 1234);
    }

    @Before
    public void createLaptop() {
        testLaptop = new Laptop(true, 14, 5, false, 6, 1235);
    }

    @Before
    public void createSmartPhone() {
        testSmartPhone = new SmartPhone("null", 8, 20, true, 9, 1236);
    }


//computertests

    @Test
    public void brightnessIncreasesbyOne (){
        testComputer.increaseBrightnessLevel();
        assertEquals(6, testComputer.getBrightnessLevel(), .001);
    }

    @Test
    public void makeNoiseReturnsTrue () {
        testComputer.makeNoise();
        assertEquals("you've got mail", testComputer.makeNoise());
    }

    @Test
    public void brightnessLevelCheck () {
        testComputer.getBrightnessLevel();
        assertEquals(5, testComputer.getBrightnessLevel(), .001);
    }

    //laptoptests
    @Test
    public void hasNumberKeypadReturnsNumbers () {
        testLaptop.getHasNumberKeyPad();
        assertEquals(true, testLaptop.getHasNumberKeyPad());
    }

    @Test
    public void idReturnsExpected () {
        testLaptop.createNewID();
        assertEquals(1236, testLaptop.id);
    }

    @Test
    public void brightnessLevelCheckLaptop () {
        testLaptop.increaseBrightnessLevel();
        assertEquals(7, testLaptop.getBrightnessLevel());
    }

    //smartphonetests

    @Test
    public void requiresPasswordReturnsFalse () {
        testSmartPhone.getPassword();
        assertTrue(testSmartPhone.requirePassword() == false);
    }

    @Test
    public void checkBatteryLife () {
        assertEquals(20, testSmartPhone.getBatteryLife(), .001);
    }

    @Test
    public void idsDifferentReturnsTrue () {
        testLaptop.createNewID();
        testSmartPhone.createNewID();
        assertFalse(testLaptop.id == testSmartPhone.id);
    }

}
