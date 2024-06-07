// W.A.P. to check given number is prime or not.
import java.util.*;
public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int count=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0)
            {
                count++;
            }
        }
        if (count==0)
        {
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
