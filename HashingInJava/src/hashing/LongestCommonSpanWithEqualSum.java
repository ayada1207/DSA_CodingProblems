package hashing;

public class LongestCommonSpanWithEqualSum {

	public static int longestCommonSpan(int[] a,int[] b,int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			int sum1=0;int sum2=0;
			for(int j=i;j<n;j++) {
				sum1+=a[j];
				sum2+=b[j];
				
				if(sum1==sum2) {
					res=Math.max(res, j-1+1);
				}
			}
		}
		
		return res;
		
	}
}
