import java.util.ArrayList;
import java.util.List;

public class Lecture {
	
	public static void main(String[] args) {
		
		/* Since String "is-a" Object, I can assign instances of String
		 * to a variable of type Object */
		
		String name = "George Washington";
		Object obj = name;
		
		System.out.println("obj : "+obj);
		
		/* Even though name and obj are declared to be different types, they
		 * refer to the same object in memory */
		
		if(name == obj) {
			System.out.println("obj and name reference the same instance");
		}
		
		/* When we call obj.equals(...), we're calling it on an instance of String */
		
		if(obj.equals("George Washington")) {
			System.out.println("obj == George Washington");
		}
		
		/* Even though obj refers to a String instance, the compiler will only allow
		 * us to call methods that are valid for the declared data type (i.e. java.lang.Object) */
		
		// obj.toUpperCase(); // this causes a compiler error because toUpperCase is not a valid java.lang.Object method
		
		/* I can cast a super type into a valid subclass in order to treat the variable
		 * as an instance of the subclass */
		String upperName = ((String)obj).toUpperCase();
		
		
		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation 
		 * of a primitive value */
		Integer employees = new Integer(25);       // here we call a constructor that "wraps" a primitive int value in an object
		Integer piecesOfCake = new Integer("24");  // here we call a constructor that converts a String into an Integer
		
		if(employees > piecesOfCake) {
			System.out.println("Burn the building down");
		}
		
		Double accountBalance = null;
		// double newBalance = accountBalance + 100;  // this causes a NullPointerException because we are trying to "unbox" a null value
		
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> names = new ArrayList<String>();
		names.add("Jim");
		names.add("Elizabeth");
		names.add("Dan");
		names.add("Seth");
		names.add("Christo");
		names.add("Bruce");
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		//the elements will be returned in the same order they were added
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Jim");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(2, "David");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		names.remove(2);
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	}
}
