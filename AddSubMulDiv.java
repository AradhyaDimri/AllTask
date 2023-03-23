package Task;
import java.util.Scanner;
public class AddSubMulDiv {
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
	System.out.println("Sum is:"+(a+b));
	System.out.println("Diff is:"+(a-b));
	System.out.println("Mul is:"+(a*b));
	System.out.println("Div is:"+(a/b));
}
}
