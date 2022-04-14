package MathematicsOperations;

public class PrimeFactors {

	public static void primeFactors(int n) {
		for(int i =2;i<n;i++) {
			if(PrimeNumber.isPrime1(i)) {
				int x=i;
				while(n%x==0) {
					System.out.println(i);
					x=x*i;
				}
			}
		}
	}
	
}
