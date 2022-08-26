package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfDistinctElement {

	//Method1
	public static ArrayList<Integer> getDistinct(int[] arr,int n) {
		ArrayList<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(arr[i], 0);
		}
		for(var a: arr) {
			map.put(a,map.getOrDefault(a, 0)+1);
		}
		
		for(var m : map.entrySet()) {
			if(m.getValue()==1)
				list.add(m.getKey());
		}
		return list;
	}
	
	// Method 2
	
	public static int getDstinctElementusingSet(int[] arr,int n) {
		
		Set<Integer> set = new java.util.HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		return set.size();
	}
}
