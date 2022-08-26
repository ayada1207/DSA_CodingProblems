package hashing;

import java.util.Set;

public class IntersectionOfTwoArrays {

	public static int instersection(int[] a, int[] b) {
		
		int count=0;
		Set<Integer> set = new java.util.HashSet<Integer>();
		Set<Integer> set1 = new java.util.HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			if(set.contains(b[i])) {
				set1.add(b[i]);
			}
		}
		return set1.size();
		
	}
}
