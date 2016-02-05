package exercises1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Write a command line program that takes an the name of a country in South America as an argument 
 * and returns the name of the capital of that country.  Program input should be case insensitive 
 * so "Brazil", "brazil", and "BRAZIL" should all return "Brasilia".
 * 
 * Argentina -> Buenos Aires
 * Bolivia -> Sucre
 * Brazil -> Brasilia
 * Chile -> Santiago
 * Colombia -> Bogota
 * Ecuador -> Quito
 * Guyana -> Georgetown
 * Paraguay -> Asuncion
 * Peru -> Lima
 * Suriname -> Paramaribo
 * Uruguay -> Montevideo
 * Venzuela -> Caracas
 *
 */
public class Country2Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> countryCapitals = new HashMap<String, String>();
		countryCapitals.put("argentina","Buenos Aires");
		countryCapitals.put("bolivia","Sucre");
		countryCapitals.put("brazil","Brasilia");
		countryCapitals.put("chile","Santiago");
		countryCapitals.put("colombia","Bogota");
		countryCapitals.put("ecuador", "Quito");
		countryCapitals.put("guyana","Georgetown");
		countryCapitals.put("paraguay","Asuncion");
		countryCapitals.put("peru","Lima");
		countryCapitals.put("suriname","Paramaribo");
		countryCapitals.put("uruguay","Montevideo");
		countryCapitals.put("venzuela","Caracas");
			
			//Set<String> keys = countryCapitals.keySet();
			for(String name : args) {
			System.out.println(countryCapitals.get(name.toLowerCase()));
				
			}
}


	}


