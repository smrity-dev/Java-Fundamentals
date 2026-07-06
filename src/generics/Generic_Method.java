package generics;

public class Generic_Method {
        public static <T> void print(T value)
        {
            System.out.println(value);
        }
        public static void main(String[] args){
            print(100);
            print("Java");
            print(99.9);
            print(true);

        }
    }


    /*

        |           Generic Class                 |         Generic Method         |
        | --------------------------------------- | ---------------------------------------- |
        | `class Box<T>`                          | `public static <T> void print(T value)`  |
        | Puri class generic hota hai             | sirf ek method generic hota hai          |
        | Object banate waqt type decide hota hai | Method call ke time type decide hota hai |
*/