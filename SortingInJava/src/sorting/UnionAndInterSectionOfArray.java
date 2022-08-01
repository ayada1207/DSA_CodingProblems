package sorting;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionAndInterSectionOfArray {

	public static ArrayList<Integer> findUnion(int[] a,int[] b,int n,int m){
		ArrayList<Integer> list = new ArrayList<>();
		
		int i=0;int j=0;
		while(i<n && j<m) {
			if(i>0 && a[i-1]==a[i]) {i++;continue;}
			if(j>0 && b[j-1]==b[j]) {j++;continue;}
			if(a[i]<b[j]) {
				list.add(a[i]);
				i++;
			}else if(a[i]>b[j]) {
				list.add(b[j]);
				j++;
			}else {
				list.add(a[i]);
				i++;
				j++;
			}
		}
		while(i<n) {
			if(i>0 && a[i-1]==a[i]) {i++;continue;}
			list.add(a[i]);
			i++;
		}
		while(j<m) {
			if(j>0 && b[j-1]==b[j]) {j++;continue;}
			list.add(b[j]);
			j++;
		}
		return list;
	}
	
	// another Efficient approach Using tree set
	
	public static ArrayList<Integer> union(int[] arr1,int[] arr2,int n,int m){
		 {
		        TreeSet<Integer> set = new TreeSet<>();
		         
		        // Remove the duplicates from arr1[]
		        for (int i : arr1)
		            set.add(i);
		       
		        // Remove duplicates from arr2[]
		        for (int i : arr2)
		            set.add(i);
		       
		        // Loading set to array list
		        ArrayList<Integer> list
		            = new ArrayList<>();
		        for (int i : set)
		            list.add(i);
		 
		        return list;
		    }
	}
}
