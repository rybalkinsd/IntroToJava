package ru.mail.sphere.collection;

import com.sun.javafx.binding.StringFormatter;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionSamplesTest {

    @Test
    public void testDescendingSort() throws Exception {
        List<Integer> sorted = CollectionSamples.descendingSort(Arrays.asList(7, 4, 21, 8, 19, 3, 0, 6));
        if (sorted.size() <= 1) {
            return;
        }

        for (int i = 1; i < sorted.size(); i++) {
            assertTrue(sorted.get(i) <= sorted.get(i - 1));
        }

    }

    @Test
    public void testDescendingSort_FunctionalWay() throws Exception {
        List<Integer> sorted = CollectionSamples.descendingSort_FunctionalWay(Arrays.asList(7, 4, 21, 8, 19, 3, 0, 6));
        if (sorted.size() <= 1) {
            return;
        }

        for (int i = 1; i < sorted.size(); i++) {
            assertTrue(sorted.get(i) <= sorted.get(i - 1));
        }
    }

    @Test
    public void testGetUnique() throws Exception {
        List<Integer> integers = Arrays.asList(1, 1, 3, 8, 12, 1, 31, 3, 16);
        List<Integer> unique = CollectionSamples.getUnique(integers);
        Collections.sort(integers);

        if (unique.size() <= 1) {
            return;
        }

        for (int i = 1; i < unique.size(); i++) {
            assertNotEquals(unique.get(i), unique.get(i - 1));
        }
    }

    @Test
    public void testToString1() throws Exception {
        Map<String, Calendar> history = new TreeMap<>();
        assertEquals("Map: {}", CollectionSamples.toString(history));

        history.put("Australia", new Calendar.Builder()
                .setDate(1788, 1, 28)
                .build());

        history.put("Waterloo", new Calendar.Builder()
                .setDate(1815, 18, 6)
                .build());

        history.put("America", new Calendar.Builder()
                .setDate(1492, 10, 12)
                .build());
        System.out.println(CollectionSamples.toString(history));
    }

    @Test
    public void printTest() throws Exception {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        // Compilation error :(
        // CollectionSamples.printList_bad(integers);

        // ok
        CollectionSamples.printList_good(integers);
    }


}