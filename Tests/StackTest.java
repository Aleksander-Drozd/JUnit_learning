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

        assertEquals("Item", stack.top());
        assertEquals("Item", stack.pop());
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

    @Test()
    public void pop_top_filledStack() throws Exception{
        assertTrue(stack.isEmpty());
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        assertFalse(stack.isEmpty());
        assertEquals("Four", stack.top());
        assertEquals("Four", stack.pop());

        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test()
    public void top_filledStack() throws Exception{
        assertTrue(stack.isEmpty());
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        assertFalse(stack.isEmpty());
        assertEquals("Four", stack.top());
        assertEquals("Four", stack.top());
        assertEquals("Four", stack.top());
        assertEquals("Four", stack.top());
    }

}
