import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortByABSDiff {

	public static void sortByABSDiffrence(int[] arr,int n,int k) {
		 Map<Integer,Integer> mp = new HashMap<>();
	       for(int i=0;i<n;i++){
	            mp.put(arr[i],Math.abs(arr[i]-k));
	       }
	       int[] temp = new int[n];
	       int i=0;
	       for(Map.Entry<Integer,Integer> m:mp.entrySet()){
	           temp[i]=m.getValue();
	           i++;
	       }
	       Arrays.sort(temp);
	       int l=0;
	      
	         for(int j=0;j<n;j++) {
	        	 for(Map.Entry<Integer,Integer> m:mp.entrySet()){
	        	 if(temp[j]==m.getValue()) {
	        		 if(l>0 && arr[l-1]!=m.getKey())
	        		 arr[l]=m.getKey();
	        		 else if(l==0) {
	        			 arr[l]=m.getKey();
	        		 }
	        		 l++;
	        		 break;
	        	 }
	        	 
	         }
	       }
	       
	}
}
