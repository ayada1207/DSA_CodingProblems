package sorting;

import java.util.Arrays;

public class MinimumDiffrence {

	public static int findMinDiff(int[] arr) {
		Arrays.sort(arr);
		if(arr.length==1) {
			return arr[0];
		}
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			min = Math.min(min, arr[i]-arr[i-1]);
		}
		return min;
	}
}
