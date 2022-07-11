
public class RearrangeArray {

	// rearrange array such that first element should be max 2nd will minimum
	//3rd will be 2nd max the will be 2nd minimum and so on
	
	public static void rearrangeArray(int[] arr) {
		int n = arr.length;
		int low=0;int high=n-1;
		int temp[] = arr.clone();
		boolean flag = true;
		for(int i=0;i<n;i++) {
			if(flag) {
				arr[i]=temp[high];
				high--;
			}else {
				arr[i]=temp[low];
				low++;
			}
			flag=!flag;
		}
		System.out.println(arr);
	}

}
