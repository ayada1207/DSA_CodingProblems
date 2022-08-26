package Matrix;

public class SpacialMatrix {

	public static void printSpacialElement(int[][] mat) {
		
		int r=mat.length;
		int c=mat[0].length;
		int top=0;int right=c-1;int bottom =r-1;int left=0;
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				System.out.print(mat[top][i] + " ");
				
			}
			top++;
			
			for(int i=top;i<=bottom;i++) {
				System.out.print(mat[i][right] + " ");
				
			}
			right--;
			//if(top<=bottom) {
			for(int i=right;i>=left;i--) {
				System.out.print(mat[bottom][i] + " ");
				
			}
			bottom--;
			//}
			//if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(mat[i][left] + " ");
					
				}
				left++;
			//}	
			
		}
		
		
	}
}
