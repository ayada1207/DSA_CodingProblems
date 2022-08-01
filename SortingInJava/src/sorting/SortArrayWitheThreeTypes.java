package sorting;

public class SortArrayWitheThreeTypes {

	
	// there are three most common question asked in this category 
	
	// 1) Sort an Array of 0's,1's and 2's 
	// I/p: {0,1,0,1,2,2,0} - > O/P: {0,0,0,1,1,2,2}
	
	// 2) Three way partition 
	// i/p: {2,1,2,20,10,20,1} pivot:2
	// O/P: {1,1,2,2,20,10,20}
	
	//3) Partition around a range
	//i/p: {10,5,6,3,20,9,40} range: [5,10]
	//o/p: {3,5,6,9,10,20,40}
	
	public static void sortArrayPrblm1(int[] arr,int n) {
		int l=0;int h=n-1;
		int mid=0;
		
		while(mid<=h) {
			if(arr[mid]==0) {
			int temp=arr[mid];
			arr[mid]=arr[l];
			arr[l]=temp;
			mid++;
			l++;
			}else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[h];
				arr[h]=temp;
				h--;
			}
		}
	}
	
	public static void prblem2(int[] arr, int n,int pivot) {
		int l=0;int h=n-1;
		int m=0;
		while(m<=h) {
			if(arr[m]<pivot) {
				int temp=arr[l];
				arr[l]=arr[m];
				arr[m]=temp;
				l++;
				m++;
			}else if(arr[m]==pivot) {
				m++;
				
			}else {
				int temp=arr[h];
				arr[h]=arr[m];
				arr[m]=temp;
				h--;
			}
		}	
	}
	
	public static void problem3(int[] arr,int n, int rangeLow, int rangeHigh) {
		int l=0;
		int h=n-1;
		int m=0;
		
		while(m<=h) {
			if(arr[m]<rangeLow) {
				int temp=arr[l];
				arr[l]=arr[m];
				arr[m]=temp;
				l++;m++;
			}else if(rangeLow<=arr[m] && arr[m]<=rangeHigh) {
				m++;
				
			}else {
				int temp=arr[h];
				arr[h]=arr[m];
				arr[m]=temp;
				h--;
			}
		}
	}
}
