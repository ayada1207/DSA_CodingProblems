
public class ImmediateSmallerElement {

	public static void smallerElement(int[] arr,int N) {
			if(N<2) return;
        
        
        int[] temp=new int[N];
        temp[N-1]=-1;
        for(int i=N-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                temp[i] = (arr[i+1]);
            }
            
            else{
                temp[i]=-1;
        }
        }
        
        for(int i=0;i<N;i++) {
        	System.out.println(temp[i]);
        }
	}
}
