package mobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {

    @Test
    void checkAbonent1() {
        Point ab = new Point(5, 5);
        Station station = new Station("Megahorn", 0, 0, 10);
        Assertions.assertTrue(station.checkAbonent(ab));
    }

    @Test
    void checkAbonent2() {
        Point ab = new Point(5, 5);
        Station station = new Station("BipLine", 10,10, 10);
        Assertions.assertTrue(station.checkAbonent(ab));
    }

    @Test
    void checkAbonent3() {
        Point ab = new Point(5, 5);
        Station station = new Station("Ele2", 0,0, 1);
        Assertions.assertFalse(station.checkAbonent(ab));
    }

    @Test
    void checkAbonent4() {
        Point ab = new Point(5, 5);
        Station station = new Station("SkyPink", 100,100, 10);
        Assertions.assertFalse(station.checkAbonent(ab));
    }

    @Test
    void checkAbonent5() {
        Point ab = new Point(0, 5);
        Station station = new Station("Ele-ele", 0,0, 5);
        Assertions.assertTrue(station.checkAbonent(ab));
    }
}