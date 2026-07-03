package exception_handling;

// Try , Throw , Catch
//try,catch
import java.util.Scanner;
public class ExceptionHandle {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        try{
            if(b==0) {
                throw new ArithmeticException("Denominator value will not be 0");
            }
            int div = a/b;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program Terminated");
        }
    }
}


/*              // throw-throws method,exception

public class ExceptionHandling {
    static void checkAge(int age) throws Exception {
        if(age < 18){
            throw new Exception("Not Eligible For Voting");
        }
        System.out.println("Eligible For Voting");
    }
    public static void main(String[] args) {
        try{
            checkAge(15);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
 */




// My Notes
/*

                                      //Throw vs. Throws

                            "throw"                  (Exception ko create aur bhejta hai.)
    Example:-     throw new Exception("Invalid Age");
    Meaning:-     Abhi isi jagah exception phenk do.

                            "throws"                   ( Method declaration me use hota hai.)
    Example:-     void checkAge() throws Exception
    Meaning:-     1.) Ye method future me exception de sakta hai. 2.) Warning hai. 3.) Exception create nahi karta

                                   e = exception object ka reference.
                                   try = // risky code
                                   catch = catches exceptions
                                   Exception = Exception is also a Class.

                                   Different Types Of Exceptions

        Exception Types             |       Reasons           |
 ------------------------------     | ----------------------- |
 ArithmeticException                | 10/0                    |       (throw new ArithmeticException)
 ArrayIndexOutOfBoundsException     | arr[100]                |       (throw new ArrayIndexOutOfBoundsException)
 NullPointerException               | null.length()           |       (throw new NullPointerException)
 NumberFormatException              | Integer.parseInt("abc") |       (throw new NumberFormatException)
 Exception                          | General Exception       |       (throw new Exception)

*/
