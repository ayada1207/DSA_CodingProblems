package sorting;

public class SegregateDiffTypeElement {

	public static void segregateElmentPosNeg(int[] arr,int n) {
		int l=0;
		int h=n-1;
		int mid=(l+h)/2;
		
		int i =l-1;
		for(int j=0;j<n;j++) {
			if(i>0 && arr[i]==arr[i-1] ) {
				continue;
			}
			if(arr[j]<0) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			
		}
	}
	
	public static void segregateElmentEvenOdd(int[] arr,int n) {
		int l=0;
		int h=n-1;
		
		int i =l-1;
		for(int j=0;j<n;j++) {
			if(i>0 && arr[i]==arr[i-1] ) {
				continue;
			}
			if(arr[j]%2==0) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			
		}
	}
}
