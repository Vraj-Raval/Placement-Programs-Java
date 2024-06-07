// W.A.P. to check given number is odd or even using bitwise operator.
public class pr4 {
    public static void main(String[] args) {
        int num = 15;
        if ((num & 1) == 1)
        System.out.println(num + " is odd number");
        else
        System.out.println(num + " is even number");
    }
}
