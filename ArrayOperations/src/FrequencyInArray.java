 
public class FrequencyInArray {
	
	public static void findFreq(int[] arr) {
	int i=1;int freq =1;
	int n= arr.length;
		
	while(i<n) {
		while(i<n && arr[i]==arr[i-1]) {
			freq++;
			i++;
		}
		System.out.println("Optput is--"+arr[i-1]+"-"+ freq);
		freq=1;
		i++;
	}
	if(n==1 || (arr[n-1] !=arr[n-2])) {
		System.out.println("Optput is--"+ arr[n-1] + "-"+ freq);
	}
	}

}
