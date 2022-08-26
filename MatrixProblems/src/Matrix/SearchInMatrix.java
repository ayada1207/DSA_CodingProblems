package Matrix;

public class SearchInMatrix {

	public static void searchElement(int[][] mat,int x) {
		int r=mat.length;
		int c=mat[0].length;
		boolean flag=false;
		int[] ans= new int[2];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(mat[i][j]==x) {
					flag = true;
					ans[0]=i;
					ans[1]=j;
					
					break;
				}
			}		
		}
		if(flag) {
			System.out.println("Found at " +ans[0] +","+ ans[1]);
		}else{
			System.out.println("Not Found");
		}
	}
	
	// Efficient solution
	
	public static void findElement(int[][] mat, int X) {
		int r=mat.length;
		int c=mat[0].length;
		int temp = c-1;
		int i=0;int j=c-1;
		while(i<r) {
		if(mat[i][j]==X) {
			System.out.println("Found At: "+ i +","+ j);
			return;
		}else if(mat[i][j]>X) {
			j--;
		}else {
			i++;
		}
		}
		System.out.println("Not Found");
	}
}
