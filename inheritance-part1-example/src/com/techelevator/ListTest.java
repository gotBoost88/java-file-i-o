package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		myList.add("Apple");
		myList.add("Orange");
		myList.add("Apple");
		myList.add("Banana");
		
		boolean containsApple = myList.contains("apple");
		System.out.println("Contains 'apple' : "+containsApple);
		
	}

}
