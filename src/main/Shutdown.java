//   _____ _           _      _                     
//  / ____| |         | |    | |                    
// | (___ | |__  _   _| |_ __| | _____      ___ __  
//  \___ \| '_ \| | | | __/ _` |/ _ \ \ /\ / / '_ \ 
//  ____) | | | | |_| | || (_| | (_) \ V  V /| | | |
// |_____/|_| |_|\__,_|\__\__,_|\___/ \_/\_/ |_| |_|
                                                 

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
				"shutdown",
				"abort",
				"go away"
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
