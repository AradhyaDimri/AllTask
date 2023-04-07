package Task;


	import java.util.*;

	public class reversequeue {
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	        Queue<Integer> queue = new LinkedList<>();
	        queue.add(1);
	        queue.add(2);
	        queue.add(3);
	        queue.add(4);
	        queue.add(5);
	        
	        
	        System.out.print("Enter the value of k: ");
	        int k = input.nextInt();
	        
	   
	        Stack<Integer> stack = new Stack<>();
	        for (int i = 0; i < k; i++) {
	            stack.push(queue.remove());
	        }
	        while (!stack.empty()) {
	            queue.add(stack.pop());
	        }
	        
	        
	        System.out.println(queue);
	    }
	}