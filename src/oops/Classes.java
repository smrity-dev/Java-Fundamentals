package oops;
import java.util.Scanner;

class Students{
    String name;
    int age;
    int marks;

    //Methods        ( Inside class )
    void introduce(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My marks is " + marks);
    }
}

// Concepts of This --->>> when parameter and variable both identifier are same
class Stud {
    String name;
    Stud(String name) {
        //name=name;                      prints "null"
        //this.name = name;               prints "Smriti"
        this.name=name;                   //this.name = variable ka name & name = parameter ka name
    }
}

class Calculator{
    void add(int a,int b){            //Methods with Parameters + No return
        System.out.println(a+b);
    }
    int sum(int a,int b){
        return (a+b);
    }
}


class Shape{
    float rectangle(float length, float breadth){
        return (length*breadth);
    }
    double circle(double radius){
        return (3.14*radius*radius);
    }
}


public class Classes {
    static public void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Students s1 = new Students();             // new -> Objects created when new allocates the memory
        s1.name = "Simi";
        s1.age = 19;
        s1.marks = 82;

        //No method of print details (First)
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);
        //Method of printing details (Second)
        s1.introduce();

        Stud s = new Stud("Smriti");
        System.out.println(s.name);

        Calculator c1 = new Calculator();
        //Method of add without return value
        c1.add(6, 7);
        //Method of add with return value
        int ans = c1.sum(7, 8);                                  // (Value ko store karna padega return type wale value me)
        System.out.println(ans);

        System.out.println("Enter Length: ");
        float length = sc.nextFloat();
        System.out.println("Enter Breadth: ");
        float breadth = sc.nextFloat();
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        Shape shape = new Shape();
        float areaRec = shape.rectangle(length,breadth);
        double areaCirc =  shape.circle(radius);
        System.out.println(areaRec);
        System.out.println(areaCirc);



    }
}
