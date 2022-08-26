package hashing;

import java.util.Map;

public class FirstRepeatingElement {

	public static int firstRepeating(int[] arr,int n) {
		 Map<Integer,Integer> map = new java.util.HashMap<Integer, Integer>();
	        int res=Integer.MAX_VALUE;
	        boolean flag = false;
	    for(int i=0;i<n;i++){
	       if(!map.containsKey(arr[i])) {
	    	   map.put(arr[i], i);
	       }else {
	    	   flag= true;
	    	   res = Math.min(res, map.get(arr[i]));
	       }
	    }
	    if(flag)return res;
	    return -1;
	    
	}
}
