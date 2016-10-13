package basic;

import java.util.Arrays;

public class Music {

	public static void main(String[] args) {
		
	}
	
	public static String Music(String given) { // MUSIC
		
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

}
