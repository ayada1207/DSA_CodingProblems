package string_Problems;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static boolean isIsomorphic(String s1, String s2) {
		int m = s1.length();
        int n = s2.length();
        
        if(m != n ) return false;
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Map<Character,Character> mp = new HashMap<>();
        for(int i=0;i<m;i++) {
        	if(mp.containsKey(str1[i])) {
        		if (!(mp.get(str1[i]).equals(str2[i]))) return false;
        	}else {
        		mp.put(str1[i], str2[i]);
        	}
        }
        
        
		return true;
        
	}
}
