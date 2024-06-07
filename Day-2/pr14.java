// Accept a positive number from the user and print a message stating whether the number
// entered is even or odd WITHOUT using the module (%)operator and if... else statements
import java.util.*;

public class pr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        while (n != 0 && n > 0) {
            n = n - 2;
        }

        if (n == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
