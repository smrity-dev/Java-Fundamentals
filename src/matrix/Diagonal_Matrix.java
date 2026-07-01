package matrix;

import java.util.Scanner;

public class Diagonal_Matrix {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // Matrix Inputs
        System.out.println("Enter the number of rows");
        int rows0 = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns0 = sc.nextInt();
        int[][] matrix0 = new int[rows0][columns0];
        System.out.println("Enter elements of order " + rows0 + "*" + columns0 + " matrix");
        for (int i = 0; i < rows0; i++) {
            for (int j = 0; j < columns0; j++) {
                matrix0[i][j] = sc.nextInt();
            }
        }
        // Matrix Printing
        System.out.println("Matrix is: ");
        for (int i = 0; i < rows0; i++) {
            for (int j = 0; j < columns0; j++) {
                System.out.print(matrix0[i][j] + " ");
            }
            System.out.println();
        }

        // Main Diagonal elements and its sum

        int sum = 0;
        System.out.println("Diagonal Elements are:");
        for (int i = 0; i < rows0; i++) {
            for (int j = 0; j < columns0; j++) {
                if (i == j) {
                    System.out.print(matrix0[i][j]);
                    sum = sum + matrix0[i][j];
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("The sum of Diagonal Elements is: " + sum);


    }
}
