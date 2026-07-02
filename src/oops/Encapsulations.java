package oops;

//Encapsulation
class Bank{
    private double balance = 50000;
    public void deposit(double amount) {
        if(amount>0) {
            balance = balance + amount;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    public void withDraw(double amount) {
        if(amount>balance){
            System.out.println("Insufficient Balance");
            return;
        }
        balance = balance - amount ;
    }
    public double checkBalance(){
        return balance;
    }
}

public class Encapsulations{
    static public void main(String[] args){
        Bank b1 = new Bank();                 // yaha Scanner se input bhi le skate hai
        b1.deposit(100);
        System.out.println(b1.checkBalance());
        b1.withDraw(400);
        System.out.println(b1.checkBalance());
    }
}

