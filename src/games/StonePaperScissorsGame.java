package games;


import java.util.Scanner;
import java.util.Random;
public class StonePaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computerInput = rand.nextInt(3);

        System.out.println("Enter:");
        System.out.println("0 -> Stone");
        System.out.println("1 -> Paper");
        System.out.println("2 -> Scissors");

        int userInput = sc.nextInt();
        if(userInput < 0 || userInput > 2){
            System.out.println("Invalid Choice!");
            return;
        }

        String[] choices = {"Stone", "Paper", "Scissors"};
        System.out.println("You Chose: " + choices[userInput]);
        System.out.println("Computer Chose: " + choices[computerInput]);

        if(userInput == computerInput){
            System.out.println("Match Draw!");
        }
        else if((userInput == 0 && computerInput == 2) ||
                (userInput == 1 && computerInput == 0) ||
                (userInput == 2 && computerInput == 1)){
            System.out.println("You Win!");
        }
        else{
            System.out.println("Computer Wins!");
        }
    }
}