// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double interestRate = Integer.parseInt(args[1]);
		int  n = Integer.parseInt(args[2]);
		double futureValue = currentValue * (Math.pow((interestRate/100) + 1,n));
		System.out.println("After " + n + " years, $" + currentValue +
		                   " saved at "+ interestRate + "% will yield $" + (int)futureValue);


	}
}