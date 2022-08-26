package string_Problems;

public class RotateStringBy2Places {

	 public static boolean isRotated(String s1, String s2)
	    {
	       int m = s1.length();  // s1 = amazon , s2 = azonam
	       int n = s2.length();
	      
	       String ans = s2.substring(n-2,n)+s2.substring(0, n-2);
	       
	       if(s1.equals(ans)) {
	    	   return true;
	       }
	       String ans1 = s1.substring(n-2,n)+s1.substring(0, n-2);
	       
	       if(s2.equals(ans1)) {
	    	   return true;
	       }
	       return false;
	    }
}
