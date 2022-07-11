import java.util.HashMap;
import java.util.Map;

public class SmallestMissingNumber {
	
	public static int findSmallest(int[] arr) {
		int n=arr.length;
		int res=0;
		Map<Integer,Integer> mp= new HashMap<>();
		for(int i=1;i<=n;i++) {
			mp.put(i, 0);
		}
		for(var ar:arr) {
			
				mp.put(ar,mp.getOrDefault(ar,0)+1);

		}
		
		for(var val:mp.entrySet()) {
			res=val.getValue();
			if(res==0) {
				return val.getKey();
			}
		}
		return n+1;
		
	}

}
