
public class EqulibiriumPoint {
	
	public static int findEqbPoint(int[] arr) {
		long sum=0;long left=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			left += arr[i];
			long right=0;
			if(i!=arr.length-1) {
				right=sum-left-arr[i+1];
			}
			
			if(left==right) {
				return i+2;
			}
		}
		return -1;
	}

}
