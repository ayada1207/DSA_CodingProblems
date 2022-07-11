
public class MaxCircularSubArray {
	 static int kandane(int[] arr,int n){
	        int maxEnd=arr[0];
	        int res=arr[0];
	        for(int i=1;i<n;i++){
	            maxEnd = Math.max(arr[i],maxEnd+arr[i]);
	            res=Math.max(maxEnd,res);
	        }
	        return res;
	    }
	    static int circularSubarraySum(int a[], int n) {
	        
	        int normal_max = kandane(a,n);
	        if(normal_max<0){return normal_max;}
	        int arr_sum=0;
	        for(int i=0;i<n;i++){
	            arr_sum+=a[i];
	            a[i] = -a[i];
	        }
	        int res=arr_sum+kandane(a,n);
	        return Math.max(res,normal_max);
	    }
}
