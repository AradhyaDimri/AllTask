package Task;

import java.util.Scanner;

public class Avg3Num {
	public static void main(String args[]) {
	int a;
	System.out.println("Enter a:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	
	int b;
	System.out.println("Enter b:");
	Scanner sc1=new Scanner(System.in);
	b=sc1.nextInt();
	
	int c;
	System.out.println("Enter b:");
	Scanner sc2=new Scanner(System.in);
	c=sc1.nextInt();
	
	float avg=(a+b+c)/3f;
	System.out.println("Output is:"+avg);

}
}
