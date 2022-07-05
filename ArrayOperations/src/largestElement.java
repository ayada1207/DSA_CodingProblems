
public class largestElement {
	
	public static int largest(int[] arr) {
		
		int n = arr.length;
		int max=0; 
		
		for(int i=1;i<n;i++) {
			
			if(arr[max]<arr[i])
				max=i;
		}
		return max;
	}

}
