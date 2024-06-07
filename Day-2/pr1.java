// W.A.P. to find the largest number from given 3 numbers using conditional operator.
import java.util.*;
class pr1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number");
       int n1=sc.nextInt();
       System.out.println("Enter Second number");
       int n2=sc.nextInt();
       System.out.println("Enter Third number");
       int n3=sc.nextInt();


       int ans=n1>n2?n1>n3?n1:n3:n2>n3?n2:n3;
        System.out.println("Largest number is "+ans);
    }
}