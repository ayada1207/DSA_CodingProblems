package string_Problems;

public class ReverseWordInString {

	public static void getReverse(String str,int n) {
		
	char[] s = str.toCharArray();
	StringBuilder sb = new StringBuilder();
	
	int start =0;
	for(int end=0;end<s.length;end++) {
		if(s[end]==' ') {
			reverse(s,start,end-1);
			start = end+1;
		}
	}
	reverse(s,start,n-1);
	reverse(s,0,n-1);
	for(int i=0;i<s.length;i++) {
		sb.append(s[i]);
	}
	System.out.println(sb.toString());
	}
	
	public static void reverse(char[] str,int low,int high) {
		while(low<=high) {
			char temp = str[low];
			str[low]=str[high];
			str[high]= temp;
			
			low++;
			high--;
		}
	}
}
