
public class LeftRotateArryBydPlaces {
	
	
	// Method 1: time theta(nd)
	// 			 Space: theta(1)				
	public static int[] rotateLeftByd(int[] arr, int d) {
		for(int i=0;i<d;i++) {
			LeftRotateByOne.leftRotateOne(arr);
		}
		return arr;
	}
	
	//Method 2:
	
	public static int[] rotateLeft2(int[] arr, int d) {
		int n = arr.length;
		ReverseArray.reverse(arr, 0, d-1);
		ReverseArray.reverse(arr, d, n-1);
		ReverseArray.reverse(arr, 0, n-1);
		return arr;
		
	}

}
