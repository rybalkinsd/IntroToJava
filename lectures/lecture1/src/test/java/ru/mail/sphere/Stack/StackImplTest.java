package ru.mail.sphere.Stack;

import org.junit.Before;
import org.junit.Test;
import ru.mail.sphere.CommonTwo;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackImplTest {

    private Stack<Integer> stack;
    @Before
    public void setUp() throws Exception {
        stack = new StackImpl<>();
    }

    @Test()
    public void testTest() throws Exception {
        assertNotNull(stack);
        assertNull(stack.peek());
        stack.push(1);
        assertEquals(Integer.valueOf(1), stack.peek());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertNull(stack.peek());
    }

    @Test(expected=NoSuchElementException.class)
    public void testExceptionThrowing() throws Exception {
        stack.pop();
        assertTrue(false);
    }
}