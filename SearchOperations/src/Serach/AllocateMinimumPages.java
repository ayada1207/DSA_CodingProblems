package Serach;

public class AllocateMinimumPages {
	
	public static int findmaximumMinimumPages(int[] arr,int n, int k) {
		
		int max = 0;
		int sum=0;
		int res=0;
		for(int i=0;i<n;i++) {
			max = Math.max(max, arr[i]);
			sum+=arr[i];
		}
		int low=max;
		int high = sum;
		while(low<=high) {
			int mid = (low + high)/2;
			if(isFesible(arr, n, mid, k)) {
				res = mid;
				high=mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return res;
	}
	
	public static boolean isFesible(int[] arr,int n,int ans,int k) {
		int sum=0;
		int req=1;
		for(int i=0;i<n;i++) {
			if(sum+arr[i]>0) {
				req++;
				sum=arr[i];
			}else {
				sum+=arr[i];
			}
		}
		return (req<=k);
	}

}
