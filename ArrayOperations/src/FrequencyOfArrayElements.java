

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
	
	public static void frequencyCount(int[] arr, int N, int P) {
		
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=1;i<=N;i++) {
			mp.put(i, 0);
		}
		
		for(var a: arr) {
			if(a<=N) {
				mp.put(a,mp.getOrDefault(a,0)+1);
			}
		}
		 int i=0;
	        for(Map.Entry<Integer,Integer> m : mp.entrySet()){
	            arr[i] = (int)m.getValue();
	            i++;
	        }
	
	}

}
