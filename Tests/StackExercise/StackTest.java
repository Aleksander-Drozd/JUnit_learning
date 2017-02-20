package StackExercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private StackExercise stack;

    @Before
    public void setUp(){
        stack = new Stack();
    }

    @Test
    public void pop_top_oneElementStack() throws Exception{
        assertTrue(stack.isEmpty());

        stack.push("Item");
        assertFalse(stack.isEmpty());

        assertSame("Item", stack.top());
        assertSame("Item", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test(expected = StackEmptyException.class)
    public void pop_emptyStack_ExceptionThrown() throws Exception{
        stack.pop();
    }

    @Test(expected = StackEmptyException.class)
    public void top_emptyStack_ExceptionThrown() throws Exception{
        stack.top();
    }

    @Test(expected = StackEmptyException.class)
    public void pop_top_filledStack_ExceptionThrown() throws Exception{
        assertTrue(stack.isEmpty());
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        assertFalse(stack.isEmpty());
        assertSame("Four", stack.pop());
        assertSame("Three", stack.pop());
        assertSame("Two", stack.pop());
        assertSame("One", stack.pop());
        assertTrue(stack.isEmpty());

        stack.pop();
    }

    @Test()
    public void top_filledStack() throws Exception{
        assertTrue(stack.isEmpty());
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        assertFalse(stack.isEmpty());
        assertSame("Four", stack.top());
        assertSame("Four", stack.top());
        assertSame("Four", stack.top());
        assertSame("Four", stack.top());
    }

}
