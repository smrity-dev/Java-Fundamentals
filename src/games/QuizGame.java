package games;

// Quiz-Game using If-else conditions
import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to Quiz Game");
        //Question 1
        System.out.println("Question - 1");
        System.out.println("What is the Capital of India");
        System.out.println("1.) Mumbai\n2.) Chennai \n3.) New Delhi \n4.) Punjab");
        System.out.println("Choose the correct option");
        int choice1 = sc.nextInt();
        if (choice1 < 1 || choice1 > 4) {
            System.out.println("Invalid Option");
        } else {
            if (choice1 == 3) {
                System.out.println("Correct Choice you get +1 point");
                score++;
            } else {
                System.out.println("Incorrect Answer you get +0 point");
                System.out.println("Correct Answer : New Delhi");
            }
        }
        //Question 2
        System.out.println("Question - 2");
        System.out.println("What is the state of Jharkhand");
        System.out.println("1.) Patna \n2.) Ranchi \n3.) Bhojpur \n4.) Araria");
        System.out.println("Choose the correct option");
        int choice2 = sc.nextInt();
        if (choice2 < 1 || choice2 > 4) {
            System.out.println("Invalid Option");
        } else {
            if (choice2 == 2) {
                System.out.println("Correct Choice you get +1 point");
                score++;
            } else {
                System.out.println("Incorrect Choice you get +0 point");
                System.out.println("Correct Answer : Ranchi");
            }
        }
        //Question 3
        System.out.println("Question - 3");
        System.out.println("What is the National Bird of India");
        System.out.println("1.) Peacock \n2.) Penguin \n3.) Sparrow \n4.) Piegon");
        System.out.println("Choose the correct option");
        int choice3 = sc.nextInt();
        if (choice3 < 1 || choice3 > 4) {
            System.out.println("Invalid Option");
        }
        else{
            if (choice3 == 1) {
                System.out.println("Correct Choice you get +1 point");
                score++;
            } else {
                System.out.println("Incorrect Choice you get +0 point");
                System.out.println("Correct Answer : Peacock");
            }
        }
        //Question 4
        System.out.println("Question - 4");
        System.out.println("What is the National Flower of India ? ");
        System.out.println("1.) Jasmine \n2.) Lotus \n3.) Rose \n4.) Lily");
        System.out.println("Choose the correct option");
        int choice4 = sc.nextInt();
        if(choice4 < 1 || choice4 > 4){
            System.out.println("Invalid Option");
        }
        else {
            if (choice4 == 2) {
                System.out.println("Correct Choice you get +1 point");
                score++;
            } else {
                System.out.println("Incorrect Choice you get +0 point");
                System.out.println("Correct Answer : Lotus");
            }
        }
        System.out.println("Your Score is:" + score + " out of 4");
        System.out.println("Quiz Completed");
        if(score == 4){
            System.out.println("Excellent");
        }
        else if(score == 3){
            System.out.println("Good");
        }
        else if(score == 2){
            System.out.println("Need Improvement");
        }
        else{
            System.out.println("Try Again");
        }
        double percentage = (score*100.0)/4;
        System.out.println("Your percentage = " + percentage + "%");
    }
}



// Quiz-Game Using Arrays and Strings
/*
import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to Quiz Game");
        String[] questions = {"What is the Capital of India ?", "Who is the Prime Minister of India ?","Who is the National Bird of India ?"};
        String[][] options = {
                {
                        "1. Mumbai",
                        "2. Chennai",
                        "3. New Delhi",
                        "4. Punjab"
                },
                {
                        "1. RamNath Govind",
                        "2. Narendra modi",
                        "3. Dropadi Murmur",
                        "4. Rajiv Gandhi"
                },
                {
                        "1. Peacock",
                        "2. Penguin",
                        "3. Sparrow",
                        "4. Pigeon"
                },
        };
        int[] answers = {3,2,1};
        //Questions Printing
        for(int i=0;i<questions.length;i++) {
            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i]);
            //Options Printing
            for(int j = 0; j < 4; j++)
            {
                System.out.println(options[i][j]);
            }
            //Your Choice
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            if(choice == answers[i])
            {
                System.out.println("Correct");
                score++;
            }
            else
            {
                System.out.println("Wrong");
            }
        }
        System.out.println("Final Score : " + score + "/3");
    }
}


 */
