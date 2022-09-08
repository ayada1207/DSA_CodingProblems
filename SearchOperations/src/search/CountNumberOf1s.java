package search;

public class CountNumberOf1s {

	public static int count1s(int[] arr) {
		int n=arr.length;
		int low=0;int high=n-1;
		int res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid]==1) {
				res=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(res==-1) {
			return 0;
		}
		return res+1;
	}
}
