package gbtest;
import gb.list.GBArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GBArrayListTest {
    @Test
    void getTest() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        assertEquals("1", strings.get(0));
    }
    @Test
    void getNegativeTest() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        strings.add("2");
        assertNotEquals("2", strings.get(0));
    }
    @Test
    void sizeTest() {
        GBArrayList<Integer> integers = new GBArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(3);
        integers.add(9);
        integers.add(23);
        assertEquals(5,integers.size());
    }
    @Test
    void sizeNegativeTest() {
        GBArrayList<Integer> integers = new GBArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(3);
        integers.add(9);
        integers.add(23);
        assertNotEquals(3,integers.size());
    }
    @Test
    void addTest() {
        GBArrayList<Integer> integers = new GBArrayList<>();
        integers.add(45);
        assertEquals(45, integers.get(0));
        assertTrue(integers.add(5));
    }
    @Test
    void removeTest() {
        GBArrayList<Integer> integers = new GBArrayList<>();
        integers.add(3);
        integers.add(7);
        integers.add(5);
        integers.remove(1);
        assertSame(5, integers.get(1));
    }
    @Test
    void removeNegativeTest() {
        GBArrayList<Integer> integers = new GBArrayList<>();
        integers.add(3);
        integers.add(7);
        integers.add(5);
        integers.remove(1);
        assertNotSame(7, integers.get(1));
    }
    @Test
    void updateTest() {
        GBArrayList<Integer> integers = new GBArrayList<>();
        integers.add(3);
        integers.add(7);
        integers.add(5);
        integers.update(1, 9);
        assertSame(9, integers.get(1));
    }
    @Test
    void updateNegativeTest() {
        GBArrayList<Integer> integers = new GBArrayList<>();
        integers.add(3);
        integers.add(7);
        integers.add(5);
        integers.update(1, 9);
        assertNotSame(7, integers.get(1));
    }
}
