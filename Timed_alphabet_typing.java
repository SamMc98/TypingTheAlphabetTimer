package Java_Challenges;

import java.util.Scanner;

public class Timed_alphabet_typing {

	static void Menu() {
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Type the whole alphabet from A to Z as quickly as possible. \n\nReady?");

		String Answer = input1.next();
		if (Answer.toLowerCase().equals("no")) {
			System.out.println("Never mind then...");
			Menu();
		}
		else if (Answer.toLowerCase().equals("yes")) {		
			System.out.println("Let's begin!");
		}	      
	}

	public static void main(String[] args) throws InterruptedException {
		Menu();
		// finding the time before the operation is executed
		long start = System.currentTimeMillis();
		for (int i = 0; i <5; i++) {
			Thread.sleep(60);
		}

		Scanner input = new Scanner(System.in);
		String UserInput = input.next();
		if (UserInput.toLowerCase().equals("abcdefghijklmnopqrstuvwxyz")) {
			// finding the time after the operation is executed
			long end = System.currentTimeMillis();
			//finding the time difference and converting it into seconds
			float sec = (end - start) / 1000F; 
			System.out.println("Awesome! You completed it in " + (int)sec + " seconds.");
			float score = (int)sec;
			System.out.println("Want to replay?");
			String YesOrNo = input.next();
			if (YesOrNo.toLowerCase().equals("yes")) {
				main(args);	
				int difference = Math.abs((int)score - (int)sec);
				System.out.println(difference);
			}
			if (YesOrNo.toLowerCase().equals("no")) {
				System.out.println("See you later alligator.");
			}
		}
		else {
			System.out.println("Seems like you slipped up somewhere, bud.");
		}
		input.close();
	}
}