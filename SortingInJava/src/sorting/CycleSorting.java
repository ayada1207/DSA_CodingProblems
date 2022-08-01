package sorting;


// Cycle sort is useful where memory writes are costly 
//to minimize memory writes cycle sort is important to use

// Also useful to solve question like: Find minimum Swaps required to Sort array

public class CycleSorting {

	// This Method is for distinct element Array not for Duplicate element array
	
	public static void cycleSortDistinctElement(int[] arr,int n) {
		
		for(int cs=0;cs<n-1;cs++) {
			int item = arr[cs];
			int pos =cs;
			for(int i=cs+1;i<n;i++) {
				if(arr[i]<item) {
					pos++;
				}
			}
			int temp=item;
			item =arr[pos];
			arr[pos]=temp;
			
			// To Place all element at right place
			while(cs!=pos) {
				 pos=cs;
				 for(int i=cs+1;i<n;i++) {
						if(arr[i]<item) {
							pos++;
						}
					}
				    temp=item;
					item =arr[pos];
					arr[pos]=temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+ " ");
		}
	}
	
}
