import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression you want to calculate in a format like \"* 3 7\":");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        char operator = expression.charAt(0);

        double a = Double.valueOf(expression.substring(2, expression.indexOf(" ", 2)));
        double b = Double.valueOf(expression.substring(expression.indexOf(" ", 2) + 1, expression.length()));

        double result = 0;

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else if (operator == '%') {
            result = a % b;
        }

        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(result));
    }
}