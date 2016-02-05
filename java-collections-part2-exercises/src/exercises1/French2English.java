package exercises1;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a command line program that takes a French word for a number "Une" through "Dix" as an argument 
 * and returns the English language equivalent (i.e. "Une" -> "One", "Deux" -> "Two", etc)  Program input 
 * should be case insensitive so "une", "Une", or "UNE" should all return "One".
 */
public class French2English {

	public static void main(String[] args) {
		
		Map<String, String> frenchEnglish = new HashMap<String, String>();
		frenchEnglish.put("une","One");
		frenchEnglish.put("deux","Two");
		frenchEnglish.put("trois","Three");
		frenchEnglish.put("quatre","Four");
		frenchEnglish.put("sinq","Five");
		frenchEnglish.put("six", "Six");
		frenchEnglish.put("sept","Seven");
		frenchEnglish.put("huit","Eight");
		frenchEnglish.put("neuf","Nine");
		frenchEnglish.put("dix","Ten");
		for(String name : args) {
			System.out.println(frenchEnglish.get(name.toLowerCase()));
			}
	}
}
