

public class ReverseArray {

	public static int[] reverse(int[] arr, int low, int high) {
		 low=0;
		 high = arr.length-1;
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high]= temp;
			low++;
			high--;
		}
		return arr;
	}
}
