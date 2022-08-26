package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class HashSet {

	public static void main(String args[]) {
		
		//HashMap<String,String> set = new HashMap<String,String>();
		 Set<String> h = new java.util.HashSet<String>();
		 h.add("Australia");
		 h.add("India");
		 h.add("UK");
		 h.add("USA");
		 System.out.println(h);
		 h.remove("USA");
		 System.out.println(h);
		 if(h.contains("India")){
			 h.add("UK");
			 System.out.println(h);
		 }
		 
	}
}
