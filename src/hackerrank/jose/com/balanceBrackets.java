package hackerrank.jose.com;

import java.util.Scanner;
import java.util.Stack;

public class balanceBrackets {
	
	 static String isBalanced(String s) {
	        Stack<Character> container = new Stack<>();
	        // Complete this function
	        String result = null;
	        if (s.length() % 2 !=0)
	        {
	           result= "NO";
	        }else{
	            for(int x=0; x<s.length();x++)
	            {
	                if (s.charAt(x)=='(' || s.charAt(x)=='{' || s.charAt(x)=='[')
	                {
	                    
	                    container.push(s.charAt(x));
	                }
	                else if (!container.empty()){ 
	                    
	                    Character charAtPeek = container.peek();
	                    if ( (charAtPeek == '(' && s.charAt(x)==')') ||
	                         (charAtPeek == '{' && s.charAt(x)=='}') ||
	                         (charAtPeek == '[' && s.charAt(x)==']')
	                        )
	                        {   
	                            container.pop();
	                        }else{
	                            result="NO";
	                            break;
	                        }
	                }
	                else{
	                    result="NO";
	                    break;
	                }
	                
	            }
	            if (result == null && container.empty())
	                result="YES";
	            else
	            result="NO";
	    
	            
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            String s = in.next();
	            String result = isBalanced(s);
	            System.out.println(result);
	        }
	        in.close();
	    }

}
