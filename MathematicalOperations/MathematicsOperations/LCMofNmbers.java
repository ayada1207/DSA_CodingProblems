package MathematicsOperations;

public class LCMofNmbers {

	// formula a*b = gcd(a,b)*lcm(a,b)
	
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		else return gcd(b,a%b);
	}
	
	public static int lcm(int a,int b) {
		return (a*b)/gcd(a, b);
	}
}
