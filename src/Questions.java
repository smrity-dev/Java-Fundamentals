// Check Strong Number

import java.util.Scanner;
public class Questions {
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int original=number, sum=0;
        while(number>0){
            int  digit = number % 10;
            sum=sum+factorial(digit);
            number = number/10;
        }
        if(original==sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }




        // Swapping two numbers


        System.out.println("Enter number 1");
        float num1 = sc.nextFloat();
        System.out.println("Enter number 2");
        float num2 = sc.nextFloat();
        //Swap without using third variable
        num1=num1+num2;;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("number1 is :" +(num1) + "number2 is :" +num2);
        //Swap using third variable
        float temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("number1 is :" +(num1) + "number2 is :" +num2);



        //    Factorial of a number

        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact=1;
        System.out.println("The Factorial of " + n + " is: ");
        for(int i=1;i<=n;i++) {
            fact*=i;
        }
        System.out.println(fact);



        //      Fibonacci Series

        System.out.println("Enter a number");
        int numbe = sc.nextInt();
        int a=0,b=1,fibb;
        System.out.println("The Fibonacci Series of " + numbe + " is: ");
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<numbe;i++) {
            fibb=a+b;
            a=b;
            b=fibb;
            System.out.println(fibb);
        }


        //     Find the Sum of Given Digits

        System.out.println("Enter a number");
        int numb = sc.nextInt();
        int sum1=0,digit;
        System.out.println("The Sum of " + numb + "'s digits is: ");
        for(int i=1;i<=numb;i++) {
            digit = numb % 10;
            numb = n/10;
            sum1=sum1+digit;
        }
        System.out.println(sum1);



        //   Armstrong Checking Program

        System.out.println("Enter a number to check Armstrong");
        int num0 = sc.nextInt();
        int digit0;
        int sum0=0;
        int original0 = n;                                    //   153 = (1^3)+(5^3)+(3^3) = 153
        while(num0>0) {
            digit0 = num0 % 10;
            sum0 += Math.pow(digit0,3);
            num0 = num0/10;
        }
        if(original0 == sum0){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }



        //       Palindrome Checking Program

        System.out.println("Enter a number to check Palindrome");
        int nm = sc.nextInt();
        int original1 = nm;
        int digit1, rev=0;;                                               // 121 = 121 ( after reversing digits )

        while(nm>0) {
            digit1 = nm % 10;
            rev=rev*10+digit1;
            nm = nm/10;
        }
        if(original1 == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}

