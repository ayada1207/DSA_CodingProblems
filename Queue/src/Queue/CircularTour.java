package Queue;

public class CircularTour {

	public static int getFirstPoint(int[] petrol,int[] distance) {
		int start =0;int balnce=0;int deficit =0;
		
		for(int i=0;i<petrol.length;i++) {
			balnce += petrol[i]-distance[i];
			if(balnce<0) {
				deficit += balnce;
				balnce=0;
				start=i+1;
			}
			
		}
		if(deficit+balnce>=0) {
			return start;
		}
		return -1;
		
	}
}
