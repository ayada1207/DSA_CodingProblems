package hashing;

import java.util.Map;
import java.util.Set;

// Given an unsorted array of integers and a sum. 
//The task is to count the number of subarray which adds to the given sum.
public class CountSubArrayWithGivenSum {
	
	public static int countSubArray(int[] ar, int sum) {
		
		Map<Integer,Integer> map = new java.util.HashMap<>();
		map.put(0,1);
		int count=0;int pre_sum=0;
		for(int i=0;i<ar.length;i++) {
			pre_sum+=ar[i];
		//	if(pre_sum==sum) count++;   // put this line or line 13 to cover for 
			//starting index i=0 
			if(map.containsKey(pre_sum-sum)) {
				count+= map.get(pre_sum-sum);
			}else {
				map.put(pre_sum,map.getOrDefault(pre_sum, 0)+1);
			}
		}
		return count;
	}
	
	// Given an unsorted array of integers 
	//The task is to count the number of subarray which adds to the given sum =0.
	
			public static int findCount(int[] arr) {
				Map<Integer,Integer> map = new java.util.HashMap<>();
				map.put(0,1);
				int count=0;int sum=0;
				for(int i=0;i<arr.length;i++) {
					sum+=arr[i];
					if(map.containsKey(sum)) {
						count+= map.get(sum);
					}
						map.put(sum,map.getOrDefault(sum, 0)+1);
				}
				return count;
				
			}

}
