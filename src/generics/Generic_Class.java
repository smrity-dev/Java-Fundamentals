package generics;

class Box<T>{
    private T value;
    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
public class Generic_Class {
    public static void main(String[] args){

        // Integer ke liye
        Box<Integer> b0 = new Box<>();
        b0.set(100);
        System.out.println(b0.get());

        // String ke lie
        Box<String> b1 = new Box<>();
        b1.set("Hello");
        System.out.println(b1.get());

        // Double ke lie
        Box<Double> b = new Box<>();
        b.set(99.8);
        System.out.println(b.get());

    }
}