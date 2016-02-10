package com.techelevator;

import java.util.ArrayList;

public class StringList extends ArrayList<String> {
	
	public boolean contains(Object obj) {
		boolean found = false;
		
		if(obj instanceof String) {
			String searchString = (String)obj;
			for(int i = 0; i < this.size(); i++) {
				if(searchString.equalsIgnoreCase(this.get(i))) {
					found = true;
				}
			}
		}
		
		return found;
	}

}
