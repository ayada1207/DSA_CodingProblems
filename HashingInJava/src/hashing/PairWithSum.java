package hashing;

import java.util.Set;

public class PairWithSum {

	public static boolean pairWithSum(int[] arr,int sum) {
		
		Set<Integer> set = new java.util.HashSet<Integer>();
		
		for(int j=0;j<arr.length;j++) {
			if(set.contains(sum-arr[j])) {
				return true;
			}
			else {
				set.add(arr[j]);
			}
		}
		return false;
		
	}
}
