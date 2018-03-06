package hackerrank.jose.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_exercise {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int numArrays=sc.nextInt(); 
        List<ArrayList> listContainer = new ArrayList<>();
        for(int x = 1;x<=numArrays;x++)
        {
            createAndFillArray(sc,listContainer);
        }
        int queriesNumber=sc.nextInt(); 
        for (int y = 1;y<=queriesNumber;y++)
        {
            int xQuery = sc.nextInt();
            int yQuery = sc.nextInt();
            executeQuery(xQuery , yQuery, listContainer);
        }
        
        
    }
    
    public static void createAndFillArray(Scanner sc, List container)
    {
        int amountOfNumbers = sc.nextInt();
        List<Integer> arrayElement = new ArrayList<>();
        for(int x = 1;x<=amountOfNumbers;x++)
        {
            arrayElement.add(Integer.valueOf(sc.nextInt()));
        }
        container.add(arrayElement);
        
    }
    
    
    public static void executeQuery(Integer xQuery, Integer yQuery, List<ArrayList> container )
    {
        try{
           List<Integer> arrayElement =  (ArrayList<Integer>)container.get(xQuery-1); 
            System.out.println(arrayElement.get(yQuery-1));
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println("ERROR!");
        }
        
    }

}
