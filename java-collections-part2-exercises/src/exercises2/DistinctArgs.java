package exercises2;

import java.util.HashSet;
import java.util.Set;

/** 
 * Write an application which accepts an unlimited number of command line arguments and displays only unique values. 
 * In other words, no value is to be displayed more than once. (Hint: Think Set)
 * 
 * Example:
   
   $ java exercises2.DistinctArgs 1 99 43 2 55 78 99 2345 438 2 99 107
   1 99 43 2 55 78 2345 438 107
   
   $ java exercises2.DistinctArgs red yellow green yellow blue green purple
   red yellow green blue purple
   
   $ java exercises2.DistinctArgs jingle bells jingle bells jingle all the way
   jingle bells all the way
   
 *
 */
public class DistinctArgs {

	public static void main(String[] args) {
		
		// Your code goes here
		Set<String> showAllTheThings = new HashSet<String>();
			for(String name : args) {
			//showAllTheThings.add(" ");
				if(!showAllTheThings.contains(name)){
					//showAllTheThings.remove(args);
				System.out.println(name);
				showAllTheThings.add(name);
				}
				
			}
	}

}
