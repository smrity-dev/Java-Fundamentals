import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("\t\t\t\t\t\t\t\tProgram to check Voting Criteria");


        //   Calculate age for voting list

        System.out.println("Enter your age");
        float age = sc.nextFloat();
        if (age >= 18) {
            System.out.println("Adult,Available for voting" + "age id:" + age);
        } else {
            System.out.println("Not available for voting");
        }


        System.out.println("\t\t\t\t\t\t\t\tProgram for check Number is Even , Odd ");

        //  Check number is even or odd

        System.out.println("Enter the number");
        float num = sc.nextFloat();
        if (num % 2 == 0) {
            System.out.println(num + "is even");
        } else {
            System.out.println(num + "is odd");
        }

        System.out.println("\n");

        System.out.println("\t\t\t\t\t\t\t\tProgram to Check Number is Positive or Negative ");


        //   Check Number is positive or negative

        System.out.println("Enter the number");
        float numb = sc.nextFloat();
        if (numb > 0) {
            System.out.println(numb + "is a positive number");
        } else if (numb < 0) {
            System.out.println(numb + "is a negative number");
        } else {
            System.out.println(numb);
        }

        // Number is Divided by 3,5 or not

        System.out.println("\t\t\t\t\t\t\t\tProgram for Checking Number is divided by 3 or 5 or not ");

        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        if (number % 15 == 0) {
            System.out.println("Number is Divided by 3 and 5 both");
        } else if (number % 3 == 0) {
            System.out.println("Number is Divided by 3");
        } else if (number % 5 == 0) {
            System.out.println("Number is Divided by 5");
        } else {
            System.out.println("Number is not Divided by 3 and 5");
        }


        System.out.println("\n");
        //  Calculate Marks Grading System

        System.out.println("\t\t\t\t\t\t\t\tProgram for calculate Grading according to Students marks");

        System.out.print("Enter Mark of Student: ");
        float mark = sc.nextFloat();
        if (mark < 0 && mark > 100) {
            System.out.print(" Not Valid Marks ");
        } else if (mark >= 90) {
            System.out.print("A-Grade");
        } else if (mark >= 80 && mark <= 89) {
            System.out.print("B-Grade");
        } else if (mark >= 70 && mark <= 79) {
            System.out.print("C-Grade");
        } else if (mark >= 60 && mark <= 69) {
            System.out.print("D-Grade");
        } else {
            System.out.print("Fail");
        }


        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\tProgram for Converting Celsius into Fahrenheit");

        //   Celsius to Fahrenheit

        System.out.println("Enter Celsius");
        float cel = sc.nextFloat();
        float far = ((9 * cel) / 5) + 32;                      // ( cel * 9/5 ) + 32
        System.out.println("Fahrenheit:" + far);


        System.out.println("\t\t\t\t\t\t\t\tProgram for finding Percentage of Marks");
        //   Program for finding percentage of Marks

        System.out.print("Enter Marks of Maths: ");
        float mark1 = sc.nextFloat();
        System.out.print("Enter Marks of Physics: ");
        float mark2 = sc.nextFloat();
        System.out.print("Enter Marks of Biology: ");
        float mark3 = sc.nextFloat();
        System.out.print("Enter Marks of Chemistry: ");
        float mark4 = sc.nextFloat();
        System.out.print("Enter Marks of Computer: ");
        float mark5 = sc.nextFloat();
        if (mark1 >= 0 && mark1 <= 100 &&
                mark2 >= 0 && mark2 <= 100 &&
                mark3 >= 0 && mark3 <= 100 &&
                mark4 >= 0 && mark4 <= 100 &&
                mark5 >= 0 && mark5 <= 100) {
            float total_marks = mark1 + mark2 + mark3 + mark4 + mark5;
            float percentage_marks = total_marks / 5;
            System.out.println("\n----- Result -----");
            System.out.println("Maths: " + mark1);
            System.out.println("Physics: " + mark2);
            System.out.println("Biology: " + mark3);
            System.out.println("Chemistry: " + mark4);
            System.out.println("Computer: " + mark5);
            System.out.println("Total Marks: " + total_marks + " / 500");
            System.out.println("Percentage: " + percentage_marks + "%");
        } else {
            System.out.println("Enter valid marks between 0 and 100.");
        }


        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\tProgram for checking Vowels or Consonants");


        //   Vowel or Consonants

        System.out.println("Enter a character from user");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonants");
        }


        System.out.println("\n");
        System.out.println("Program to match and check Username and Passwords \n");

        //       Checks username and Passwords

        System.out.print("Enter Username: ");
        String Username = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();
        if (Username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login Unsuccessful");
        }


        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\tProgram to find Greatest Among 3 Numbers");

        //   Greatest among three numbers

        System.out.println("Enter number 1");
        float num1 = sc.nextFloat();
        System.out.println("Enter number 2");
        float num2 = sc.nextFloat();
        System.out.println("Enter number 3");
        float num3 = sc.nextFloat();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is Greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is Greater");
        } else {
            System.out.println(num3 + "is Greater");
        }


        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\tProgram to Calculate BMI Calculations");
        //     BMI Calculations

        System.out.print("Enter your weight in kg: ");
        Double weight = sc.nextDouble();
        System.out.print("Enter your height in m: ");
        Double height = sc.nextDouble();
        Double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI:" + bmi);
        if (bmi < 30) {
            System.out.println("OverWeighted");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 18.5) {
            System.out.println("UnderWeight");
        } else {
            System.out.println("Obesity");
        }

        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\tProgram to make a Calculator");

        //  Program for simple calculator using switch

        System.out.println("Enter number 1");
        float numb1 = sc.nextFloat();
        System.out.println("Enter number 2");
        float numb2 = sc.nextFloat();
        System.out.println("Enter 1 for add, enter 2 for subtract, enter 3 for multiply, Enter 4 for division");
        int n = sc.nextInt();
        System.out.print("Enter your choice:");
        switch (n) {
            case 1:
                System.out.println("Sum:" + (numb1 + numb2));
                break;
            case 2:
                System.out.println("Substraction:" + (numb1 - numb2));
                break;
            case 3:
                System.out.println("Multiplication:" + (numb1 * numb2));
                break;
            case 4:
                System.out.println("Division:" + (numb1 / numb2));
                break;
            default:
                System.out.print("Enter Valid Choice");
        }

        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\tProgram to check Leap Year or, Not");
        //  Check Year is Leap or not

        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {                             //century year is not leap until divided by 4
            System.out.println(year + " is A Leap Year");
        } else {
            System.out.println(year + " is Not A Leap Year");
        }
    }
}
