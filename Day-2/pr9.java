// W.A.P. to read n numbers in an array and remove the duplicates from an array.
import java.util.Scanner;
public class pr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number in arry");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    for (int j2 = j; j2 < arr.length-1; j2++) {
                       
                        arr[j2]=arr[j2+1];
                    }
                }
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"");
        
        }

    }
}
