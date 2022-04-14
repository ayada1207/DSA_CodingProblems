package MathematicsOperations;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev= 0;
		while(temp !=0) {
			int last = temp%10; //1
			temp = temp/10;// 0
			rev = rev*10 + last;   // 12
			  // 1
		}
		return (rev==n);
	}

}
