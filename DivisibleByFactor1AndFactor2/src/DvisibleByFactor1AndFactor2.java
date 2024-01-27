/* Purpose:
 * 		Program that displays the integer numbers from MIN_NUM to MAX_NUM that are divisible by FACTOR1 and FACTOR2
 * Programmer: Lanz Salviejo
 * Date: Jan 2024
 */
public class DvisibleByFactor1AndFactor2 {

	public static void main(String[] args) {
		// Declaring Constants
		final int MIN_NUM = 100;
		final int MAX_NUM = 999;
		final int NUM_PER_LINE = 6; // Numbers printed per line
		final int FACTOR1 = 3;
		final int FACTOR2 = 7;
		
		// Welcomes user and describes program
		System.out.println("This program will print ");
		System.out.println("all the numbers from" + MIN_NUM + "to" + MAX_NUM);
		System.out.println("that are divisible by" + FACTOR1 + "AND" + FACTOR2);
		System.out.println("using the do-while loop and the for-loop. ");
		System.out.println("Lets get started!\n");
		
		// Number used to count upwards
		int number = MIN_NUM;
		// Used to count until a new line is needed to be printed 
		int newline = 0;
		
		// Do while loop version of the program
		System.out.println("Using the do-while loop: ");
		do {
			// This checks whether or not the boolean is true, if it is true it will execute the nested code
			if (divisibleByFactor1AndFactor2 (number, FACTOR1, FACTOR2)) {
				
				// This section will print out the number divisible by FACTOR1 and FACTOR2
				// while adding to the newline integer which tracks the numbers printed  per line
				System.out.print(number + " ");
				newline++;
				
				// When the integer newLine is divided by NUM_PER_LINE and returns a 0
				// it will print a new line to start a new block of integers
				if (newline % NUM_PER_LINE == 0) {
					System.out.println();
					
				} // nested if
			} // if
			number++;
		} while (number <= MAX_NUM); // This will continue to print while number is between 100 & 999
		
		// For loop version of the program
		System.out.println("\n\nUsing the for loop: ");
		
		// Re-initializes newline integer
		newline = 0;
		
		for (number = 100; number >= MIN_NUM && number <= MAX_NUM; number++) {
			// This checks whether or not the boolean is true, if it is true it will execute the nested code
			if (divisibleByFactor1AndFactor2 (number, FACTOR1, FACTOR2)) {
				
				System.out.print(number + " ");
				newline++;
				
				// When the integer newLine is divided by NUM_PER_LINE and returns a 0
				// it will print a new line to start a new block of integers
				if (newline % NUM_PER_LINE == 0) {
					System.out.println();
					
				} // nested if
			} // if
		} // for Loop
		
		// Print out final message
		System.out.println("\n\nWritten by Lanz Salviejo, Spring 2024");
	} // main
	
	// This method will check if the integer "number" is divisible by 3 and 7, returning true if it is
	public static Boolean divisibleByFactor1AndFactor2 (int num, int factor1, int factor2) {
		return num % factor1 == 0 && num % factor2 == 0;
	} // divisibleByFactor1AndFactor2 Method

} // DivisibleByFactor1AndFactor2 Class
