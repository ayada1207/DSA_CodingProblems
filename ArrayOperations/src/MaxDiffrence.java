
public class MaxDiffrence {
	
	public static int findMaxDiff(int[] arr) {
		int res = arr[1]-arr[0];
		int minValue = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			res= (res > (arr[i]-minValue) ? res :arr[i]-minValue);
			minValue = minValue<arr[i] ? minValue : arr[i];
		}
		
		return res;
	}

}
