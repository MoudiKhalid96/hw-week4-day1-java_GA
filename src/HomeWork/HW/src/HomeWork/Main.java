package HomeWork;

public class Main {

	public static void main(String[] args) {

		
		
		// LAB2
		System.out.println("LAB2\n------------------");

		int x = 3;
		int y = x;

		System.out.println("Value of X = " + x);// OUTPUT: Value of X = 3
		System.out.println("Value of Y = " + y);// OUTPUT: Value of y = 3

		System.out.println("Y has value of X");// OUTPUT: Y has value of X
		System.out.println("=========================\n\n");

		
		
		// LAB3
		System.out.println("LAB3\n------------------");
		double x2;
		int y2 = 90;
		x2 = y2 / 100;

		System.out.println("x=" + x2);// OUTPUT: x=0.0
		System.out.println("=========================\n\n");

		
		
		// LAB4
		System.out.println("LAB4\n------------------");
		int number1 = 7;
		boolean result = isPrime(number1);

		System.out.println("Is " + number1 + " prime? " + result);
		System.out.println("=========================\n\n");

		
		
		// LAB5
		System.out.println("LAB5\n------------------");

		int number = 9;

		System.out.print("\n\t|");
		
		for (int i = 2; i <= number; i++) {
			System.out.print((i) + "\t");
		}

		System.out.println("\n--------|---------------------------------------------------------");

		for (int i = 2; i <= number; i++) {

			System.out.print(i + "\t|");
			
			for (int j = 2; j <= number; j++) {

				System.out.print(i * j + "\t");

			}
			System.out.println();
		}

	}// end main method

	public static boolean isPrime(int number) {
		// start with 2 .. because 1 will make it prime
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				return false;
			}

		} // end for loop

		return true;
	}// end method isPrime.

}// end class
