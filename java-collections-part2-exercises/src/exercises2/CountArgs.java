package exercises2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write an application which accepts an unlimited number of integer values from the command line, count of the number of times each value is found in the list, and then display the values and their count. (Hint: Think Map and Wrappers)
 * 
 * Example:

   $ java exercises2.CountArgs 1 99 43 2 55 78 99 2345 438 2 99 107
   1 : 1
   99 : 3
   43 : 1
   2 : 2
   55 : 1
   78 : 1
   2345 : 1
   438 : 1
   107 : 1
 
   $ java exercises2.CountArgs red yellow green yellow blue green purple
   red : 1
   yellow : 2
   green : 2 
   blue : 1 
   purple : 1
 
   $ java exercises2.CountArgs jingle bells jingle bells jingle all the way
   jingle : 3
   bells : 2 
   all : 1 
   the : 1 
   way : 1
   
 *
 */

/**
public class CountArgs {
	// ps im sorry
	private class Node
	{
		int num = 0;
		private Node(int i)
		{
		num = i;
		}
	}
		
	
	public CountArgs(String[] args)
	{
    Map<String, Node> countTheThings = new HashMap<String, Node>();
		
		for(String name : args) {
			if(countTheThings.containsKey(name))
			countTheThings.get(name).num++;
			else 
				countTheThings.put(name, new Node (1));
				//countTheThings.keySet().toArray();
				
				// Your code goes here
		}
		
		String[] newArray = countTheThings.keySet().toArray( new String[0]);
			for(String name : newArray)
			{
				System.out.println(name + " " + countTheThings.get(name).num);	
			}
	}

	public static void main(String[] args) {
		new CountArgs(args);
		
	}
}
*/



public class CountArgs {
	

	public static void main(String[] args) {
		
		Map<String, Integer> countTheThings = new HashMap<String, Integer>();
		
		for(String name : args) {
			if(countTheThings.containsKey(name))
			countTheThings.put(name, new Integer(countTheThings.remove(name).intValue ()+ 1));
			else 
				countTheThings.put(name, new Integer (1));
				//countTheThings.keySet().toArray();
				
				// Your code goes here
		}
		
		String[] newArray = countTheThings.keySet().toArray( new String[0]);
			for(String name : newArray)
			{
				System.out.println(name + " " +countTheThings.get(name));	
			}
			
		
	}
}
