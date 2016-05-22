package ru.mail.sphere.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PositiveNumbersCollectionTest {

    private PositiveNumbersCollection<Double> positiveDoubles;
    private PositiveNumbersCollection<Integer> positiveIntegers;

    @Before
    public void setUp() throws Exception {
        positiveDoubles = new PositiveNumbersCollection<Double>() {
            @Override
            public boolean predicate(Double aDouble) {
                return aDouble > 0;
            }
        };

        positiveIntegers = new PositiveNumbersCollection<Integer>() {
            @Override
            public boolean predicate(Integer integer) {
                return integer > 0;
            }
        };
    }

    @Test
    public void positiveDoublesTest() throws Exception {
        assertTrue(positiveDoubles.add(1.0));

        try {
            positiveDoubles.add(-1.2);
            assertTrue(false);
        } catch (UnsupportedArgumentException ignored) {
        }

        assertTrue(positiveDoubles.add(3.14));

        try {
            positiveDoubles.add(null);
            assertTrue(false);
        } catch (UnsupportedArgumentException ignored) {
        }

        assertTrue(positiveDoubles.remove(3.14));
        assertEquals(1, positiveDoubles.size());
    }

    @Test
    public void positiveIntegersTest() throws Exception {
        assertTrue(positiveIntegers.add(1));

        try {
            positiveIntegers.add(-1);
            assertTrue(false);
        } catch (UnsupportedArgumentException ignored) {
        }

        assertTrue(positiveIntegers.add(3));

        try {
            positiveIntegers.add(null);
            assertTrue(false);
        } catch (UnsupportedArgumentException ignored) {
        }

        assertTrue(positiveIntegers.remove(3));
        assertEquals(1, positiveIntegers.size());

        assertTrue(positiveIntegers.removeAll(Arrays.asList(2, 1)));
    }
}