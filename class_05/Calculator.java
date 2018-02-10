// import allows us to use code from the Java standard library
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Calculator {
	public static void main(String[] args) {
		// Don't worry about this. We'll cover it in 2 weeks.
		List<String> validOperators = Arrays.asList(
			"+", "-", "/", "*");

		// Scanner is how we can read input from the user
		Scanner scanner = new Scanner(System.in);

		// This is a function we made that asks the user for a number
		float firstNumber = askAndGetFloat(scanner);

		/*
			We need to initalized operator before the loop.
			If we initialize it within the loop, it
			won't exist when the loop ends. Variables
			initialized within a scope only exist within that
			scope.
		*/
		String operator = "";
		/*
			While the operator we were given is not
			in our valid operators list...
		*/
		while(!validOperators.contains(operator)) {
			System.out.println("Please enter +, -, *, or /:");
			// Scanner's next method reads in the next entry as a String
			operator = scanner.next();
			System.out.println("user entered: " + operator);
		}

		// Same as firstNumber
		float secondNumber = askAndGetFloat(scanner);

		/*
			We check each acceptable operator.
			For each operator, we do the appropriate math
			and print the output
		*/
		if("+".equals(operator)) {
			System.out.println("Sum: " +
				(firstNumber + secondNumber));
		} else if("-".equals(operator)) {
			System.out.println("Difference: " +
				(firstNumber - secondNumber));
		} else if("*".equals(operator)) {
			System.out.println("Product: " +
				(firstNumber * secondNumber));
		} else if("/".equals(operator)) {
			System.out.println("Quotient: " +
				(firstNumber / secondNumber));
		}
	}

	/*
		We took this logic and put it into a function
		because we use it twice. Rather than have the
		same code written twice, we can define a function
		then just call the function name. It makes our
		code easier and cleaner.

		We take scanner as an input because we defined it
		within the main function. Since this function isn't
		inside the main function, we need to take it as
		an input so we have access to use it.
	*/
	public static float askAndGetFloat(Scanner scanner) {
		float firstNumber = 0;

		System.out.println("Enter a number:");

		/*
			Scanner.hasNext will "block". This means that
			the program will pause executing. Each time
			the loop runs, it will pause at the next input
		*/
		while (scanner.hasNext()) {
			// If the input was a float, exit the loop with "break"
			if (scanner.hasNextFloat()) {
				break;
			} else {
				// Otherwise, ask the user to enter another number
				System.out.println("user entered: " + scanner.next());
				System.out.println("Enter a number:");
			}
		}
		/*
			If we got here, the user entered a float in order
			to break out of the loop. Use nextFloat to store
			the float that the user entered.
		*/
		firstNumber = scanner.nextFloat();
		System.out.println("user entered: " + firstNumber);
		// Return this number so that whatever called it can use it
		return firstNumber;
	}
}
