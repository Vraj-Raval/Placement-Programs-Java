// Accept two integers from the user and calculate the sum of last digits of both the integers. For
// example, if the numbers are 27 and 459, then the sum of last digits would be 16 (i.e. 7 + 9).
import java.util.Scanner;
public class pr12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n1=sc.nextInt();
        System.out.println("Enter number");
        int n2=sc.nextInt();
        System.out.println(n1%10 + n2%10);
        
    }
}
