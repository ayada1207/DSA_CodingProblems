package search;

public class SqaureRoot {

	public static int sqrtFunction(int x) {
		int low=1;int high=x;
		int ans=-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			int sqr = mid*mid;
			if(sqr==x) {
				return mid;
			}else if(sqr>x) {
				high=mid-1;
			}
			else {
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}
}
