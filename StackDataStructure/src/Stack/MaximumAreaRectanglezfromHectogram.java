package Stack;

import java.util.Stack;

public class MaximumAreaRectanglezfromHectogram {
	
	static int findMaxRect(int[] arr,int n) {
		 int res=0;
		 for(int i=0;i<n;i++) {
			 int curr =arr[i];
			 for(int j=i+1;j<n;j++) {
				 if(arr[j]>=arr[i]) {
					 curr+=arr[i];
				 }else {
					 break;
				 }
			 }
			 for(int j=i-1;j>=0;j--) {
				 if(arr[j]>=arr[i]) {
					 curr+=arr[i];
				 }else {
					 break;
				 }
			 }
			 res =Math.max(curr, res);
		 }
		 return res;
	}
	
	// Efficient solution using Stack O(n)
	public static int getMaxArea(int[] arr,int n) {
		int res=0;
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<n;i++) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				int tp = s.pop();
				int curr = arr[tp]*(s.isEmpty()?i:(i-s.peek()-1));
				res = Math.max(res, curr);
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			int tp = s.pop();
			int curr= arr[tp] * (s.isEmpty() ? n : (n-s.peek()-1));
			res = Math.max(res, curr);
		}
		return res;
	}

}
