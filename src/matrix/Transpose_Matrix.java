package matrix;

import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {

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


        // Transpose Matrix


        System.out.println("Transpose Matrix is: ");
        int[][] transpose = new int[columns0][rows0];
        for (int i = 0; i < rows0; i++) {
            for (int j = 0; j < columns0; j++) {
                transpose[j][i] = matrix0[i][j];
            }
        }
        // Here, i will be now columns and j is now rows
        for (int i = 0; i < columns0; i++) {
            for (int j = 0; j < rows0; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
