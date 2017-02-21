package ShoppingCartExercise;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;
    private static Item bread, egg, milk;

    @BeforeClass
    public static void setUp(){
        bread = new Item("Bread", 2.99f);
        egg = new Item("Egg", 2.99f);
        milk = new Item("Milk", 2.99f);
    }

    @Before
    public void init(){
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void addingItemsToEmptyCart() throws Exception{
        assertEquals(0, shoppingCart.itemCount());

        shoppingCart.addItems(bread, 2);
        shoppingCart.addItems(egg, 6);
        shoppingCart.addItems(milk, 1);

        assertEquals(9, shoppingCart.itemCount());
    }

    @Test(expected = NoSuchItemException.class)
    public void deleteItems_emptyCart_ExceptionThrown() throws Exception{
        assertEquals(0, shoppingCart.itemCount());
        shoppingCart.deleteItems(bread, 7);
    }

    @Test
    public void deletedItems_emptyCart_ExceptionThrown() throws Exception{
        addAndThenDeleteItemWithItemCountCheck(bread, 2, 0 );
        addAndThenDeleteItemWithItemCountCheck(egg, 2, 0 );
        addAndThenDeleteItemWithItemCountCheck(milk, 2, 0 );
    }

    private void addAndThenDeleteItemWithItemCountCheck(Item item, int quantity, int currentItemCount) throws Exception{
        assertEquals(0, shoppingCart.itemCount());
        shoppingCart.addItems(item, quantity);
        currentItemCount += quantity;
        assertEquals(currentItemCount, shoppingCart.itemCount());

        shoppingCart.deleteItems(item, quantity);
        currentItemCount -= quantity;
        assertEquals(currentItemCount, shoppingCart.itemCount());
    }
}