package hashing;

import java.util.Map;
import java.util.Set;

public class SubArrayWithGivenSum {

	
	// Find if there is SubArray with given sum is equal to 0
	public static boolean isSubArrayWith0Sum(int[] arr, int n) {
		Set<Integer> set = new java.util.HashSet<Integer>();
		int pre_sum=0;
		for(int j=0;j<arr.length;j++) {
			pre_sum+=arr[j];
			if(set.contains(pre_sum)) {
				return true;
			}
			if(pre_sum==0) return true;
			else {
				set.add(pre_sum);
			}
		}
		return false;
	}
	
	
	//Find if there is SubArray with given sum 
	public static boolean subArrayWithGivenSum(int[] arr,int sum){
		Set<Integer> set = new java.util.HashSet<Integer>();
		int pre_sum=0;
		for(var a:arr) {
			pre_sum+=a;
		}
		if(pre_sum==sum) {return true;}
		if(set.contains(pre_sum - sum)){
			return true;
		}else {
			set.add(pre_sum);
		}
		return false;
	}
	
	//Find the longest subArray in given Array with given Sum
	
	public static int findLongestSubArray(int[] arr,int sum) {
		int pre_sum=0;int res=0;
		Map<Integer,Integer> map = new java.util.HashMap<Integer,Integer>();
		
		for(int j=0;j<arr.length;j++) {
			pre_sum +=arr[j];
			
			// if subArray starts from 0 then this condition will handle
			if(pre_sum==sum) {
				res= j+1;
			}
			// if Pre_sum is not Present in Map then Store
			if(!map.containsKey(pre_sum)) {
				map.put(pre_sum,j);
			}
			
			if(map.containsKey(pre_sum-sum)) {
				res=Math.max(res,j-(map.get(pre_sum-sum)));
			}
		}
		return res;
	}
	
	
}
