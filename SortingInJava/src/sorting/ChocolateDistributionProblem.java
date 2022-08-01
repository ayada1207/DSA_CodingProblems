package sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {

	public static int findMinimumChoco(int[] arr,int m) {
		if(m>arr.length)return -1;
		int res=arr[m-1]-arr[0];
		Arrays.sort(arr);
		int i=0;
		while(i+m-1<arr.length) {
			res=Math.min(res, arr[i+m-1]-arr[i]);
			i++;
		}
		return res;
		
		
	}
}
