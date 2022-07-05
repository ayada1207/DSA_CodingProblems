
public class MaximumConsicutiveOnes {
	
	public static int maximumOnes(int[] arr) {
		
		int curr =0;
		int res=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				curr =0;		
			}else {
				curr++;
				res =Math.max(res, curr);
			}
		}
		return res;
		
	}

}
