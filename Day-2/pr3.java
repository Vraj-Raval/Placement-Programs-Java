// W.A.P. to check given number is palindrome or not.
import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int temp=0;
        int ans=0;
        int check=n;
        while(n!=0)
        {
           temp=n%10;
           ans=ans*10+temp;
           n=n/10;
        }
       
        if(check==ans)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}
