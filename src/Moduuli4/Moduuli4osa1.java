package Moduuli4;
import java.util.Scanner;
import java.util.Random;
public class Moduuli4osa1 {
    public static void main(String[] args) {
        String[] rndlastnameArr = {"Heikkinen", "Salo", "Hämäläinen", "Puu", "Uygur"};
        String[] rndfirstnameArr = {"Atte", "Pekka", "Jere", "Juuso", "Umut"};
        Scanner reader = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("How many fake names shluld we generate? ");
        int nameAmount = Integer.parseInt(reader.nextLine());

        for(int i = 1; i < nameAmount; i++){
            String rndlastName = rndlastnameArr[rnd.nextInt(5)];
            String rndfirstName = rndfirstnameArr[rnd.nextInt(5)];
            System.out.println(rndfirstName + " " + rndlastName);
        }
    }
}
