package matrix;

import java.util.Scanner;

public class Addition_Matrix {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // Matrix Inputs
        System.out.println("Enter the number of 1st matrix rows");
        int rows0 = sc.nextInt();
        System.out.println("Enter the number of 1st matrix columns");
        int columns0 = sc.nextInt();
        int[][] matrix0 = new int[rows0][columns0];
        System.out.println("Enter elements of order " + rows0 + "*" + columns0 + " matrix");
        for (int i = 0; i < rows0; i++) {
            for (int j = 0; j < columns0; j++) {
                matrix0[i][j] = sc.nextInt();
            }
        }
        // Matrix Printing
        System.out.println("1st Matix is: ");
        for (int i = 0; i < rows0; i++) {
            for (int j = 0; j < columns0; j++) {
                System.out.print(matrix0[i][j] + " ");
            }
            System.out.println();
        }


        // 2nd Matrix Inputs
        System.out.println("Enter the number of 2nd matrix rows");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of 2nd matrix columns");
        int columns1 = sc.nextInt();
        int[][] matrix1 = new int[rows0][columns0];
        System.out.println("Enter elements of order " + rows1 + "*" + columns1 + " matrix");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        // 2nd Matrix Printing
        System.out.println("2nd Matix is: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }


        if (rows0 == rows1 && columns0 == columns1) {
            System.out.println("Matrix sum is: ");
            for (int i = 0; i < rows0; i++) {
                for (int j = 0; j < columns0; j++) {
                    System.out.print((matrix0[i][j] + matrix1[i][j] + " "));
                }
                System.out.println();
            }
        } else {
            System.out.println("Couldn't find summation, because order of matrix doesn't same ");
        }

    }
}
