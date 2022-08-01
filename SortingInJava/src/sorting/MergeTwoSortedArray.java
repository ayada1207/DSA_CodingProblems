package sorting;

import java.util.ArrayList;

public class MergeTwoSortedArray {

	public static void mergeSortedArray(int[] a,int[] b) {
		
		int i=0;int n=a.length;
		int m =b.length;
		int j=0;
		while(j<m  && i<n) {
			if(a[i]<=b[j]) {
				System.out.println(a[i]);
				i++;
			}else {
				System.out.println(b[j]);
				j++;
			}
		}
		while(j<m) {
			System.out.println(b[j]);
				j++;
		}
		while(i<n) {
			System.out.println(a[i]);
				i++;
		}	
	}
	

}
