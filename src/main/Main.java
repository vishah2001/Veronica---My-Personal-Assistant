// __      __                  _           
// \ \    / /                 (_)          
//  \ \  / /__ _ __ ___  _ __  _  ___ __ _ 
//   \ \/ / _ \ '__/ _ \| '_ \| |/ __/ _` |
//    \  /  __/ | | (_) | | | | | (_| (_| |
//     \/ \___|_|  \___/|_| |_|_|\___\__,_|
//                                        

package main;
import java.util.Scanner;
import basic.Greetings;
import basic.Music;
import main.Shutdown;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		boolean close = false; // To enable shutdown
		
		// Name of system
		String name = "veronica";
		
		// Name of user
//		String user = "vishal";
		
		// To start system
		while (close = true) {
			
			// Taking in input (text input for now)
			@SuppressWarnings("resource")
			Scanner speech = new Scanner(System.in);
			String input = speech.nextLine();
			
			if (input.toLowerCase().contains(name.toLowerCase())) {
				
				// Generic greetings
<<<<<<< HEAD
//				System.out.println(Greeting(input));
				String output = Greetings.Greeting(input);
				System.out.println(output);
				// Greetings based on time of day
				output = Greetings.TDGreeting(input);
				System.out.println(output);
				// To start Music
				output = Music.Music(input);
				System.out.println(output);
				// To turn off system
				close = Shutdown.Shutdown(input);
=======
				System.out.println(Greeting(input, name));
				// Greetings based on time of day
				System.out.println(TDGreeting(input, name));
>>>>>>> parent of dfb78fd... Refined Code and Files
				
			}
			
		}
	}
<<<<<<< HEAD
=======

	@SuppressWarnings("unused")
	public static String Greeting(String given, String name) { // TYPICAL GREETINGS
		
		// List for greetings
		String[] greeting = {
				"hey",
				"hello",
				"hi"
		};
		
		// The number of words in the input
		int numberOfWords = given.length();
		
		// To get input into an array
		String[] splitInput = given.split("\\s+");
		
		for (int i = 0; i < numberOfWords; i++) {
			if (Arrays.asList(greeting).contains(splitInput[i])) {
				return "Hello, sir";
			}
			return "";
		}
			
		return "";
	}
	
	
	public static String TDGreeting(String given, String name) { // TIME BASED GREETINGS
		
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
			return "Good " + TheGreeting + ", sir";
		} else {
			return "";
		}
	}
	

>>>>>>> parent of dfb78fd... Refined Code and Files
}
