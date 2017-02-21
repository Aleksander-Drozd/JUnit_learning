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

    public void deleteItems(Item item, int quantityToRemove) throws NegativeCountException, NoSuchItemException {
        checkForInvalidItemQuantityToRemove(item, quantityToRemove);
        
        int itemInCartQuantity;

        try {
            itemInCartQuantity = itemList.get(item);
        } catch (NullPointerException e) {
            throw new NoSuchItemException("W koszyku nie ma takiego przedmiotu", e);
        }

        if (itemInCartQuantity == quantityToRemove){
            itemList.remove(item);
            return;
        }

        itemList.put(item, itemList.get(item) - quantityToRemove);
    }

    private void checkForInvalidItemQuantityToRemove(Item itemToRemove, int quantityToRemove) throws NegativeCountException, NoSuchItemException {
        if (itemList.get(itemToRemove) < quantityToRemove)
            throw new NoSuchItemException("W koszyku nie ma tylu egzemplarzy tego przedmiotu");

        if (quantityToRemove < 0)
            throw new NegativeCountException("Ujemna ilosc przedmiotow");
    }

    public int itemCount(){
        int itemCount = 0;

        for (Map.Entry<Item, Integer> entry : itemList.entrySet()) {
            itemCount += entry.getValue();
        }

        return itemCount;
    }

    public Iterator iterator(){
        return null;
    }
}
