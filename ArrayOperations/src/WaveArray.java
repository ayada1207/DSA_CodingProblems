
public class WaveArray {
	
	public static int[] getWaveArray(int[] arr, int n) {
		for(int i=0;i<n-1;i++) {
			
			if(i%2==0) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}else {
				continue;
			}
		}
		return arr;
		
	}

}
