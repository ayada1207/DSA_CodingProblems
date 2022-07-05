import java.util.ArrayList;

public class LeadersArray {

	//Method 1: with theta(n2)time
	public static void leaders(int[] arr){
		int n = arr.length;
		
		int currLeader = arr[n-1];
		System.out.println(currLeader);
		
		for(int j=n-2;j>=0;j--) {
			if(arr[j]>currLeader) {
				currLeader = arr[j];
				System.out.println(currLeader);
			}
		}
		
		

		
	}
}
