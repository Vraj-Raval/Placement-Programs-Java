// Accept three integer values from the user and display them in ascending order using only
// operators (i.e. without using if…else, switch case, or loop).
import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Find the smallest value
        int min = (a < b && a < c) ? a : (b < c) ? b : c;
        
        // Find the largest value
        int max = (a > b && a > c) ? a : (b > c) ? b : c;
        
        // Find the middle value
        int mid = (a + b + c) - min - max;
        
        System.out.println("Numbers in ascending order: " + min + " " + mid + " " + max);
        
        scanner.close();
    }
}
