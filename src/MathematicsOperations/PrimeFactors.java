package MathematicsOperations;

public class PrimeFactors {

	public static void primeFactors(int n) {
		if(n<=1) return;
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
	
	//Efficient approach
	
	public static void primeFactors1(int n) {
		
		if(n<=1) return;
		while(n%2==0) {
			System.out.println(2);
			n/=2;	
		}
		while(n%3==0) {
			System.out.println(3);
			n/=3;	
		}
		for(int i=5;i*i<=n;i=+6) {
			while(n%i==0) {
				System.out.println(i);
				n/=i;	
			}
			while(n%(i+2)==0) {
				System.out.println((i+2));
				n/=(i+2);	
			}
		}
		if(n>3)
			System.out.println(n);
	}
	
}
