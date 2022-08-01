package sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			int min_ind=i;
			for(int j=i+1;j<n;j++) {
				 if(arr[min_ind]>arr[j]) {		
					 int temp=arr[j];
					 arr[j]=arr[min_ind];
					 arr[min_ind]=temp;
					 min_ind=j;
				 }
			}
			
		}
		for(var a:arr) {
			System.out.println(a);
		}
	}
}
