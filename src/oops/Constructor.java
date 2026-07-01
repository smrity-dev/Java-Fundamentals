package oops;

import java.util.Scanner;

class Student{
    // Default Constructor
    Student()
    {
        System.out.println("Constructor Created Successfully");
    }
    // Parametrized Constructor
    String name;
    int age;
    Student(String nm,int ag)
    {
        name = nm;
        age = ag;
    }
}


public class Constructor {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //Constructor
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        Student s0 = new Student();   // Without Parameters Default Constructor automatically called

        Student s = new Student(name,age);    // With Parameters Parameterized Constructor called
        System.out.println(s.name);
        System.out.println(s.age);

    }
}
