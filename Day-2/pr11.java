// An electricity board charges the following rates for the use of electricity: For the first 200 units
// 80 paisa per unit, For the next 100 units 90 paisa per unit and beyond 300 units Rs 1.00 per unit.
// All users are charged minimum of Rs.100 as meter charge. If the total amount is more than Rs.
// 300 then an additional surcharge of 12.36% of total amount is charged. W.A.P. to read the
// number of units consumed and print out the bill amount.
import java.util.Scanner;
public class pr11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        double units = scanner.nextInt();
        double unitprice=1;
        if(units>300)
        {
            unitprice=units*1;
        }
        else if(units>200 && units<=300)
        {
            double temp1=units-200;
            double ans1=temp1*0.9;
            unitprice=(200)+(ans1);
        }
        else if(units<=200)
        {
            unitprice=units*(0.8);
        }
        double total = unitprice+100;
        double surcharge=0;
        if(total>300)
        {
            surcharge=(total*12.36)/100;
        }
        
        double finaltotal=total+surcharge;
        System.out.println("Unit price is:"+unitprice);
        System.out.println("meter charge is :100");
        System.out.println("Subcharge is:"+surcharge);
        System.out.println("The total bill amount is: "+finaltotal);
    }
}
