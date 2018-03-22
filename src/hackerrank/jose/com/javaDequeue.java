package hackerrank.jose.com;
import java.util.*;

public class javaDequeue {
	
	
//	input :
//		
//		6 3
//	5 3 5 2 3 2
	     
	        public static void main(String[] args) {
	            Scanner in = new Scanner(System.in);
	            Deque deque = new ArrayDeque<>();
	           
	            int n = in.nextInt();
	            int m = in.nextInt();
	            int subarrayCount=0;
	            int maxUniqueNumber=0;
	            
	            

	            for (int i = 0; i < n; i++) {
	                subarrayCount++;
	                int num = in.nextInt();
	                
	                deque.add(num);
	                if(subarrayCount==m){
	                    Set<Integer> uniquesSet = new HashSet<>(deque);
	                    maxUniqueNumber=uniquesSet.size()>maxUniqueNumber?uniquesSet.size():maxUniqueNumber;
	                 
	                    subarrayCount--;
	                    deque.removeFirst();
	                    
	                }
	               
	            }
	            System.out.println(maxUniqueNumber);
	        }
	    }


