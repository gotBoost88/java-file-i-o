package exercises1;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a command line program that takes a Spanish word for a number "Uno" through "Diez" as an argument 
 * and returns the English language equivalent (i.e. "Uno" -> "One", "Dos" -> "Two", etc)  Program input 
 * should be case insensitive so "uno", "Uno", or "UNO" should all return "One".
 */
public class Spanish2English {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> englishEspanol = new HashMap<String, String>();
		englishEspanol.put("uno","One");
		englishEspanol.put("dos","Two");
		englishEspanol.put("tres","Three");
		englishEspanol.put("quatro","Four");
		englishEspanol.put("cinco","Five");
		englishEspanol.put("seis", "Six");
		englishEspanol.put("siete","Seven");
		englishEspanol.put("ocho","Eight");
		englishEspanol.put("nine","Nueve");
		englishEspanol.put("diez","Ten");
			
			for(String name : args) {
			System.out.println(englishEspanol.get(name.toLowerCase()));
			}
	}

}
