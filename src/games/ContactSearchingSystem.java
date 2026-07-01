package games;

import java.util.Scanner;
public class ContactSearchingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        String[] phones = new String[5];
        for(int i=0; i<names.length; i++)
        {
            System.out.println("Enter Name:");
            names[i] = sc.nextLine();
            System.out.println("Enter Phone:");
            phones[i] = sc.nextLine();
        }
        for(int i=0; i<names.length; i++)
        {
            System.out.print("Name : " + names[i] );
            System.out.print("     ");
            System.out.print("Phone Number : " + phones[i]);
            System.out.println();
        }
        System.out.println("Enter Searching Name to Search");
        String searchName = sc.nextLine();
        for(int i=0;i<names.length;i++){
            if(names[i].equals(searchName)){
                System.out.println("Name : " + names[i] + "    Phone Number : " + phones[i]);
            }
        }
    }
}
