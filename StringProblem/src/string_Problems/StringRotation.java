package string_Problems;

public class StringRotation {

	public static boolean isRotates(String s1,String s2) {
		
		if(s1.length()!=s2.length()) return false;
		return ((s1+s1).indexOf(s2)>=0);
	}
}
