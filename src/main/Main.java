// __      __                  _           
// \ \    / /                 (_)          
//  \ \  / /__ _ __ ___  _ __  _  ___ __ _ 
//   \ \/ / _ \ '__/ _ \| '_ \| |/ __/ _` |
//    \  /  __/ | | (_) | | | | | (_| (_| |
//     \/ \___|_|  \___/|_| |_|_|\___\__,_|
//                                        

package main;
import java.util.Scanner;
import java.util.Arrays;
//import java.lang.Math; // For random comments

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		boolean close = false; // To enable shutdown
		
		// Name of system
		String name = "veronica";
		
		// User Information
		// Use UserInfo Class
		
		// To start system
		while (close = true) {
			
			// Taking in input (text input for now)
			@SuppressWarnings("resource")
			Scanner speech = new Scanner(System.in);
			String input = speech.nextLine();
			
			if (input.toLowerCase().contains(name.toLowerCase())) {
				// Generic greetings
				System.out.println(Greeting(input));
				// Greetings based on time of day
				System.out.println(TDGreeting(input));
				// To start Music
				System.out.println(Music(input));
				// To turn off system
				close = Shutdown(input);
				
			}
			
		}
	}

	@SuppressWarnings("unused")
	public static String Greeting(String given) { // TYPICAL GREETINGS
		
		// List for greetings
		String[] greeting = {
				"hey",
				"hello",
				"hi"
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
	
	public static String Music(String given) { // TIME BASED GREETINGS
		
		// List for time greetings
		String[] MusicStarters = {
				"play",
				"start"
		};
		
		String[] MusicTerms = {
				"music",
				"tunes"
		};

		// To get input into an array
		String[] splitInput = given.split("\\s+");
		
		// The number of words in the input
		int total = splitInput.length;
		 
		// To see how many requirements fit the category
		int points = 0;
		
		for (int i = 0; i < total; i++) {
			if (Arrays.asList(MusicStarters).contains(splitInput[i])) {
				points++;
			} else if (Arrays.asList(MusicTerms).contains(splitInput[i])) {
				points++;
			}
		}

			if (points == 2) {
			return "Playing Music";
		} else {
			return "";
		}
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
