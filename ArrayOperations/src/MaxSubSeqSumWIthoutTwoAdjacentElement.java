
public class MaxSubSeqSumWIthoutTwoAdjacentElement {

	public static int maxSubseqSum(int[] arr,int n) {
		
		int ans = maxSumWithouAdjacent(arr,n-1);
			return ans;
		
	}
	
	static int maxSumWithouAdjacent(int[] arr,int n) {
		if(n<0) return 0;
		if(n==0) return arr[0];
		
		int incl = maxSumWithouAdjacent(arr,n-2)+arr[n];
		int excl = maxSumWithouAdjacent(arr,n-1)+0;
		return Math.max(incl, excl);
	}
}
