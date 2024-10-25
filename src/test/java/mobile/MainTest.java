package mobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getAvailableOperatorsMap0() {
        List<Station> stations = new ArrayList<>();
        Point ab = new Point(5,5);
        Map<String, Integer> actual = Main.getAvailableOperatorsMap(stations, ab);
        Map<String, Integer> expected = new HashMap<>();

        Assertions.assertIterableEquals(expected.entrySet(), actual.entrySet());
    }

    @Test
    void getAvailableOperatorsMap1() {
        Station s = new Station("T", 1, 1, 1);
        List<Station> stations = new LinkedList<>();
        stations.add(s);
        Point ab = new Point(5,5);
        Map<String, Integer> actual = Main.getAvailableOperatorsMap(stations, ab);
        Map<String, Integer> expected = new HashMap<>();

        Assertions.assertIterableEquals(expected.entrySet(), actual.entrySet());
    }

    @Test
    void getAvailableOperatorsMap2() {
        List<Station> stations = new LinkedList<>();
        stations.add(new Station("XXX", 1, 1, 10));
        Point ab = new Point(5,5);
        Map<String, Integer> actual = Main.getAvailableOperatorsMap(stations, ab);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("XXX", 1);

        Assertions.assertIterableEquals(expected.entrySet(), actual.entrySet());
    }

    @Test
    void getAvailableOperatorsMap3() {
        List<Station> stations = new LinkedList<>();
        stations.add(new Station("Megahorn", 0, 0, 10));
        stations.add(new Station("BeepLine", 10, 10, 10));
        stations.add(new Station("MPS", 0, 0, 10));
        stations.add(new Station("Ele2", 0, 0, 1));
        stations.add(new Station("SkyPink", 100, 100, 10));
        Point ab = new Point(5,5);
        Map<String, Integer> actual = Main.getAvailableOperatorsMap(stations, ab);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Megahorn", 1);
        expected.put("BeepLine", 1);
        expected.put("MPS", 1);
        Assertions.assertIterableEquals(expected.entrySet(), actual.entrySet());
    }
}