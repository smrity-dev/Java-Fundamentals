/*

Single word input --> String s = sc.next();
Puri line input   --> String s = sc.nextLine();
String's length  --> s.length()
Character extract --> s.charAt(index)


 */

                                                // String Questions
import java.util.Scanner;
public class Strings {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");

        String s = sc.nextLine();
        System.out.println("String : " + s);
        System.out.println("Length : " + s.length());
        System.out.println("First Element Index : " + s.charAt(0));
        System.out.println("Last Element Index : " + s.substring(3, 9));      //first mentioned but not last mention
        System.out.println("'a' Index : " + s.indexOf('a'));
        System.out.println("'a' Index : " + s.lastIndexOf('a'));
        System.out.println("UpperCase: " + s.toUpperCase());
        System.out.println("LowerCase : " + s.toLowerCase());
        System.out.println("Element Concatenation: " + s.concat(" Java"));
    }
}
