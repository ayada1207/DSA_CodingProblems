
public class PatternSearch {

	public static boolean pattern(String str,String pat) {
		
		 int k = pat.length();
	        String res="";
	        boolean ans=false;
	        for(int i=0;i<k;i++){
	            res = res+pat.charAt(i);  
	        }
	        int index=0;
	        for(int i=0;i<str.length();i++) {
	        	if(str.contains(res)) {
	        		ans= true;
	        	}
	        	else {
	        		ans= false;
	        	}
	        }
			return ans;
		
	}
}
