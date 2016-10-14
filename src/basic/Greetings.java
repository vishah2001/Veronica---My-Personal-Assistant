//   _____               _   _                 
//  / ____|             | | (_)                
// | |  __ _ __ ___  ___| |_ _ _ __   __ _ ___ 
// | | |_ | '__/ _ \/ _ \ __| | '_ \ / _` / __|
// | |__| | | |  __/  __/ |_| | | | | (_| \__ \
//  \_____|_|  \___|\___|\__|_|_| |_|\__, |___/
//                                    __/ |    
//                                   |___/     
 
package basic;

import java.util.Arrays;

public class Greetings {

	public static void main(String[] args) {
		
	}
	
	@SuppressWarnings("unused")
	public static String Greeting(String given) { // TYPICAL GREETINGS
		
		// List for greetings
		String[] greeting = {
				"hey",
				"hello",
				"hi",
				"yo",
				"top of the morning"
		};
		
		// To get input into an array
				String[] splitInput = given.split("\\s+");
				
		// The number of words in the input
		int total = splitInput.length;
		
		for (int i = 0; i < total; i++) {
			if (Arrays.asList(greeting).contains(splitInput[i])) {
				return "Hello, sir. What can I do for you?";
			}
			return "";
		}
			
		return "";
	}
	
	
	public static String TDGreeting(String given) { // TIME BASED GREETINGS
		
		// List for time greetings
		String[] TDgreetingList = {
				"morning",
				"afternoon",
				"evening",
				"night"
		};

		// To get input into an array
		String[] splitInput = given.split("\\s+");
		
		// The number of words in the input
		int total = splitInput.length;
		 
		// To see how many requirements fit the category
		int points = 0;
		
		// For greeting
		String TheGreeting = "";
		
		for (int i = 0; i < total; i++) {
			if (Arrays.asList(TDgreetingList).contains(splitInput[i])) {
				points++;
				TheGreeting = splitInput[i];
			} else if (splitInput[i].toLowerCase().contains("good")) {
				points++;
			}
		}

			if (points == 2) {
			return "Good " + TheGreeting + ", sir. Is there anything that I can do for you?";
		} else {
			return "";
		}
	}

}
