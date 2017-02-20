import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private static StackExercise stack;
    
    @BeforeClass
    public static void setUp(){
        stack = new Stack();
    }

    @Test
    public void test1() throws Exception{
        assertTrue(stack.isEmpty());

        stack.push("Item");
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
