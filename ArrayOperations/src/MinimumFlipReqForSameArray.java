
public class MinimumFlipReqForSameArray {

	//min flip req to make binary array same {1,1,0,0,0,1,1,1} = o/p: from 2-4
	
	// idea is that in a binary array there can be only 2 possibility 
	// 1: diff bw two can can be either xero or maximum it can be 1 only
	// so always choose 2 group to flip 
	public static void minFlip(int[] arr,int n) {
		
		for(int i=1;i<n;i++) {
			if(arr[i-1] != arr[i]) {
				if(arr[i] != arr[0]) {    // to check beganing  of flips
					System.out.print("from: " + i + " to ");
				}else {
					System.out.println(i-1);  // end of flip
				}
			}
		}
		if(arr[n-1] != arr[0]) {
			System.out.println(n-1);
		}
	}
}
