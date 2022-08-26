package hashing;

import java.util.Set;

public class UnionOfArrayElement {

	public static int unionElement(int[] a,int[] b) {
		
		Set<Integer> set = new java.util.HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			set.add(b[i]);
		}
		return set.size();
	}
}
