package string_Problems;

import java.util.Arrays;

public class AnagramString {

	static final int CHAR=256;
	public static boolean isAnagramString(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		int count[] = new int[CHAR];
		
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for(int j=0;j<CHAR;j++) {
			if(count[j]!=0) {
				return false;
			}
		}
		return true;
 		
	}
	
	// naive approach 
	public static boolean isAnagram(String s1, String s2) {
		char[] temp = s1.toCharArray();
		char[] temp1 = s2.toCharArray();
		
		Arrays.sort(temp1);
		Arrays.sort(temp);
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i] != temp1[i]) {
				return false;
			}
		}
		return true;
	}
	
}
