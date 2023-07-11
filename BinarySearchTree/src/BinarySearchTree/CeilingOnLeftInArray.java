package BinarySearchTree;

import java.util.TreeSet;

// Need to print ceiling(Nearest greater) for each element in array of its left side of elements,
//In: [2,8,30,15,25,12]
//     -1,-1,-1,30,30,15
public class CeilingOnLeftInArray {

	
	public static void printCeiling(int[] arr,int n) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(arr[0]);
		System.out.println(-1);
		for(int i=1;i<n;i++) {
			if(set.ceiling(arr[i]) != null) {
				System.out.println(set.ceiling(arr[i]));
			}else {
				System.out.println(-1);
			}
			set.add(arr[i]);
		}
	}
	
	
}
