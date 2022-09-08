package search;


// check if triplet is present or not
public class TrippletOfSum {

	public static boolean findTriplet(int[] arr,int n,int x) {
		
		for(int i=0;i<n;i++) {
			int sum = x-arr[i];
			int l = (i>0)?0:1;
			int h = i<n-1 ? n-1 : n-2;
			
			while(l<h) {
				if(i == l )l++;
				if(i== h) h--;
				if(arr[l]+arr[h]>sum) {
					h--;
				}else if(arr[l]+arr[h]<sum) {
					l++;
				}else {
					return true;
				}
			}
		}
		return false;
	}
}
