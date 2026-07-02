package oops;

class Animal{                                               //Parent Class
    public void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{                                    //Child Class
    @Override
    public void sound(){
        System.out.println("Bark");                          // "Bark" overrides "Animal Sound"
    }
}
public class Overloading{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.sound();                                           // prints Bark (child class overrides parent)
        // If we use Super method
        //super.sound();                                        // prints Animal Sound (super finds parent)
    }
}



