package search;

//Given an integer array representing the heights of N buildings, the task is to
//delete N-2 buildings such that the water that can be trapped between the remaining 
//two building is maximum.

/**
I/P: 
N = 6
height[] = {2,1,3,4,6,5}
Output: 8
Explanation: The heights are 2 1 3 4 6 5.
So we choose the following buildings
2,5  and remove others. Now gap between 
two buildings is equal to 4, and the
height of smaller one is 2. So answer is
2 * gap = 2*4 = 8. There is
no answer greater than this.
 *
 */

public class MaxWaterBuildings {

	// Naive 
	
	public static int findMaxWater(int[] arr,int n) {
		int res=0;int max=0;
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>i;j--) {
				max=(j-i-1)*Math.min(arr[i], arr[j]);
				res = Math.max(max, res);
			}
		}
		return res;
	}
	
	//Efficient 
	
	public static int maxWater(int[] arr, int n) {
		int l=0;int h=n-1;
		int max=0;
		while(l<h) {
			if(arr[l]<arr[h]) {
				 max = Math.max(max, (h - l - 1) * arr[l]);
				l++;
			}else if(arr[l]>arr[h]) {
				max = Math.max(max, (h - l - 1) * arr[h]);
				h--;
			}else {
				max = Math.max(max, (h - l - 1) * arr[l]);
				h--;l++;
			}
		}
		return max;
		
	}
}
