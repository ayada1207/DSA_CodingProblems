package string_Problems;

public class isSubSeqenceOfString {

	public static boolean isSubString(String s1,String s2,int m,int n) {
		
		int j=0;
		for(int i=0;i<m;i++) {
			if(s1.charAt(i)==s2.charAt(j))
				j++;	
		}
		return (j==n);
		
	}
}
