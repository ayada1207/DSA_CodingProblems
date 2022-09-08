package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
class comparator implements Comparator<Map.Entry<Integer,Integer>>
{
    //Function used in sorting list elements first according to frequency
    //and if it is same for both values, then smaller number comes first.
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
	{
		if(o1.getValue() > o2.getValue())
			return -1;
		else if(o1.getValue() == o2.getValue()){
			if(o2.getKey() < o1.getKey())
			    return 1;
			else
			    return -1;
		    
		}
		else if(o1.getValue() < o2.getValue())
			return 1;
		
		return Integer.MIN_VALUE;
	}
	
}
public class SortBasedOnFreq {
	//Given an array of integers, sort the array according to frequency of elements.
	//That is elements that have higher frequency come first. If
	//frequencies of two elements are same, then smaller number comes first.
	//A[] = {5,5,4,6,4}
	//Output: 4 4 5 5 6
	public static ArrayList<Integer> sortArrayByFreq(int[] arr,int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		 Map<Integer,Integer> map = new LinkedHashMap<>();
		// Map<Integer,Integer> mapIndex = new LinkedHashMap<>();
	       for(int i=0;i<n;i++){
	    	   list.add(arr[i]);
	    	   if(map.containsKey(arr[i]))
	           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	    	   else {
	    		   map.put(arr[i], 1);
	    		  // mapIndex.put(arr[i],i);
	    	   }
	          
	       }
	       Collections.sort(list, (k1,k2)->{
	    	   int freq1 = map.get(k1);
	    	   int freq2 = map.get(k2);
	    	   
	    	   if(freq1 != freq2)
	    		   return freq2-freq1;
	    	   return k1.compareTo(k2);
	       });
		return list;
	}
	
	// 2nd Method Takes O(nlogn) time 
	 static ArrayList<Integer> sortByFreq(int arr[], int n)
	    {
	        //using map to keep count of the elements.
	        Map<Integer,Integer> map = new java.util.HashMap<>();
	        
	        //storing the frequency of each element in map.
			for(int i = 0; i < n; i++)
			{
					int num = arr[i];
					
						map.put(num, map.getOrDefault(num,0) + 1);
					
			}
			
			//copying the elements and their count from map to list.	
			List<Map.Entry<Integer,Integer>> set = new ArrayList<Map.Entry<Integer,Integer>> (map.entrySet());
			
			//sorting the list according to frequency.
			Collections.sort(set,new comparator());
			ArrayList <Integer> ans = new ArrayList<Integer>();
			
			for(int i = 0;i<map.size();i++)
			{
				int count = set.get(i).getValue();
				//storing elements as many times as their count in output list.
				while(count > 0)
				{
						ans.add(set.get(i).getKey());
						count -- ;
				}
			}
			//returning the output.
	        return ans;
	    }
}
