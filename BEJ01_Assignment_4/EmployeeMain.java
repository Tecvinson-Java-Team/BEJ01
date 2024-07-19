import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        // Try-with-resources to ensure the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            // Create an Employee instance
            Employee employee = new Employee();

            // Set employee information
            System.out.println("Enter employee title:");
            employee.setTitle(scanner.nextLine());
            System.out.println("Enter employee first name:");
            employee.setFirstName(scanner.nextLine());
            System.out.println("Enter employee last name:");
            employee.setLastName(scanner.nextLine());
            System.out.println("Enter employee email:");
            employee.setEmail(scanner.nextLine());
            System.out.println("Enter employee phone:");
            employee.setPhone(scanner.nextLine());
            System.out.println("Enter employee nationality:");
            employee.setNationality(scanner.nextLine());

            // Create an Allowance instance and set allowance details
            Allowance allowance = new Allowance();
            System.out.println("Enter basic allowance:");
            allowance.setBasic(scanner.nextDouble());
            System.out.println("Enter transportation allowance:");
            allowance.setTransportation(scanner.nextDouble());
            System.out.println("Enter wardrobe allowance:");
            allowance.setWardrobe(scanner.nextDouble());
            System.out.println("Enter education allowance:");
            allowance.setEducation(scanner.nextDouble());
            System.out.println("Enter feeding allowance:");
            allowance.setFeeding(scanner.nextDouble());
            employee.setAllowance(allowance);

            // Create a Vacation instance and set vacation details
            Vacation vacation = new Vacation();
            System.out.println("Enter total vacation days:");
            vacation.setVacationDays(scanner.nextInt());
            System.out.println("Enter used vacation days:");
            vacation.setUsedVacationDays(scanner.nextInt());
            employee.setVacation(vacation);

            // Clear scanner buffer
            scanner.nextLine();

            // Display initial employee information
            displayEmployeeInfo(employee);

            // Ask if the user wants to update information
            System.out.println("Do you want to update employee information? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                // Update employee information
                System.out.println("Enter new employee title:");
                employee.setTitle(scanner.nextLine());
                System.out.println("Enter new employee first name:");
                employee.setFirstName(scanner.nextLine());
                System.out.println("Enter new employee last name:");
                employee.setLastName(scanner.nextLine());
                System.out.println("Enter new employee email:");
                employee.setEmail(scanner.nextLine());
                System.out.println("Enter new employee phone:");
                employee.setPhone(scanner.nextLine());
                System.out.println("Enter new employee nationality:");
                employee.setNationality(scanner.nextLine());

                // Update allowance information
                System.out.println("Enter new basic allowance:");
                allowance.setBasic(scanner.nextDouble());
                System.out.println("Enter new transportation allowance:");
                allowance.setTransportation(scanner.nextDouble());
                System.out.println("Enter new wardrobe allowance:");
                allowance.setWardrobe(scanner.nextDouble());
                System.out.println("Enter new education allowance:");
                allowance.setEducation(scanner.nextDouble());
                System.out.println("Enter new feeding allowance:");
                allowance.setFeeding(scanner.nextDouble());

                // Update vacation information
                System.out.println("Enter new total vacation days:");
                vacation.setVacationDays(scanner.nextInt());
                System.out.println("Enter new used vacation days:");
                vacation.setUsedVacationDays(scanner.nextInt());

                // Clear scanner buffer
                scanner.nextLine();

                // Display updated employee information
                displayEmployeeInfo(employee);
            } else {
                // If the user does not want to update, just display the existing information
                System.out.println("No updates made.");
                displayEmployeeInfo(employee);
            }
        } catch (InputMismatchException e) {
            // Handle invalid input types
            System.out.println("Invalid input type entered. Please enter the correct data type.");
        }
    }

    // Method to display employee information
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("\nEmployee Information:");
        System.out.println("Title: " + employee.getTitle());
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Nationality: " + employee.getNationality());

        System.out.println("\nAllowance Information:");
        System.out.println("Basic Allowance: " + employee.getAllowance().getBasic());
        System.out.println("Transportation Allowance: " + employee.getAllowance().getTransportation());
        System.out.println("Wardrobe Allowance: " + employee.getAllowance().getWardrobe());
        System.out.println("Education Allowance: " + employee.getAllowance().getEducation());
        System.out.println("Feeding Allowance: " + employee.getAllowance().getFeeding());

        System.out.println("\nVacation Information:");
        System.out.println("Total Vacation Days: " + employee.getVacation().getVacationDays());
        System.out.println("Used Vacation Days: " + employee.getVacation().getUsedVacationDays());
        System.out.println("Remaining Vacation Days: " + employee.getVacation().getRemainingVacationDays());
    }
}
