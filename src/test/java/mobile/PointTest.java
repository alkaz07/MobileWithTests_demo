package mobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testDistanceTo1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Assertions.assertEquals(0, a.distanceTo(b));
        Assertions.assertEquals(0, b.distanceTo(a));
    }

    @Test
    void testDistanceTo2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 100);
        Assertions.assertEquals(100, a.distanceTo(b));
        Assertions.assertEquals(100, b.distanceTo(a));
    }

    @Test
    void testDistanceTo3() {
        Point a = new Point(3, 0);
        Point b = new Point(0, 4);
        Assertions.assertEquals(5, a.distanceTo(b));
        Assertions.assertEquals(5, b.distanceTo(a));
    }

    @Test
    void testDistanceTo4() {
        Point a = new Point(3265, 5655);
        Point b = new Point(0, 100);
        Assertions.assertEquals( b.distanceTo(a), a.distanceTo(b));
    }
}