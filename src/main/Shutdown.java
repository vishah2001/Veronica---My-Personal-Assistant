package main;

import java.util.Arrays;

public class Shutdown {

	public static void main(String[] args) {
		

	}
	
	@SuppressWarnings("unused")
	public static boolean Shutdown(String given) { // SHUTDOWN COMMANDS
		
		// List for greetings
		String[] shutdown = {
				"turn off",
				"shutdown"
		};
		
		// To get input into an array
				String[] splitInput = given.split("\\s+");
				
		// The number of words in the input
		int total = splitInput.length;
		
		for (int i = 0; i < total; i++) {
			if (Arrays.asList(shutdown).contains(splitInput[i])) {
				return true;
			}
			return false;
		}
			
		return false;
	}
}
