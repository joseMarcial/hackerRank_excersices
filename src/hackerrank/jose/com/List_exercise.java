package hackerrank.jose.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_exercise {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner sc = new Scanner(System.in); 
	         int listSize = (Integer)sc.nextInt();
	        List<Integer> container = new ArrayList<>(listSize);
	        for (int x = 1 ; x<=listSize; x++ )
	        {
	            container.add(Integer.valueOf(sc.next()));
	            //System.out.println(Arrays.toString(container.toArray()));
	        }
	        int numberOfQuerys = sc.nextInt();
	        for (int y=1 ; y<=numberOfQuerys;y++ ){
	            String operation =sc.next();
	            if( operation.equals("Insert")){
	                int index = sc.nextInt();
	                container.add(index, Integer.valueOf(sc.next()));
	            }else if (operation.equals("Delete")){
	                container.remove(sc.nextInt());
	            }
	        }
	        
	        StringBuffer buffer = new StringBuffer();
	        for (Integer currentInt : container){
	            buffer.append(currentInt);
	            buffer.append(" ");
	        }
	        System.out.println(buffer);
	    }

}
