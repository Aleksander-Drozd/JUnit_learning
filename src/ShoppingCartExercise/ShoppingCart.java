package ShoppingCartExercise;

import java.util.*;

public class ShoppingCart {

    private Map<Item, Integer> itemList;

    public ShoppingCart() {
        itemList = new HashMap<>();
    }

    public void addItems(Item item, int quantity) throws NegativeCountException{
        itemList.put(item, quantity);
    }

    public void deleteItems(Item item, int quantity) throws NegativeCountException, NoSuchItemException{

    }

    public int itemCount(){
        Item item;
        int quantity, itemCount = 0;

        for (Map.Entry<Item, Integer> entry : itemList.entrySet()) {
            itemCount += entry.getValue();
        }

        return itemCount;
    }

    public Iterator iterator(){
        return null;
    }
}
