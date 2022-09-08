package hashing;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortA1ByA2 {

	// Two array are given sort first array acc to A2, given order 
	//int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
	//int A2[] = {2, 1, 8, 3};
	// OP: 2 2 1 1 8 8 3 5 6 7 9 
	public static int[] sortByAnotherArray(int[] A1,int M,int[] A2,int N) {
		 Map<Integer,Integer> map = new LinkedHashMap<>();
		 Map<Integer,Integer> map2 = new LinkedHashMap<Integer, Integer>();
		 int temp[] = new int[M];
	       for(int i=0;i<M;i++){
	           map.put(A1[i],map.getOrDefault(A1[i],0)+1);
	       }
	       for(int i=0;i<N;i++){
	           map2.put(A2[i],map.getOrDefault(A2[i],0)+1);
	       }
	     int k=0;
	       for(int j=0;j<N;j++){
	           if(map.containsKey(A2[j]))
	           {
	               int x= map.get(A2[j]);
	               int m=0;
	               while(m<x){
	                   temp[k]=A2[j];
	                   m++;k++;
	               }
	              
	           }
	       }
	       Arrays.sort(A1);
	       for(int j=0;j<M& k<M;j++){
	    	   if(!map2.containsKey(A1[j])) {
	    	   temp[k]=A1[j];
	    	   k++;
	    	   }
	       }
	       for(int j=0;j<M;j++){
	    	   System.out.print(temp[j] + " ");
	       }
	    
	       return temp;
	}
}
