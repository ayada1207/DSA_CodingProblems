package hashing;

import java.util.Map;

public class LongestSubArrayWithEqual1sand0s {

	public static int longestSubArray(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			arr[i] = arr[i]==0 ? -1: arr[i];
		}
		
		int pre_sum=0;int res=0;
		Map<Integer,Integer> map = new java.util.HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			pre_sum +=arr[i];
			if(pre_sum == 0) {
				res=i+1;
			}
			if(map.containsKey(pre_sum)) {
				res=Math.max(res,i-map.get(pre_sum));
			}else {
				map.put(pre_sum, i);
			}
		}
		return res;
		
	}
}
