package Moduuli5;
import java.util.Scanner;
public class CoffeeMaker {
    Scanner reader = new Scanner(System.in);

    private String coffeeType;

    private boolean isOnOff = true;
    public void Selector(){
        if(isOnOff) {
            System.out.print("Select coffee:\n1:Normal\n2:Espresso\n");
            int selectedDrink = reader.nextInt();
            if(selectedDrink == 1){
                coffeeType = "Normal";
            } else if (selectedDrink == 2) {
                coffeeType = "Espresso";
            }
            else{
                System.out.println("Please select between numbers 1-2:");
                selectedDrink = reader.nextInt();
            }

            System.out.print("Select amount(10-80ml): ");
            int selectedAmount = reader.nextInt();
            if (selectedAmount >= 10 && selectedAmount <= 80) {
                selectedAmount = selectedAmount;
            } else {
                System.out.print("Please select between(10-80ml):");
                selectedAmount = reader.nextInt();
            }

            System.out.println("Your drink is " + selectedAmount + " " +  coffeeType + " coffee " );
        }
        else{
            System.out.println("Cannot select when machine is off, please turn the machine on.");
        }
    }
    public boolean GetOnOff(){
        return isOnOff;
    }
    public void setonOff(){
        if(!isOnOff){
            isOnOff = true;
            System.out.println("Coffee machine is now on");
        }
        else{
            isOnOff = false;
            System.out.println("Coffee machine is now off");
        }

    }

    public static void main(String[] args){
        CoffeeMaker coffeemachine = new CoffeeMaker();

        coffeemachine.Selector();
        coffeemachine.setonOff();
        coffeemachine.Selector();
        coffeemachine.setonOff();
        coffeemachine.Selector();

    }
}
