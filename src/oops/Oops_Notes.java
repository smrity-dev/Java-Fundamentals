                            // Rules
/*
                                                // Methods
// Method = Inside class, when we write functions = methods
//this refers always current object

    Example:- Student s1 = new Student();
    object uses -> Heap Memory                       (object = new Student())
    Reference Variable uses -> Stack Memory          (reference variable = s1)




                     // Constructor
 No return type
 Class name = Constructor name
 Constructor calls itself when object created



                            // Method Overloading in Inheritance ( use of super )
     Rules
// same return type
// same function name
// same parameters       (Different Behaviour)
//same access modifier (public,private)
//super prints details of parent class (inherits)





      nextInt() , nextFloat() , nextDouble()
      ke baad nextLine() aane wala ho, to beech me
      sc.nextLine(); compulsory lagana padega

      example:-
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
    --> sc.nextLine();
        System.out.print("Enter Name: ");
        String name1 = sc.nextLine();


        Example:  Animal a = new Dog();
        Compile Time checks: Animal
        Runtime checks: Dog


        "Extracts" use for Single Inheritance
        "Implements" use for Multiple Inheritance

                 // Final Keyword
  1.) Final Variable
 final int x = 10; x = 20;  ❌ Error because Value change no kar skate.
  2.) Final Method
 final void show(){}        ❌ Override no kar skate.
  3.) Final Class
  final class Animal{}      ❌ Inherit no kar skate.

 */