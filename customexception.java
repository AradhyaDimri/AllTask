package Task;
class AradhyaException extends Exception{
	public AradhyaException(String string) {
		super(string);
	}
}
public class customexception {

	public static void main(String[] args) {
		int i=4;
	    int j=0;
		try {
	    	j=8/i;
	    	if(j==2) 
	    	throw new AradhyaException("Yo boy");
	    
	    	}
	    catch(AradhyaException e) {
	    	System.out.println("Exception"+e);
	    }
	    System.out.println("Working " +j);
	}

}
