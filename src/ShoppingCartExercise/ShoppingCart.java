package ShoppingCartExercise;

import java.util.*;

public class ShoppingCart {

    private Map<Item, Integer> itemList;

    public ShoppingCart() {
        itemList = new HashMap<>();
    }

    public void addItems(Item anItem, int quantity) throws NegativeCountException{

    }

    public void deleteItems(Item anItem, int quantity) throws NegativeCountException, NoSuchItemException{

    }

    public int itemCount(){
        return -1;
    }

    public Iterator iterator(){
        return null;
    }
}
