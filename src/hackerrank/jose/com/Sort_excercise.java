package hackerrank.jose.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sort_excercise {
	
	
		
		public static void main(String[] args){
		      Scanner in = new Scanner(System.in);
		      int testCases = Integer.parseInt(in.nextLine());
		      
		      List<Student> studentList = new ArrayList<Student>();
		      while(testCases>0){
		         int id = in.nextInt();
		         String fname = in.next();
		         double cgpa = in.nextDouble();
		         
		         Student st = new Student(id, fname, cgpa);
		         studentList.add(st);
		         
		         testCases--;
		      }
		      
		       Collections.sort(studentList, new CustomOrderComparator());
		       
		         for(Student st: studentList){
		         System.out.println(st.getFname());
		      }
		   }

}


class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}

	class CustomOrderComparator implements Comparator{
	    
	  public int compare(Object  one, Object two){
	      Student sOne = (Student) one;
	      Student stwo = (Student) two;
	      
	        if (sOne.getCgpa()>stwo.getCgpa())
	            return -1; 
	        else if (sOne.getCgpa()<stwo.getCgpa())
	            return 1; 
	        else
	            return comparebyFname( sOne, stwo);
	    }
	    
	    public int comparebyFname(Student one, Student two)
	    {
	        int comparition = one.getFname().compareTo(two.getFname());
	        //if (one.getFname().compareTo(two.getFname())== 1)
	        //    return 1; 
	        //else if (one.getFname().compareTo(two.getFname())== -1)
	        //    return 1; 
	        if (comparition != 0)
	            return comparition;                                       
	        else
	            return comparebyId( one,  two);
	    }
	    
	    public int comparebyId(Student one, Student two)
	    {
	        if (one.getId()>two.getId())
	            return 1; 
	        else 
	            return -1; 
	        
	    }
	    
	}
