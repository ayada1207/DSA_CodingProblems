package MathematicsOperations;

public class FactorialOfNumber {

	public static long factorial(long n) {
		long result = 1;
		while(n!=0) {
			result = result*n;
			n= n-1;
		}
		System.out.println(result);
		return result;
	}
}
