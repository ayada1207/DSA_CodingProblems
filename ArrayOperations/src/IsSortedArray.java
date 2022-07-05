
public class IsSortedArray {
	
	public static boolean isSorted(int[] arr) {
		int n = arr.length;
		boolean isSorted = false;
		 
		if(n==1) return true;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<arr[i+1]) 
				 isSorted=true;
			else
			return false;
		}
		return isSorted;
	}

}
