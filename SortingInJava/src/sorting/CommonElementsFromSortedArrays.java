package sorting;

public class CommonElementsFromSortedArrays {

	public static void printCommon(int[] a,int[] b) {
		int n=a.length;int m= b.length;
		int i=0;int j=0;
		while(i<n && j<m) {
			if(i>0 && a[i]==a[i-1]) {
				continue; 
			}
			if(a[i]<b[j]) {
				System.out.println(a[i]);
				i++;
			}else if(a[i]>b[j]) {
				System.out.println(b[j]);
				j++;
			}else {
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
	
	}
}
