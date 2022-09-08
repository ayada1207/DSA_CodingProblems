package search;

import java.util.ArrayList;

public class PairsOfSum {

	public static ArrayList<Integer> getPairs(int[] arr,int low,int high,int sum){
		 ArrayList<Integer> al = new ArrayList<>();
		 boolean flag=false;
		 while(low<high) {
			 if(arr[high]+arr[low]==sum) {
				 al.add(arr[low]);
				 al.add(arr[high]);
				 flag=true;
				 return al;
			 }
			 else if(arr[high]+arr[low]>sum) {
				 high--;
			 }else {
				 low++;
			 }
		 }
		 if(!flag) {
			 al.add(-1);
		 }
		return al;
	}
	
	 
}
