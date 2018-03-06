package hackerrank.jose.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_excercise {
	
	
	 public static void main(String []argh)
	   {
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String,Integer> phonebook = new HashMap<>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=Integer.valueOf(in.nextInt());
	         in.nextLine();
	          
	         phonebook.put(name,phone);
	      }
	      // System.out.println(phonebook);
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	          if (phonebook.get(s)!= null){
	              System.out.println(s+"="+phonebook.get(s));
	              
	          }else{
	              System.out.println("Not found");
	          }
	      }
	   }

}
