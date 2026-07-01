package oops;

//Abstract class + Runtime Polymorphism
abstract class Animals{
    abstract void sound();
}
class Dogs extends Animals{
    void sound(){
        System.out.println("Bark");
    }
}
class Cats extends Animals{
    void sound(){
        System.out.println("Meow");
    }
}
public class AbstractClass{
    public static void main(String[] args){
        // Abstract class with Runtime Polymorphism
        Animals a1 = new Dogs();
        Animals a2 = new Cats();
        a1.sound();                   // Prints "Bark"
        a2.sound();                   // Prints "Meow"
    }
}
