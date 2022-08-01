package sorting;

public class MergeFunctionOfMergeSort {

	// Given: Two SubArray are sorted in array such that : low<=mid<high
	// Output: make array sorted
	public static void mergeFunction(int[] arr,int low, int mid, int high) {
		int n=mid-low+1;
		int m= high-mid;
		int left[] = new int[n];
		int[] right = new int[m];
		
		for(int i=0;i<n;i++) {
			left[i]=arr[low+i];
		}
		for(int i=0;i<m;i++) {
			right[i]=arr[mid+1+i];
		}
		int i=0;int j=0;int k=0;
		while(i<n && j<m) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				k++;
				i++;
			}else {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		while(i<n) {
			arr[k]=left[i];
			k++;
			i++;
		}
		while(j<m) {
			arr[k] = right[j];
			j++;
			k++;
			
		}
	}
}
