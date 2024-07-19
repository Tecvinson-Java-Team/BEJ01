import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number (integer or decimal)
        System.out.print("Enter a number (it can be an integer or a decimal): ");
        double number = scanner.nextDouble();

        // Calculate the powers
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        // Display the results
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);

        scanner.close();
    }
}
