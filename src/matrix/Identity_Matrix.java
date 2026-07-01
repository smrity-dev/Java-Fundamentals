package matrix;

import java.util.Scanner;

public class Identity_Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Matrix Inputs
        System.out.println("Enter the number ");
        int rows0 = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns0 = sc.nextInt();
        int[][] matrix0 = new int[rows0][columns0];


        int identity[][]=new int[rows0][columns0];
        System.out.println("Identity Matrix of order " + rows0 +" * " + columns0 + " is : ");
        for(int i=0;i<rows0;i++)
        {
            for(int j=0;j<columns0;j++)
            {
                if(i==j)
                    identity[i][j]=1;
                else
                    identity[i][j]=0;

                System.out.print(identity[i][j]+" ");
            }
            System.out.println();
        }
    }
}
