package Task;
	import java.util.*;

	public class mapfrequency {
	    public static void main(String[] args) {
	        String input = "believe in yourself";
	        Map<Character, Integer> freqMap = new HashMap<>();
	        
	        for (char c : input.toCharArray()) {
	            if (Character.isLetterOrDigit(c)) {
	                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
	            }
	        }
	        
	        System.out.println("Frequency of digits and alphabets in \"" + input + "\":");
	        System.out.println(freqMap);
	    }
	}

