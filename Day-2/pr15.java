// Create a program that would accept a string from the user and print a pattern. For example, if
// the user enters “Hello”, it should print a pattern as follows:
// H
// He
// Hel
// Hell
// Hello
import java.util.Scanner;
public class pr15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, i + 1));
        }
        
    }
}
