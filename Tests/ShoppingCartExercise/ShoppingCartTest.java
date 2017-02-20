package ShoppingCartExercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    ShoppingCart shoppingCart;

    @Before
    public void setUp(){
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void addingItemsToEmptyCart() throws Exception{
        assertEquals(0, shoppingCart.itemCount());

        shoppingCart.addItems(new Item("Bread", 2.99f), 2);
        shoppingCart.addItems(new Item("Egg", 0.99f), 6);
        shoppingCart.addItems(new Item("Milk", 1.99f), 1);

        assertEquals(9, shoppingCart.itemCount());
    }

    @Test(expected = NoSuchItemException.class)
    public void deleteItems_emptyCart_ExceptionThrown() throws Exception{
        shoppingCart.deleteItems(new Item("Bread", 2.30f), 2);
    }
}