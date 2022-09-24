package Stack;

public class MaxSubMatrixWithAllOnes {

	public static int getMaxSubMatwithAllOne(int mat[][]) {
		int c = mat[0].length;
		int r = mat.length;
		int res = MaximumAreaRectanglezfromHectogram.getMaxArea(mat[0],c );
		
		for(int i=1;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(mat[i][j]==1) {
					mat[i][j] += mat[i-1][j];
				}
			}
			res= Math.max(res, MaximumAreaRectanglezfromHectogram.getMaxArea(mat[i],c ));
		}
		return res;
	}
}
