package string_Problems;

public class PatternSearch {

	
	// Naive Approach
	public static boolean pattern( String pattern,String text) {
		
		int m = text.length();
		int n = pattern.length();
		
		for(int i=0;i<=m-n;i++) {
			
			for(int j=0;j<n;j++) {
				if(pattern.charAt(j)!=text.charAt(i+j))
					break;
				if(j+1==n)
					return true;
			}
			
		}
		return false;
	}
	
	// Efficient Approach
	
	public static void patternSearch(String text,String patt) {
		
	}
}
