import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //     Using For Loops Print 1-100 and 100-1

        //Print 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        //Print 100 to 1
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }


        //    Using Loops Sum from 1 To N

        System.out.println("Enter a natural number to find sum of 1 to N");
        int n = sc.nextInt();
        int sum = 0;
        //Print 1 to N
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of 1 to " + n + " is " + sum);


        //         Print Table of N

        System.out.println("Enter a number for print table");
        int table=sc.nextInt();
        //Print 1 to N
        System.out.println("The Table of " + table + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = " + (table * i));
        }


        //      Patterns  printing

        System.out.println("Upper Triangular");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)                      // *
            {                                                 // **
                System.out.print("*");                        // ***
            }                                                 // ****
            System.out.println(" ");                          // *****
        }


        System.out.println("Lower Triangular");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--)                        // *****
            {                                                   // ****
                System.out.print("*");                          // ***
            }                                                   // **
            System.out.println(" ");                            // *
        }

        System.out.println("Upper Triangle Alphabetical order");
        for (int i = 0; i < n; i++) {                                          //  A
            for (char j = 'A'; j < 'A' + i; j++) {                             //  AB
                System.out.print(j);                                          //   ABC
            }                                                                 //   ABCD
            System.out.println(" ");                                          //   ABCDE
        }

        System.out.println("Upper Pyramid");
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {                        //  *
                System.out.print(" ");                               //  ***
            }                                                        // *****
                                                                    // *******
            for (int k = 1; k <= 2 * i - 1; k++) {                  //*********
                System.out.print("*");
            }
            System.out.println();          // Move to next line
        }

        System.out.println("Lower Pyramid");
        for (int i = n; i >=1 ; i--) {            // i = 5,4,3,2,1 ( reversed the number )
            // Print spaces                         // j = 0,1,2,3,4 ( spaces in a row )
            for (int j = 0; j <= n - i; j++) {              //   *******
                System.out.print(" ");                      //    *****
            }                                               //     ***
            // Print stars                                  //      *
            for (int k = 2 * i - 1; k >= 1; k--) {   // k = 9,7,5,3,1 ( numbers of stars in a row )
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }

        // Diamond Shape Pyramid
        System.out.println("Diamond Shape pyramid");
        for (int i = 1; i <= 6; i++) {
            // Print spaces
            for (int j = 1; j <= 6 - i; j++) {                        //  *
                System.out.print(" ");                               //  ***
            }                                                        // *****
            // *******
            for (int k = 1; k <= 2 * i - 1; k++) {                  //*********
                System.out.print("*");
            }
            System.out.println();          // Move to next line
        }

        for (int i = 5; i >=1 ; i--) {            // i = 5,4,3,2,1 ( reversed the number )
            // Print spaces                         // j = 0,1,2,3,4 ( spaces in a row )
            for (int j = 0; j <= 5 - i; j++) {              //   *******
                System.out.print(" ");                      //    *****
            }                                               //     ***
            // Print stars                                  //      *
            for (int k = 2 * i - 1; k >= 1; k--) {   // k = 9,7,5,3,1 ( numbers of stars in a row )
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}



