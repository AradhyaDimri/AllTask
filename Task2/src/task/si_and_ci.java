package task;
import java.util.*;
public class si_and_ci {

	public static void main(String[] args) {
		int p;
		System.out.println("Enter the Principal:");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		
		int r;
		System.out.println("Enter the Rate:");
		Scanner sc3=new Scanner(System.in);
		r=sc3.nextInt();
		
		int t;
		System.out.println("Enter the Time:");
		Scanner sc2=new Scanner(System.in);
		t=sc2.nextInt();
		
		float si=(p*r*t)/100f;
		double ci=p * Math.pow(1.0+r/100.0,t) - p;
		System.out.println("The SI is:" + si) ;
		System.out.println("The CI is:" + ci) ;
	}

}
