package main;

import java.util.Arrays;

public class TDGreetings {

	public static void main(String[] args) {
		
		System.out.println(TDGreeting("hey good morning veronica", "veronica", "vishal"));
		
	}
	
	public static String TDGreeting(String given, String name, String user) {
		
		// List for time greetings
		String[] TDgreeting = {
				"morning",
				"afternoon",
				"evening",
				"night"
		};
		
		// The number of words in the input
		int numberOfWords = given.length();
		
		// To get input into an array
		String[] splitInput = given.split("\\s+");
		
		// To see how many requirements fit the category
		int points = 0;
		
		if (given.toLowerCase().contains(name.toLowerCase())) {
			for (int i = 0; i < numberOfWords; i++) {
				if (Arrays.asList(TDgreeting).contains(splitInput[i])) {
					points++;
//					int indexOfGreetings = i;
				}
				if (given.toLowerCase().contains("good")) {
					points++;
				}
			}
		}
		if (points == 2) {
			return "Good " + TDgreeting[points] + user;
		} else {
			return "";
		}
	}

}
