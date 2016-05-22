package ru.mail.sphere.poetry;

import org.junit.Test;

import static org.junit.Assert.*;

public class PoetryStringTest {

    @Test
    public void testSimpleCalculations() throws Exception {
        assertEquals(2, new PoetryString("ПЕВЕЦ").getLength());
        assertEquals(4, new PoetryString("Вздохнули ль вы").getLength());
    }

    @Test
    public void testBorodino() throws Exception {
        assertEquals(9, new PoetryString("Скажи ка дядя ведь не даром").getLength());
        assertEquals(9, new PoetryString("Москва спаленная пожаром").getLength());
        assertEquals(6, new PoetryString("Французу отдана").getLength());
        assertEquals(9, new PoetryString("Ведь были ж схватки боевые").getLength());
        assertEquals(9, new PoetryString("Да говорят, еще какие").getLength());
        assertEquals(9, new PoetryString("Недаром помнит вся Россия").getLength());
        assertEquals(6, new PoetryString("Про день Бородина").getLength());
    }
}