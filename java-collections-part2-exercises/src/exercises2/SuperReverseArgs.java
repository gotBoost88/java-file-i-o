package exercises2;

import java.util.Stack;

/**
 * Write an application which accepts an unlimited number of command line arguments, reverses the characters of each argument, 
 * and displays them in the reverse of the order they were passed in. One obvious solution is to simply loop through the 
 * command line arguments in reserve order, but see if you can come up with an alternative. (Hint: Think LIFO (i.e. Stack))
 * 
 * Example:

   $ java exercises2.SuperReverseArgs 1 99 43 2 55 78 99 2345 438 2 99 107
   701 99 2 834 5432 99 87 55 2 34 99 1
   
   $ java exercises2.SuperReverseArgs red yellow green yellow blue green purple
   elprup neerg eulb wolley neerg wolley der
   
   $ java exercises2.SuperReverseArgs jingle bells jingle bells jingle all the way
   yaw eht lla elgnij slleb elgnij slleb elgnij
   
 *
 */
public class SuperReverseArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Stack <String> reverseArgs = new Stack <String> ();
					
				for(String name : args) {
					String s = "";
					char[] n = name.toCharArray();
					for(int i = name.length()- 1; i >= 0; i--)
					{
						s+= n[i];
					}
					reverseArgs.push(s);
				}
				//Stack <Char> reverseOfTheArgs = new Stack <Char> ();	
				while(!reverseArgs.isEmpty()) {
					
					
				System.out.println(reverseArgs.pop());
				}
			
	}

}
