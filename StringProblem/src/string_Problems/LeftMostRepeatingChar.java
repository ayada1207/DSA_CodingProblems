package string_Problems;

import java.util.HashMap;
import java.util.Map;

public class LeftMostRepeatingChar {

	static int CHAR = 256;
	public static int leftMost(String str) {
		
		boolean flag = false;
		int res=Integer.MAX_VALUE;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);
			}else {
				flag = true;
				res = Math.min(res, map.get(str.charAt(i)));
			}
		}
		if(flag)return res;
		return -1;
	}
	
	public static int leftMostNonRepeating(String str) {
		int[] count = new int[CHAR];
		
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		
		}
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1) {
				return i;
			}
		}
		return -1;
	}
}
