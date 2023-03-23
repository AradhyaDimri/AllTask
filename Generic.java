
package Task;
import java.util.*;
public class Generic {

	public static void main(String[] args) {
		ArrayList<Integer>  arraylist=new ArrayList<Integer>();
		//arraylist.add("str");
		arraylist.add(20);
		arraylist.add(456);
		//int a=(int) arraylist.get(0);       // need to typecast agr <Integer> nahi lagate
		int a=arraylist.get(0);               //--typecasting ki need nahi hoyi ider
		System.out.println(a);

	}

}
