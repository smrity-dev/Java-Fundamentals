package games;

import java.util.Scanner;
import java.util.Random;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {
                "JAVA",
                "ARRAY",
                "STRING",
                "LOOP",
                "SCANNER"
        };
        String[] hints = {
                "Programming Language",
                "Data Structure",
                "Text Data Type",
                "Repetition Statement",
                "Input Class"
        };
        Random rand = new Random();
        int randomIndex = rand.nextInt(words.length);
        String word = words[randomIndex];
        System.out.println("Hint : " + hints[randomIndex]);
        // Logic-1
        /*
        if(word.equals("JAVA"))
        {
            System.out.println("Hint : Programming Language");
        }
        else if(word.equals("ARRAY"))
        {
            System.out.println("Hint : Data Structure");
        }
        else
        {
            System.out.println("Hint : Programming Concept");
        }
         */

        //Logic-2
        /*
        if(randomIndex == 0)
        {
            System.out.println("Hint : Programming Language");
        }
        else if(randomIndex == 1)
        {
            System.out.println("Hint : Data Structure");
        }
        else
        {
            System.out.println("Hint : Programming Concept");
        }
         */

        char[] display = new char[word.length()];
        for(int i = 0; i < display.length; i++) {
            display[i] = '_';
        }
        int lives = 10;
        while(lives > 0) {
            // Display Current Word
            System.out.print("\nWord : ");
            for(int i = 0; i < display.length; i++) {
                System.out.print(display[i] + " ");
            }
            //Display lives count
            System.out.println("\nLives Left : " + lives);
            //Guess the Characters
            System.out.print("Enter a Character : ");
            //Convert character input into UpperCase
            char choice = Character.toUpperCase(sc.next().charAt(0));

            boolean found = false;
            // Character Matching
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == choice) {
                    display[i] = choice;
                    found = true;
                }
            }
            // Wrong Guess
            if(!found) {
                lives--;
                System.out.println("Wrong Guess!");
            }
            // Win Check or, Printing Details
            boolean win = true;
            for(int i = 0; i < display.length; i++) {
                if(display[i] == '_') {
                    win = false;
                    break;
                }
            }
            if(win) {
                System.out.print("\nWord : ");
                for(int i = 0; i < display.length; i++) {
                    System.out.print(display[i] + " ");
                }
                System.out.println("\nCongrats ! You Win 🎉");
                break;
            }
        }
        // Lose Condition
        if(lives == 0) {
            System.out.println("\nGame Over!");
            System.out.println("Correct Word was : " + word);
        }
        sc.close();
    }
}