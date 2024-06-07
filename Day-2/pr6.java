// W.A.P. to read n numbers in an array and print the sum of odd numbers & even numbers.
import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number in arry");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                even=even+arr[i];
            }
            else
            {
                odd=odd+arr[i];
            }
        }
        System.out.println("even="+even);
        System.out.println("odd="+odd);
    }
}
