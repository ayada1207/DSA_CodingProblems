import java.util.ArrayList;

public class SubarrayWithGivenSum {
	
	public static ArrayList<Integer> findPosition(int[] arr,int n,int s){
		
		int index=0; int sum=0;int count=0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=index;i<n;i++) {
			sum+=arr[i];
		if(sum==s) {
			al.add(index+1);
			al.add(i+1);
			count++;
			break;
		}
		if(sum>s) {
			i = index++;
			sum=0;
		}
		}
		if(count!=0) {
			return al;
		}else {
			al.add(-1);
			return al;
		}
		
	}

}
