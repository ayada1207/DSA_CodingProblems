
public class TrappingWater {
	
	public static int getWater(int[] arr) {
		
		int res =0;
		for(int i=1;i<arr.length-1;i++) {
			int lmax=arr[i];
			for(int j=0;j<i;j++) {
				lmax=(lmax > arr[j]) ? lmax :arr[j];
			}
			int rmax = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				rmax=(rmax > arr[j]) ? rmax :arr[j];
			}
			
			res += Math.min(lmax, rmax)-arr[i];
		}
		return res;
		
		
	}

}
