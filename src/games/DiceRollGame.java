package games;

import java.util.Scanner;
import java.util.Random;
public class DiceRollGame {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter your choice\nEnter 1 for Roll the Dice");
        int choice = sc.nextInt();

        if(choice==1) {
            int dice1 = rand.nextInt(6) + 1;
            System.out.println("Dice 1 is : " + dice1);
            int dice2 = rand.nextInt(6) + 1;
            System.out.println("Dice 2 is : " + dice2);
            int total = dice1 + dice2;
            if (total == 12) {
                System.out.println("Highest number gain " + total);
            } else if (total >= 10) {
                System.out.println("Lucky Roll " + total);
            } else if (total >= 7) {
                System.out.println("Good Roll " + total);
            } else {
                System.out.println("Lowest occurrence gain " + total);
            }
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}

