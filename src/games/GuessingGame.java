package games;

import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {

        //User Inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 100 to guess the correct number");

        //Computer Inputs
        Random rand = new Random();
        int computerInput = rand.nextInt(100);

        //Random Computer Inputs
        int guess = 0,trial=0,maxAttempts=15;
        while (guess != 1 && trial <= maxAttempts) {
            System.out.println("Enter the Guessing Number");
            int userInput = sc.nextInt();
            System.out.println("User choice : " + userInput);
            trial++;
            //Guess System starts from here
            if (userInput == computerInput) {
                System.out.println("Computer choice : " + computerInput);
                System.out.println("Congrats ! You guess the correct number");
                guess ++;
                break;
            } else if (userInput > computerInput) {
                System.out.println("Too High... Guess Again");

            } else {
                System.out.println("Too low... Guess Again");
            }
        }
        System.out.println("Total trial to guess the correct number is : " + trial);
        if(trial == maxAttempts || guess==0){
            System.out.println("Game Over");
            System.out.println("Correct Number was : " + computerInput);
        }
    }
}

