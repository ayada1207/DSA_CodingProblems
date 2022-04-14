package MathematicsOperations;

public class GCDofNumber {
	
	// basic idea of Ecludian algorith approach 
	public static int gcd1(int a,int b) {
		
		while(a!=b)
		{
			if(a>b)
			a= a-b;
			else b=b-a;
		}
		return a;
	}
	
	// optimize version of eludian algorithm 
	
	public static int gcd2(int a, int b) {
		
		if(b==0) {
			return a;
		}else 
			return gcd2(b,a%b);
		
	}

}
