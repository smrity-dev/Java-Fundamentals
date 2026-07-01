package oops;

// Inheritance

class Person{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
class Children extends Person{                          // Inherits Person class properties
    public void study(){
        System.out.println("Studying");
    }
}
public class Inheritances{
    static public void main(String[] args){
        Children c1 = new Children();
        c1.eat();
        c1.study();
        c1.sleep();
    }
}
