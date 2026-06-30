import java.util.Scanner;

public class Recursion {

    static int arraysum(int[] arr, int n){
        if(n==0) {
            return 0;
        }
        return arr[n-1] + arraysum(arr,n-1);
    }

    static boolean sortedArray(int arr[], int n){
        if(n==1) {
            return true;
        }
        if(arr[n-2]>arr[n-1]) {
            return false;
        }
        return sortedArray(arr,n-1);
    }
                               // n = 5, 4, 3, 2, 1   at n=0 terminate
    static void printNumbersNto1(int n){                       // Return_type, function_Name, Parameters
        if(n==0)                                           // Base Condition
        {
            return;
        }
        System.out.println(n);
        printNumbersNto1(n-1);                        // Name of Functions printNumbers with conditions
    }

                          //  n = 1, 2, 3, 4, 5   at n=0 terminate
    static void printNumbers1toN(int n){
        if(n==0)
        {
            return;
        }
        printNumbers1toN(n-1);                        // Name of Functions printNumbers with conditions
        System.out.println(n);
    }

    static int sumofN(int n){
        if(n==0)
        {
            return 0;
        }
        return n + sumofN(n-1);                      //Sum again calls sum to add again and again until 0
    }

    static double factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);                      //Factorial calls factorial to multiply again and again
    }

    static int powerOfN(int a, int b){
        if(b==0){
            return 1;
        }
        return a * powerOfN(a,b-1);                      //Factorial calls factorial to multiply again and again
    }

    static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }

    static int countSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + countSum(n/10);
    }

    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    static void reverse(int n){
        if (n==0){
            return;
        }
        System.out.println(n%10);
        reverse(n/10);
    }
    static int reverse=0;
    static void palindrome(int n){
        if (n==0){
            return;
        }
        reverse = (reverse*10) + n%10;
        palindrome(n/10);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Start enter the elements of an array upto " + size + " size");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The array sum " +  arraysum(array,size));

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("\n");
        System.out.print("Enter a number for Power of : " + number);
        int power = sc.nextInt();
        System.out.println("\n");
        System.out.println("Decreasing order of " + number + " is:");
        printNumbersNto1(number);

        System.out.println("Increasing order of " + number + " is: ");
        printNumbers1toN(number);

        System.out.println("The sum of " + number + " to 1 is: "+ sumofN(number));
        System.out.println("The Factorial of " + number + " is: " +  factorial(number));
        System.out.println("The Power of " + number + " to " + power +  " is: " +  powerOfN(number,power));
        System.out.println("Total Digit in " + number + " is " +  countDigits(number));
        System.out.println("The sum of digit in " + number + " is " +  countSum(number));
        System.out.println("The Fibonacci of " + number + " is: " +  fibonacci(number));
        System.out.println("The Reverse of " + number + " is: ");
        reverse(number);
        int original = number;
        palindrome(number);
        if(original == reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}