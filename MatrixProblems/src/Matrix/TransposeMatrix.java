package Matrix;

public class TransposeMatrix {

	public static void transposeAndRotateBy90ACW(int[][] mat) {
		int m=mat.length;
		int n=mat[0].length;
		
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
	   for(int i=0;i<n;i++) {
		   int l=0;int h=m-1;
		   while(l<h) {
			   int temp=mat[l][i];
				mat[l][i]=mat[h][i];
				mat[h][i]=temp;
				l++;
				h--;
		   }
	   }
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
