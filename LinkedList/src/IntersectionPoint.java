import java.util.HashSet;

public class IntersectionPoint {

	static int intersectionPoint(Node a,Node b) {
		  Node c1=a;Node c2=b;
	        int count1=0; int count2=0;
	        while(c1!=null){
	            count1++;
	            c1=c1.next;
	            
	        }
	          while(c2!=null){
	            count2++;
	            c2=c2.next;
	            
	        }
	        int sub =Math.abs(count1-count2);
	        c1=a;c2=b;
	        if(count1>count2){
	            for(int i=1;i<=sub;i++){
	                c1=c1.next;
	            }
	            return c1.next.data;
	        }
	          if(count1<count2){
	            for(int i=1;i<=sub;i++){
	                c2=c2.next;
	            }
	            return c2.next.data;
	        }
	        return -1;
	}
}
