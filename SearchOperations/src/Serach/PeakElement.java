package Serach;

public class PeakElement {

	public static void findPeak(int[] arr,int n) {
		if(n==1) {
			System.out.println(arr[0]);
			return;
		}
		for(int i=1;i<n-1;i++) {
			if(arr[0]>arr[i] && i==1) {
				System.out.println(arr[0]);
			}
			else if(arr[i]>arr[i+1] && arr[i]>arr[i-1]) {
				System.out.println(arr[i]);
			}
			if(arr[n-1]>arr[i] && i==n-2) {
				System.out.println(arr[n-1]);
			}
			
		}
	}
}
