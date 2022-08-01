package sorting;

import java.util.Arrays;
import java.util.Comparator;

class Intervals{
	int start;
	int end;
	
	Intervals(int start,int end){
		this.start=start;
		this.end=end;
	}
}

public class MergeOverlappingIntervals {

	public static void mergeIntervals(Intervals arr[],int n) {
		int res=0;
		 Arrays.sort(arr,new Comparator<Intervals>(){
	            public int compare(Intervals i1,Intervals i2)
	            {
	                return i1.start - i2.start;
	            }
	        });
		for(int i=1;i<n;i++) {
			if(arr[res].end >arr[i].start) {
				arr[res].start= Math.min(arr[res].start, arr[i].start);
				arr[res].end= Math.max(arr[res].end , arr[i].end);
			}else {
				res++;
				arr[res]=arr[i];
			}
		}
		for(int i=0;i<=res;i++) {
			System.out.println(arr[i].start  +  "" + arr[i].end);
		}
		
	}
}
