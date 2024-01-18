package Moduuli3;
import java.util.Scanner;
import java.util.Random;
public class Moduuli3osa4 {
    public static void main(String[] args){
        int totalscore = 0;
        Random rnd = new Random();
        Scanner reader = new Scanner(System.in);
        for (int i = 1; i < 10; i++){
            int rnd1 = rnd.nextInt(11);
            int rnd2 = rnd.nextInt(11);

            int answer = rnd1 * rnd2;
            System.out.println(rnd1 + " * " + rnd2 + "?");
            System.out.println("Answer: ");
            int input = Integer.parseInt(reader.nextLine());

            if(input == answer){
                totalscore++;
            }

        }

        if(totalscore == 10)
        {
            System.out.println("Congratulations, you won with 10 points!");
        }
        else{
            System.out.println("Great! you finished with score " + totalscore);
        }
    }
}
