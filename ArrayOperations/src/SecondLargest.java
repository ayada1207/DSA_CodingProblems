
public class SecondLargest {
	
	// Naive approach Space complex O(n2)
	public static int secondLarge(int[] arr) {
		int n = arr.length;
		int largest = largestElement.largest(arr);
		int res =-1;
		
		for(int i=0;i<n ;i++) {
			if((arr[largest]!=arr[i])) {
				
				if(res==-1)
					res=i;
				else if(arr[res]<arr[i])
					res=i;
			}
			
			
		}
		return res;
	}
	
	
	// Efficient approach with Space complex O(n)
	
	public static int secondLargestEl(int arr[]) {
		int largest=0;
		int res=-1;
		int n = arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[largest]) {
				largest =i;
				res=largest;
			}
			else if(arr[i]!=arr[largest]) {
				if(res==-1 || arr[i]>arr[res])
					res=i;
			}
		}
		return res;
	}

}
