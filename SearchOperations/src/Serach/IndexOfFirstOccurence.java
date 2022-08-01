package Serach;

public class IndexOfFirstOccurence {
	
	public static int getFirstOcc(int[] arr,int x) {
		int n= arr.length;
		int low=0;
		int high=n-1;
		int res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<x) {
				low=mid+1;
			}
			else if(arr[mid]>x) {
				high=mid-1;
			}
			else {
			res= mid;
			high=mid-1;
			}
		}
		return res;
	}

	public static int getLastOcc(int[] arr,int x) {
		int n= arr.length;
		int low=0;
		int high=n-1;
		int res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<x) {
				low=mid+1;
			}
			else if(arr[mid]>x) {
				high=mid-1;
			}
			else {
			res= mid;
			low=mid+1;
			}
		}
		return res;
	}

}
