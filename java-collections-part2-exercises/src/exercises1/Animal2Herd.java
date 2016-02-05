package exercises1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Write a command line program that takes the name of an animal as an argument 
 * and returns the name of a group of that animal (e.g. "Elephant" -> "Herd", 
 * "Rhino" - "Crash").  Program input should be case insensitive so "elephant", 
 * "Elephant", and "ELEPHANT" should all return "herd".
 * 
 * Rhino -> Crash
 * Giraffe -> Tower
 * Elephant -> Herd
 * Lion -> Pride
 * Crow -> Murder
 * Pigeon -> Kit
 * Flamingo -> Pat
 * Deer -> Herd
 * Dog -> Pack
 * Crocodile -> Float
 *
 */
public class Animal2Herd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> rawrAnimals = new HashMap<String, String>();
			rawrAnimals.put("rhino","Crash");
			rawrAnimals.put("giraffe","Tower");
			rawrAnimals.put("elephant","Herd");
			rawrAnimals.put("lion","Pride");
			rawrAnimals.put("crow","Murder");
			rawrAnimals.put("pigeon", "Kit");
			rawrAnimals.put("flamingo","Pat");
			rawrAnimals.put("deer","Herd");
			rawrAnimals.put("dog","Pack");
			rawrAnimals.put("crocodile","Float");
			//Set<String> keys = rawrAnimals.keySet();
				for(String name : args) {
				System.out.println(rawrAnimals.get(name.toLowerCase()));
				}
	}

}
