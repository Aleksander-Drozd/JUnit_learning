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
    public void testPushPopElementOnEmptyStack() throws Exception{
        assertTrue(stack.isEmpty());

        stack.push("Item");
        assertFalse(stack.isEmpty());

        assertEquals("Item", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test(expected = StackEmptyException.class)
    public void pop_emptyStack_ExceptionThrown() throws Exception{
        stack.pop();
    }
}
