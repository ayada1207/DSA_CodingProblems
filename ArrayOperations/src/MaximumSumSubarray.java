
public class MaximumSumSubarray {
	
	//Naive Approach
	public static int getSum(int[] arr) {
		
		int res=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			int currSum =0;
			for(int j=i;j<arr.length;j++) {
				currSum += arr[j];
				res = Math.max(currSum, res);
			}
		}
		return res;
	}
	
	//efficient Approach

	public static long getSumSubArray(int[] arr) {
		
		int res=arr[0];
		int maxEnding  =arr[0];
		
		for(int i=1;i<arr.length;i++) {
		maxEnding = Math.max(maxEnding+arr[i],arr[i]);
		res= Math.max(maxEnding, res);
		}
		return res;
	}
}
