package MathematicsOperations;

public class FindNumberOfDigits {
	
	public static int findDigits(int n) {
		int count = 0;
		while(n != 0)
		{
			n= n/10;
			count++;
		}
		System.out.println(count);
		return count;
		
	}

}
