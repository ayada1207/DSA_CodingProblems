package Stack;

import java.util.Stack;

public class RemoveDuplicatePairs {

	public static String removePair(String str)
    {
        Stack<Character> s = new Stack<>();
        s.push(str.charAt(0));
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<str.length();i++){
            char c = str.charAt(i);
            if(!s.isEmpty() && s.peek()==c){
                s.pop();
            }else{
                s.push(c);
            }
        }
        while(!s.isEmpty()){
            sb.append(s.peek());
            s.pop();
        }
        sb.reverse();
        return sb.toString();
    }
}
