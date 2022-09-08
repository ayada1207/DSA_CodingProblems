package hashing;

import java.util.Map;

public class WinnerOfElections {

	public static String[] winner(String[] arr, int n) {
		Map<String,Integer> map = new java.util.HashMap<String, Integer>();
		String[] ans= new String[2];
		for(int i=0;i<n;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		
		int max=0;
		for(Map.Entry<String, Integer> m: map.entrySet()) {
			if(max<m.getValue()) {
				ans[0]=m.getKey();
				ans[1]=String.valueOf(m.getValue());
				max = m.getValue();
			}
			if(max==m.getValue()) {
				if(ans[0].compareTo(m.getKey())>0)
					ans[0]=m.getKey();
			}
		}
		System.out.println(ans[0] + "  " +ans[1]);
		return ans;
	}
}
