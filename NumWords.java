// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		int hundreds = num / 100;
		int ones = num % 10;
		int tens = (num - ones - (hundreds*100)) / 10;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
		
	}
}
