import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Exercises {

	/* PROBLEM 1 - array2List
	 * 
	 * Given an array of Strings, return an ArrayList containing the same
	 * Strings in the same order 
	 * 
	 * Examples:
	 * 
	 * array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 * array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 * array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 * 
	 */
	public static List<String> array2List(String[] stringArray) {
		List<String> stringList = new ArrayList<>();
		
		for(int i = 0; i < stringArray.length; i++) {
			stringList.add(stringArray[i]);
		}
		
		return stringList;
	}
	
	/* PROBLEM 2 - list2Array
	 * 
	 * Given a list of Strings, return an array containing the same
	 * Strings in the same order 
	 * 
	 * Examples:
	 * 
	 * list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 * list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 * list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public static String[] list2Array(List<String> stringList) {
		return null;
	}
	
	/* PROBLEM 3 - no4LetterWords
	 * 
	 * Given an array of Strings, return an ArrayList containing the same
	 * Strings in the same order except for any words that contain exactly 
	 * 4 characters.
	 * 
	 * Examples:
	 * 
	 * no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 * no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 * no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 * 
	 */
	public static List<String> no4LetterWords(String[] stringArray) {
		return null;
	}
	
	/* PROBLEM 4 - fizzBuzzList
	 * 
	 * Given an array of Integers, return a List that contains the same
	 * Integers, except any multiple of 3 should be replaced by the String
	 * "Fizz", any multiple of 5 should be replaced by the String "Buzz",
	 * and any multiple of both 3 and 5 should be replaced by the String
	 * "FizzBuzz"
	 * 
	 * Examples:
	 * 
	 * array2List( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 * array2List( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 * array2List( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	 * 
	 */
	public static List<Object> fizzBuzzList(Integer[] stringArray) {
		return null;
	}
	
	
	
	/* XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * IGNORE THE CODE BELOW THIS POINT
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 */
	
	
	
	public static void main(String[] args) {
		
		/*****************/
		/*** PROBLEM 1 ***/
		/*****************/
		String[] input = new String[] {"Apple", "Orange", "Banana"};
		List<String> output = array2List(input);
		validateResults("Problem 1 - array2List( {\"Apple\", \"Orange\", \"Banana\"} )", input, output );
				
		input = new String[] {"Red", "Orange", "Yellow"};
		output = array2List(input);
		validateResults("Problem 1 - array2List( {\"Red\", \"Orange\", \"Yellow\"} )", input, output );
		
		input = new String[] {"Left", "Right", "Forward", "Back"};
		output = array2List(input);
		validateResults("Problem 1 - array2List( {\"Left\", \"Right\", \"Forward\", \"Back\"} )", input, output );
		
		/*****************/
		/*** PROBLEM 2 ***/
		/*****************/
		input = new String[] {"Apple", "Orange", "Banana"};
		String[] outputArray = list2Array(asList(input));
		validateResults("Problem 2 - list2Array( {\"Apple\", \"Orange\", \"Banana\"} )", input, outputArray != null ? asList(outputArray) : null );
				
		input = new String[] {"Red", "Orange", "Yellow"};
		outputArray = list2Array(asList(input));
		validateResults("Problem 2 - list2Array( {\"Red\", \"Orange\", \"Yellow\"} )", input, outputArray != null ? asList(outputArray) : null );
		
		input = new String[] {"Left", "Right", "Forward", "Back"};
		outputArray = list2Array(asList(input));
		validateResults("Problem 2 - list2Array( {\"Left\", \"Right\", \"Forward\", \"Back\"} )", input, outputArray != null ? asList(outputArray) : null  );
		
		/*****************/
		/*** PROBLEM 3 ***/
		/*****************/
		input = new String[] {"Train", "Boat", "Car"};
		output = no4LetterWords(input);
		validateResults("Problem 3 - no4LetterWords( {\"Train\", \"Boat\", \"Car\"} )", new String[]{"Train", "Car"}, output );
				
		input = new String[] {"Red", "White", "Blue"};
		output = no4LetterWords(input);
		validateResults("Problem 3 - no4LetterWords( {\"Red\", \"White\", \"Blue\"} )", new String[] {"Red", "White"}, output );
		
		input = new String[] {"Jack", "Jill", "Jane", "John", "Jim"};
		output = no4LetterWords(input);
		validateResults("Problem 3 - no4LetterWords( {\"Jack\", \"Jill\", \"Jane\", \"John\", \"Jim\"} )", new String[] {"Jim"}, output );
		
		
		/*****************/
		/*** PROBLEM 4 ***/
		/*****************/
		Integer[] inputNumbers = new Integer[] {1, 2, 3};
		List<Object> outputList = fizzBuzzList(inputNumbers);
		validateResults("Problem 4 - fizzBuzzList( {1, 2, 3} )", new Object[]{1, 2, "Fizz"}, output );
				
		inputNumbers = new Integer[] {4, 5, 6};
		outputList = fizzBuzzList(inputNumbers);
		validateResults("Problem 4 - fizzBuzzList( {4, 5, 6} )", new Object[]{4, "Buzz", 6}, output );
		
		inputNumbers = new Integer[] {7, 8, 9, 10, 11, 12, 13, 14, 15};
		outputList = fizzBuzzList(inputNumbers);
		validateResults("Problem 4 - fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )", new Object[]{7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"}, output );
	}
	
	private static void validateResults (String displayName, Object[] expected, List<?> actual) {
		boolean isCorrect = true;
		
		if(actual == null) {
			isCorrect = false;
		} else if(expected.length != actual.size()) {
			isCorrect = false;
		} else {
			for(int i = 0; i < expected.length; i++) {
				if(!expected[i].equals(actual.get(i))) {
					isCorrect = false;
				}
			}			
		}
		
		if(isCorrect) {
			System.out.println(displayName+" : PASS");
		} else {
			System.out.println(displayName+" : FAIL (expected: "+displayArray(expected)+" >>> actual: "+displayList(actual));
		}
		
	}
	
	private static String displayArray(Object[] anArray) {
		String displayString = "{ ";
		for(int i = 0; i < anArray.length; i++) {
			if(i > 0) {
				displayString += ", ";
			}
			displayString += anArray[i];
		}
		displayString += " }";
		return displayString;
	}
	
	private static String displayList(List<?> aList) {
		String displayString;
		if(aList == null) {
			displayString = "null";
		} else {
			displayString = "[ ";
			for(int i = 0; i < aList.size(); i++) {
				if(i > 0) {
					displayString += ", ";
				}
				displayString += aList.get(i);
			}
			displayString += " ]";
		}
		return displayString;
	}
}
