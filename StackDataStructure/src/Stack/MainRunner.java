package Stack;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {

	public static void main(String[] args) {
		String s= "a+b/c-d*e";
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(396285104);
		arr.add(573261094);
		arr.add(759641832);
		arr.add(819230764);
		arr.add(364801279);
		int[] ar = {10,20,30,50,10,70,30};
		int mat[][] = new int[][]
				{{1, 0, 0, 1,1},
			{0, 0, 0, 1,1},
			{1, 1, 1, 1,1},
			{0, 1, 1, 1,1}};
		MaxOfMinWindowSizeOfArray.maxOfMinWindowSize(ar,7);
	}

}
