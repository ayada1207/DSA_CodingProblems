package string_Problems;

import java.util.HashSet;
import java.util.Set;

public class Team {
	public static String getMatches(String msg, int k){
		
		if(msg.length()<=k)return msg;
		String[] str = msg.split(" ");
		StringBuilder sb = new StringBuilder();
		StringBuilder res = new StringBuilder();
		int i=0;
		while(i<=k) {
			sb.append(msg.charAt(i));
			i++;
		}
		String[] sbr = sb.toString().split(" ");
		int j=0;int m=0;int temp=0;
		while(j<sbr.length && m<str.length) {
			if(sbr[j].equals(str[m])) {
				m++;
				j++;
			}else {
			 
			break;
			}
		}
		temp =j;
		for(int n=0;n<temp;n++) {
			res.append(sbr[n]);
			res.append(' ');
		}
		return res.toString().trim();
		}
	}
