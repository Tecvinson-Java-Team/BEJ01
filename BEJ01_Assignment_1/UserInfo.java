import java.util.Scanner;

public class UserInfo
{
    public static void main(String[] args)
    {
        // Declaring  variables to store user information
        String title;
        String firstName;
        String lastName;
        String email;
        String phone;
        String country;
        String dateOfBirth;
        String placeOfBirth;
        String location;
        String gender;

        // Here we create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Receive user input
        System.out.print("Enter your title (e.g., Mr., Mrs., Dr.): ");
        title = scanner.nextLine();

        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        phone = scanner.nextLine();

        System.out.print("Enter your country: ");
        country = scanner.nextLine();

        System.out.print("Enter your date of birth (e.g., 1990-01-01): ");
        dateOfBirth = scanner.nextLine();

        System.out.print("Enter your place of birth: ");
        placeOfBirth = scanner.nextLine();

        System.out.print("Enter your current location: ");
        location = scanner.nextLine();

        System.out.print("Enter your gender: ");
        gender = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Display the collected information
        System.out.println("\nUser Information:");
        System.out.println("Title: " + title);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Country: " + country);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Place of Birth: " + placeOfBirth);
        System.out.println("Current Location: " + location);
        System.out.println("Gender: " + gender);
    }
}
