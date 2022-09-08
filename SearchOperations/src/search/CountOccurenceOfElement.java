package search;

public class CountOccurenceOfElement {

	public static int findCount(int[] arr,int x) {
		int res =0;
		int first = IndexOfFirstOccurence.getFirstOcc(arr, x);
		int last = IndexOfFirstOccurence.getLastOcc(arr, x);
		if(first==-1) {
			res= 0;
		}else {
			res=last-first+1;
		}
		return res;
	}
}
