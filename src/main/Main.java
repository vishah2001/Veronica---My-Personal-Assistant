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
				
			}
			
		}
	}
}
