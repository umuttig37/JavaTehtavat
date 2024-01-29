package Moduuli6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    HashMap<String, Double> products = new HashMap<>();
    HashMap<String, String> categories = new HashMap<>();
    HashMap<String, Integer> quantities = new HashMap<>();

    public void addItem(String item){
        if(!groceryList.contains(item)) {
            groceryList.add(item);
            System.out.println(item + " is added to cart.");
        }
        else
            System.out.println("This item is already in the list, please add another item.");

    }
    public void addItem(String item, double price){
        if(!products.containsKey(item)) {
            products.put(item, price);
            System.out.println(item + " with price " + price + " is added to cart.");
        }
        else
            System.out.println("This item is already in the list, please add another item.");
    }
    public void addItemWithCategory(String item, String category){
        if(!categories.containsKey(item)) {
           categories.put(item, category);
           groceryList.add(item);
           System.out.println(item + " with category " + category + " is added to cart.");
        }
        else
            System.out.println("This item is already in the list, please add another item.");
    }
    public void addItemWithQuantity(String item, int quantity){
        if(!quantities.keySet().contains(item)) {
            quantities.put(item, quantity);
            System.out.println(item + " with quantity " + quantity + " is added to cart.");
        }
        else
            System.out.println("This item is already in the list, please add another item.");
    }
    public void updateQuantity(String item, int newQuantity){
        if(quantities.containsKey(item)){
            quantities.put(item, newQuantity);
            System.out.println("product " + "'"+item+"'"+" quantity is updated to " + newQuantity);
        }
    }
    public void displayAvailableItems(){
        System.out.println("Available products:");
        for(String product : quantities.keySet()){
            int quantity = quantities.get(product);
            if(quantity > 0)
                System.out.println(product + " quantity: " + quantity);
        }
    }

    public void displayByCategory(String category) {
        System.out.println("Grocery Items in Category: " + category);
        for (String item : groceryList) {
            String itemCategory = categories.get(item);
            if (itemCategory != null && itemCategory.equalsIgnoreCase(category)) {
                System.out.println(item);
            }
        }
    }


    public void removeItem(String item){
        if(groceryList.contains(item)){
            groceryList.remove(item);
            System.out.println("Removing item " + "'"+item+"'");
        }
        else{
            System.out.println("Grocery List does not have this item. Please write correctly.");
        }
    }
    public void displayList(){
        System.out.println("Grocery list:");
        for(String product : groceryList){
            System.out.println(product);
        }
    }
    public boolean checkItem(String item){
        boolean istrue = groceryList.contains(item);
        System.out.println("Is " + "'"+item+"'"+ " in the grocery list: " + istrue);
        return istrue;
    }
    public void calculateTotalCost(){
        double sum = 0;
        for(double price : products.values())
        {
            sum += price;
        }
        System.out.println("Total sum is: " + sum);
    }

    public static void main(String[] args){
        GroceryListManager shopmanager = new GroceryListManager();
        shopmanager.addItem("Banana");
        shopmanager.addItem("cherry");
        shopmanager.addItem("pear");
        shopmanager.displayList();
        shopmanager.checkItem("cherry");
        shopmanager.removeItem("Banana");
        shopmanager.displayList();

        shopmanager.addItem("apple", 1.79);
        shopmanager.addItem("bread", 3.75);
        shopmanager.calculateTotalCost();

        shopmanager.addItemWithCategory("strawberry", "fruit");
        shopmanager.addItemWithCategory("fish", "meat");

        shopmanager.displayByCategory("fruit");

        shopmanager.addItemWithQuantity("Milk", 2);
        shopmanager.addItemWithQuantity("Bananas", 0);

        shopmanager.displayAvailableItems();

        shopmanager.updateQuantity("Milk", 4);

        shopmanager.displayAvailableItems();
    }
}




