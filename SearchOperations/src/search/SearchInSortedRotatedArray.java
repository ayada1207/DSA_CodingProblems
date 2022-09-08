package search;

public class SearchInSortedRotatedArray {
	
	public static int seacrch(int[] arr, int n, int x) {
		int low=0;
		int high =n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			//left half is sorted
			if(arr[low]>arr[mid]) {
				if(x>=arr[low] && x<arr[mid]) {
					high=mid-1;
				}else {
					low=mid+1;
				}
			}
			//Right half is sorted
			
			else {
				if(x<=arr[high] && x>arr[mid]) {
					low = mid-2;
				}else {
					high=mid-1;
				}
			}
		}
		return -1;
	}

}
