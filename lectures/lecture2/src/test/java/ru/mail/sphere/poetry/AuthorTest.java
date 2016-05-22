package ru.mail.sphere.poetry;

import org.junit.Test;

public class AuthorTest {

    @Test
    public void testLiBo() throws Exception {
        String plot = new LiBo().write();
        System.out.println(plot);
    }

    @Test
    public void testLermontov() throws Exception {
        String plot = new Lermontov().write();
        System.out.println(plot);
    }
}