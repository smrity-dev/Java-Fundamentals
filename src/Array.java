


                     //Array Programming

        import java.util.Scanner;
        public class Array {

            public static void main(Strings[] args) {
                Scanner sc = new Scanner(System.in);
                         // Array Declaration
                System.out.println("Enter the number of elements in an Array");
                int n = sc.nextInt();
                System.out.println("Start entering " + n + " elements of an array");
                int[] arr = new int[n];
                         // Array Inputs
                for (int i = 0; i < n; i++) {
                    System.out.println("Array's " + (i + 1) + "st element is : ");
                    arr[i] = sc.nextInt();
                }
                         // Array Print
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }
                       // Sum and Average
                int sum = 0, avg;
                for (int i = 0; i < n; i++) {
                    sum = sum + arr[i];
                }
                avg = sum / n;
                System.out.println("Total sum of array is: " + sum);
                System.out.println("Total average of array is: " + avg);

                     // Maximum - Minimum

            int max = arr[0];
            int min = arr[0];
            for(int i = 1; i<n;i++)
            {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Maximum is: "+max);
            System.out.println("Minimum is: "+min);
          }
        }
