package exercises2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

/**
 * Write an application which accepts an unlimited number of command line arguments and displays them in the reverse of the order 
 * they were passed in. One obvious solution is to simply loop through the command line arguments in reserve order, but see if 
 * you can come up with an alternative. (Hint: Think LIFO (i.e. Stack))
 * 
 * Example:

   $ java exercises2.ReverseArgs 1 99 43 2 55 78 99 2345 438 2 99 107
   107 99 2 438 2345 99 78 55 2 43 99 1
   
   $ java exercises2.ReverseArgs red yellow green yellow blue green purple
   purple green blue yellow green yellow red
   
   $ java exercises2.ReverseArgs jingle bells jingle bells jingle all the way
   way the all jingle bells jingle bells jingle
   
 *
 */
public class ReverseArgs {

	public static void main(String[] args) {
		
		Stack <String> reverseArgs = new Stack <String> ();
			
		for(String name : args) {
			reverseArgs.push(name);
		}
			while(!reverseArgs.isEmpty())
			
			
		System.out.println(reverseArgs.pop());
		}
	}

		// Your code goes here
			
			//Deque <String> reverseArgs = new ArrayDeque <String> ();
			//Iterator <String> it = new <String> descendingIterator();
			
				//reverseArgs.addFirst(name);
				//System.out.println(reverseArgs);
			
	

