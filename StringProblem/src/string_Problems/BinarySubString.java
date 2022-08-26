package string_Problems;

public class BinarySubString {

	public static int subString(String str,int N) {
		char[] s = str.toCharArray();
		int count=0;
		for(int i=0;i<N;i++) {
			if(s[i]=='1') {
				for(int j=i+1;j<N;j++) {
					if(s[j]=='1') {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	 public static int binarySubstring(int N, String str)
	    {
	       char[] s = str.toCharArray();
			int count=0;
			for(int i=0;i<N;i++) {
				if(s[i]=='1') {
					count++;
				}
			}
			return count*(count-1)/2;
	    }
}
