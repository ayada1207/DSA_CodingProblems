package Matrix;

public class MatrixBoundaryElement {

	public static void printBoundaryElement(int[][] mat) {
		int m=mat.length;
		int n=mat[0].length;
		int sum=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
			{
				if(j>0 && i>0 && i<n-1&& j<n-1) {
					System.out.print("   ");
				}else {
					System.out.print(mat[i][j] + " ");
					sum+=mat[i][j];
				}
				
			}
			System.out.println("  ");
			
			}
		System.out.println("Sum of Boundary Element is " + sum);
	}
}
