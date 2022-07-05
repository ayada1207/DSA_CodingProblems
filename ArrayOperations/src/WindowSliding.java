import java.util.ArrayList;

public class WindowSliding {
	
	//Method 1: with O(n2) time
	public static int findSum(int[] arr,int k) {
		int res=0;
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				sum+=arr[j];
			}
			res=Math.max(sum, res);
		}
		return res;
	}
	
	//Method 2 with O(n) time
	public static int findSumE(int[] arr,int k) {
		int n=arr.length;
		 int max_sum=0;int sum=0;
		for(int i=0;i<k;i++) {
			sum+= arr[i];
		 max_sum = sum;
		}
		for(int i=k;i<n;i++) {
			sum+=(arr[i]-arr[i-k]);
			max_sum = Math.max(sum, max_sum);
		}
		return max_sum;
	}
	
public static void maximumAdjacent(int n, int arr[]){
        
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]){
                System.out.print(arr[i] + " ");
            }else{
                 System.out.print(arr[i+1] + " ");
            }
        }
        
    }
}
