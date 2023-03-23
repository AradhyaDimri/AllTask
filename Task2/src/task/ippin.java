package task;

public class ippin {
	 public static boolean validate(final String ip) {
		    String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
		    return ip.matches(PATTERN);
		  }

		  public static void main(String[] args) {
		    String ip1 = "192.168.10.5";
		    String ip2 = "192.1681.10.5";

		    if (validate(ip1) == true)
		      System.out.println("IP address is valid");
		    else
		      System.out.println("IP address is not valid");

		    if (validate(ip2) == true)
		      System.out.println("IP address is valid");
		    else
		      System.out.println("IP address is not valid");

		  }
		}
