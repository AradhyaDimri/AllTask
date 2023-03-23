package Task;
import java.util.Scanner;
public class Multiply2Num {
	public static void main(String args[])
	{
		int a;
		System.out.println("Enter a:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		int b;
		System.out.println("Enter b:");
		Scanner sc1=new Scanner(System.in);
		b=sc1.nextInt();
		
		System.out.println("Output is:"+(a*b));
}
}