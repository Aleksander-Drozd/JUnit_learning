package ShoppingCartExercise;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;
    private static Item bread, egg, milk, cheese;

    @BeforeClass
    public static void setUp(){
        bread = new Item("Bread", 2.99f);
        egg = new Item("Egg", 2.99f);
        milk = new Item("Milk", 2.99f);
        cheese = new Item("Cheese", 5.45f);
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

    private void addAndThenDeleteItemWithItemCountCheck(Item item, int quantity, int currentItemCount) throws Exception {
        shoppingCart.addItems(item, quantity);
        currentItemCount += quantity;
        assertEquals(currentItemCount, shoppingCart.itemCount());

        shoppingCart.deleteItems(item, quantity);
        currentItemCount -= quantity;
        assertEquals(currentItemCount, shoppingCart.itemCount());
    }

    @Test(expected = NoSuchItemException.class)
    public void deleteItems_nonexistentItem_ExceptionThrown() throws Exception{
        assertEquals(0, shoppingCart.itemCount());

        shoppingCart.addItems(bread, 3);
        shoppingCart.addItems(milk, 3);
        assertEquals(6, shoppingCart.itemCount());

        shoppingCart.deleteItems(egg, 2);
    }

    @Test
    public void addItemsThenDeleteThem() throws Exception{
        assertEquals(0, shoppingCart.itemCount());

        shoppingCart.addItems(cheese, 1);
        shoppingCart.addItems(bread, 10);
        shoppingCart.addItems(egg, 4);
        shoppingCart.addItems(milk, 3);

        assertEquals(18, shoppingCart.itemCount());

        shoppingCart.deleteItems(bread, 10);
        shoppingCart.deleteItems(egg, 4);
        shoppingCart.deleteItems(milk, 3);
        shoppingCart.deleteItems(cheese, 1);

        assertEquals(0, shoppingCart.itemCount());
    }

    @Test(expected = NegativeCountException.class)
    public void addItems_0Quantity_ExceptionThrown() throws Exception{
        assertEquals(0, shoppingCart.itemCount());
        shoppingCart.addItems(bread, 0);
    }

    @Test(expected = NegativeCountException.class)
    public void addItems_NegativeQuantity_ExceptionThrown() throws Exception{
        assertEquals(0, shoppingCart.itemCount());
        shoppingCart.addItems(bread, -5);
    }

}