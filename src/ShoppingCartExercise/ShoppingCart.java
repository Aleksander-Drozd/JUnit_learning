package ShoppingCartExercise;

import java.util.*;

public class ShoppingCart {

    private Map<Item, Integer> itemList;

    public ShoppingCart() {
        itemList = new HashMap<>();
    }

    public void addItems(Item item, int quantity) throws NegativeCountException{
        checkIfItemQuantityEqualsZero(quantity);
        checkIfNegativeItemCount(quantity);

        itemList.put(item, quantity);
    }

    private void checkIfItemQuantityEqualsZero(int quantity) throws NegativeCountException{
        if (quantity == 0)
            throw new NegativeCountException("Liczba przedmiotow nie moze byc rowna 0");
    }

    public void checkIfNegativeItemCount(int quantity) throws NegativeCountException{
        if (quantity < 0)
            throw new NegativeCountException("Liczba przedmiotow nie moze byc ujemna");
    }

    public void deleteItems(Item item, int quantityToRemove) throws NegativeCountException, NoSuchItemException {
        checkIfItemIsInCart(item);
        checkForInvalidItemQuantityToRemove(item, quantityToRemove);

        int itemInCartQuantity;

        itemInCartQuantity = itemList.get(item);

        if (itemInCartQuantity == quantityToRemove){
            itemList.remove(item);
            return;
        }

        itemList.put(item, itemList.get(item) - quantityToRemove);
    }

    private void checkIfItemIsInCart(Item itemToDelete) throws NoSuchItemException {
        if (itemList.get(itemToDelete) == null)
            throw new NoSuchItemException("W koszyku nie ma takiego przedmiotu");
    }

    private void checkForInvalidItemQuantityToRemove(Item itemToRemove, int quantityToRemove) throws NegativeCountException, NoSuchItemException {
        if (itemList.get(itemToRemove) < quantityToRemove)
            throw new NoSuchItemException("W koszyku nie ma tylu egzemplarzy tego przedmiotu");
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
