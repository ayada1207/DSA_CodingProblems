package sorting;

public class LomutoPatitionAlgorithm {

	public static int lomutoPartition(int[] arr, int l,int h) {
		 int pivot =arr[h];
		 int i=l-1;
		 for(int j=l;j<h;j++) {
			 if(arr[j]<pivot) {
				 i++;
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
		 int temp=pivot;
		 arr[h]=arr[i+1];
		 arr[i+1]=temp;
		 
		return i+1;
	}
}
