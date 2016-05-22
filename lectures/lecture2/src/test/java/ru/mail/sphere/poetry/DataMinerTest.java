package ru.mail.sphere.poetry;

import org.junit.Before;
import org.junit.Test;

public class DataMinerTest {

    private DataMiner dataMiner;

    @Before
    public void setUp() throws Exception {
        dataMiner = new DataMiner(this.getClass().getResource("/WordsSet.txt").getPath());
    }

    @Test
    public void simpleTest() {

    }
}