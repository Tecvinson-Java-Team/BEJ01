import java.util.Scanner; // Import the Scanner class from the java.util package

public class PowerCalculations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number (integer or decimal)
        System.out.print("Enter the first number (it can be an integer or a decimal): ");
        double firstNumber = scanner.nextDouble(); // Read the first number as a double

        // Prompt the user to enter the second number (integer or decimal)
        System.out.print("Enter the second number (it can be an integer or a decimal): ");
        double secondNumber = scanner.nextDouble(); // Read the second number as a double

        // Calculating sum of the two numbers
        double sum = firstNumber + secondNumber;

        // Calculating difference between the two numbers
        double difference = firstNumber - secondNumber;

        // Calculating product of the two numbers
        double product = firstNumber * secondNumber;

        // Calculating average of the two numbers
        double average = (firstNumber + secondNumber) / 2.0;

        // Calculating distance (absolute difference) between the two numbers
        double distance = Math.abs(firstNumber - secondNumber);

        // Determine the maximum of the two numbers
        double max = Math.max(firstNumber, secondNumber);

        // Determine the minimum of the two numbers
        double min = Math.min(firstNumber, secondNumber);

        // Display the results to the user
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Close the scanner to free up system resources
        scanner.close();
    }
}
