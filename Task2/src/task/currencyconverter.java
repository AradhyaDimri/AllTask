package task;
import java.util.*;
public class currencyconverter {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("1 for Rupee to Dollar ");
        System.out.println("2 for Dollar to Rupee ");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
            System.out.print("Enter rupee amount: ");
            double r = in.nextDouble();
            double d = r / 82;
            System.out.println ("The Value is: " + d);
            break;
            
            case 2:
            System.out.print("Enter dollar amount: ");
            double d2 = in.nextDouble();
            double r2 = d2 * 82;
            System.out.println("The Value is:" + r2);
            break;
            
            default:
            System.out.println("Incorrect Choice");
        }
    }
}

