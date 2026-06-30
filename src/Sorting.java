import java.util.Scanner;
public class Sorting {

    public static void main (Strings[] args) {
        Scanner sc = new Scanner(System.in);
        // Array Declaration
        System.out.println("Enter the number of elements in an Array");
        int size = sc.nextInt();
        System.out.println("Start entering " + size + " elements of an array");
        int[] array = new int[size];
        // Array Inputs
        for (int i = 0; i < size; i++) {
            System.out.println("Array's " + (i + 1) + "st element is : ");
            array[i] = sc.nextInt();
        }
        // Array Print
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

                                            // Bubble Sorting

        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    //swap  array[j] and array[j-1]
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        // Array Print
        for (int i = 0; i < size; i++) {
            System.out.println("Bubble sort array is : " + array[i]);
        }

        /*

                                                //Selection sorting

        for (int j = 0; j < size - 1; j++) {
            int small = j;
            for (int i = j + 1; i < size; i++) {
                if (array[i] < array[small]) {
                    small = i;
                }
            }
            int temp = array[j];
            array[j] = array[small];
            array[small] = temp;
        }
             for (int i = 0; i < size; i++) {
            System.out.println("Selection sort array is : " + array[i]);
        }

                                               // Insertion Sorting

        for (int j = 1; j < size; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Insertion sort array is : " + array[i]);
        }
         */
    }
}
