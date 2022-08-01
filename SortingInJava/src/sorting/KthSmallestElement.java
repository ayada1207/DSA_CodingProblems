package sorting;

public class KthSmallestElement {

	public static int kthSmallest(int[] arr,int l,int h,int k) {
		int pivot = arr[h];
		
		while(l<=h) {
			int p = LomutoPatitionAlgorithm.lomutoPartition(arr, l, h);
			if(p>(k-1)) {
				h=p-1;
			}else if(p < (k-1)){
				l=p+1;
			}
			else
				return arr[k-1];
		}
		
		
		return -1;
	}
	
}
