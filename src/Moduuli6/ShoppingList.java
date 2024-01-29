package Moduuli6;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingList {
    private ArrayList<HashMap<String, Integer>> shoppingLists;

    public ShoppingList() {
        this.shoppingLists = new ArrayList<>();
    }

    public void createShoppingList(String purpose) {
        HashMap<String, Integer> shoppingList = new HashMap<>();
        shoppingLists.add(shoppingList);
        System.out.println("Shopping List created for " + purpose);
    }

    public void addItemToShoppingList(String purpose, String item, int quantity) {
        for (HashMap<String, Integer> shoppingList : shoppingLists) {
            if (shoppingList.containsKey(purpose)) {
                shoppingList.put(item, quantity);
                System.out.println("Item added to the Shopping List for " + purpose + ": " + item + " (" + quantity + ")");
                return;
            }
        }
        System.out.println("Shopping List for " + purpose + " does not exist.");
    }

    public void removeItemFromShoppingList(String purpose, String item) {
        for (HashMap<String, Integer> shoppingList : shoppingLists) {
            if (shoppingList.containsKey(purpose)) {
                if (shoppingList.containsKey(item)) {
                    shoppingList.remove(item);
                    System.out.println("Item removed from the Shopping List for " + purpose + ": " + item);
                } else {
                    System.out.println("Item " + item + " does not exist in the Shopping List for " + purpose);
                }
                return;
            }
        }
        System.out.println("Shopping List for " + purpose + " does not exist.");
    }

    public void displayShoppingList(String purpose) {
        for (HashMap<String, Integer> shoppingList : shoppingLists) {
            if (shoppingList.containsKey(purpose)) {
                System.out.println("Shopping List for " + purpose + ":");
                for (String item : shoppingList.keySet()) {
                    System.out.println(item + ": " + shoppingList.get(item));
                }
                return;
            }
        }
        System.out.println("Shopping List for " + purpose + " does not exist.");
    }

    public static void main(String[] args) {
        ShoppingList manager = new ShoppingList();

        manager.createShoppingList("Backyard BBQ");
        manager.createShoppingList("Weekend Camping");

        manager.addItemToShoppingList("Backyard BBQ", "Burger", 5);
        manager.addItemToShoppingList("Backyard BBQ", "Hotdog", 8);
        manager.addItemToShoppingList("Weekend Camping", "Tent", 1);
        manager.addItemToShoppingList("Weekend Camping", "Marshmallows", 2);

        manager.displayShoppingList("Backyard BBQ");
        manager.displayShoppingList("Weekend Camping");

        manager.removeItemFromShoppingList("Weekend Camping", "Marshmallows");
        manager.displayShoppingList("Weekend Camping");
    }
}
