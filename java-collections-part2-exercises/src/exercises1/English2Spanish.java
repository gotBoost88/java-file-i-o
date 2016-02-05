package exercises1;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a command line program that takes an English word for a number "One" through "Ten" as an argument 
 * and returns the Spanish language equivalent (i.e. "One" -> "Uno", "Two" -> "Dos", etc)  Program input 
 * should be case insensitive so "one", "One", or "ONE" should all return "Uno".
 */
public class English2Spanish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> englishEspanol = new HashMap<String, String>();
		englishEspanol.put("one","Uno");
		englishEspanol.put("two","Dos");
		englishEspanol.put("three","Tres");
		englishEspanol.put("four","Quatro");
		englishEspanol.put("five","Cinco");
		englishEspanol.put("six", "Seis");
		englishEspanol.put("seven","Siete");
		englishEspanol.put("eight","Ocho");
		englishEspanol.put("nine","Nueve");
		englishEspanol.put("ten","Dies");
			
			for(String name : args) {
			System.out.println(englishEspanol.get(name.toLowerCase()));
			}
	}

}
