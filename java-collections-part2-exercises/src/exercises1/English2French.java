package exercises1;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a command line program that takes an English word for a number "One" through "Ten" as an argument 
 * and returns the French language equivalent (i.e. "One" -> "Une", "Two" -> "Deux", etc)  Program input 
 * should be case insensitive so "one", "One", or "ONE" should all return "Une".
 */
public class English2French {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> englishFrench = new HashMap<String, String>();
		englishFrench.put("one","Une");
		englishFrench.put("two","Deux");
		englishFrench.put("three","Trois");
		englishFrench.put("four","Quatre");
		englishFrench.put("five","Sinq");
		englishFrench.put("six", "Six");
		englishFrench.put("seven","Sept");
		englishFrench.put("eight","Huit");
		englishFrench.put("nine","Neuf");
		englishFrench.put("ten","Dix");
			
			//Set<String> keys = countryCapitals.keySet();
			for(String name : args) {
			System.out.println(englishFrench.get(name.toLowerCase()));
	}

	}
}
