package string_Problems;

import java.util.Arrays;

public class CaseSpecificSorting {

	public static String caseSpecificSOrting(String s,int n) {
		
		StringBuilder sb = new StringBuilder();
		int u=0;int l=0;
		for(int i=0;i<n;i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				l++;
			}else {
				u++;
			}
		}
		char[] charL = new char[l];
		char[] charU = new char[u];
		int lk=0; int uk=0;
		for(int i=0;i<n;i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				charL[lk]=s.charAt(i);
				lk++;
			}else {
				charU[uk]=s.charAt(i);
				uk++;
			}
		
		}
	Arrays.sort(charL);Arrays.sort(charU);
		lk=0;uk=0;
		for(int i=0;i<n;i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				sb.append(charL[lk]);
				lk++;
			}else {
				sb.append(charU[uk]);
				uk++;
			}
		}
		return sb.toString();
	}
}
