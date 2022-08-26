package hashing;

import java.util.Map;
import java.util.Map.Entry;


public class HashMap {

public static void main(String args[]) {
		
		Map<String,Integer> mp = new java.util.HashMap<String,Integer>();
		 mp.put("Math", 92);
		 mp.put("Eng", 78);
		 mp.put("Hin", 77);
		 mp.put("Phy", 92);
		 mp.put("Coding", 89);
		 System.out.println(mp.getOrDefault("Hins", null));
		 
	for(Entry<String, Integer> m : mp.entrySet()) {
	  System.out.println(m.getKey() + " : " + m.getValue());
	  
	}
		 
	}

}
