
import java.util.Scanner;
                                    // Functions add,sub,mul,div,modulo
    public class Functions {
        static float add(float a, float b) {              // Function class ke andar lekin Main function ke bahar
            return a + b;
        }


        // Sum Of Digits using Function
        static int sum_of_digit(int num) {
            int digit, sum = 0;
            while (num > 0) {                             //Function class ke andar lekin Main function ke bahar
                digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            return sum;
        }

        // Factorial Using Function

        static int fact(int n) {
            int fact = 1;                           //Function class ke andar lekin Main function ke bahar
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }


        // Palindrome using function

        static int palindrome(int num) {
            int digit, rev = 0;
            int original = num;
            while (num > 0) {                      //Function class ke andar lekin Main function ke bahar
                digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }
            if (original == rev) {
                return 1;
            } else {
                return 0;
            }
        }

        public static void main(Strings[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            float num0 = sc.nextFloat();
            System.out.print("Enter other number: ");
            float num1 = sc.nextFloat();
            float ans = add(num0, num1);
            System.out.println(ans);

            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            int answ = sum_of_digit(num);
            System.out.println(answ);

            float answe = fact(num);
            System.out.println(answe);

            int answer = palindrome(num);
            if (answer == 1) {
                System.out.println("Yes Palindrome");

            } else {
                System.out.println("Not a Palindrome");
            }
            System.out.println(answer);
        }
    }


/*

                               // Maximum of Three numbers

        ---->>>>>        Math.max(num2,(Math.max(num,num1)));

                               // Minimum of Three numbers

        ---->>>>>        int ans = Math.min(num2,(Math.min(num,num1)));


*/