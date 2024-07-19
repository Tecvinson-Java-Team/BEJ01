import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * A command-line application for managing household income and expenses.
 * Provides options to add, modify, delete, display, save, and load financial data.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AppTester {

    /**
     * Main method to run the application.
     * Provides a menu-driven interface for user interaction.
     */
    public static void main(String[] args) {
        HouseholdManager manager = new HouseholdManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            // Display menu options
            System.out.println("Welcome to the Household Income and Expense Manager");
            System.out.println("1. Add Income and Expense");
            System.out.println("2. Modify Income");
            System.out.println("3. Delete Income");
            System.out.println("4. Modify Expense");
            System.out.println("5. Delete Expense");
            System.out.println("6. Display Monthly Summary");
            System.out.println("7. Save Data");
            System.out.println("8. Load Data");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            command = scanner.nextLine();

            try {
                switch (command) {
                    case "1":
                        // Add income and expense
                        addIncomeAndExpense(manager, scanner);
                        break;
                    case "2":
                        // Modify income
                        modifyIncome(manager, scanner);
                        break;
                    case "3":
                        // Delete income
                        deleteIncome(manager, scanner);
                        break;
                    case "4":
                        // Modify expense
                        modifyExpense(manager, scanner);
                        break;
                    case "5":
                        // Delete expense
                        deleteExpense(manager, scanner);
                        break;
                    case "6":
                        // Display summary
                        displayMonthlySummary(manager, scanner);
                        break;
                    case "7":
                        // Save data
                        saveData(manager, scanner);
                        break;
                    case "8":
                        // Load data
                        loadData(manager, scanner);
                        break;
                    case "9":
                        // Exit
                        System.out.println("Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid number.");
            }
        }
    }

    // Method to add income and expense
    private static void addIncomeAndExpense(HouseholdManager manager, Scanner scanner) {
        System.out.print("Enter month: ");
        String month = scanner.nextLine();
        MonthlyManager monthlyManager = manager.getMonthlyManager(month);
        if (monthlyManager == null) {
            monthlyManager = new MonthlyManager();
            manager.addHousehold(month, monthlyManager);
        }

        while (true) {
            System.out.print("Enter income category: ");
            String incomeCategory = scanner.nextLine();
            System.out.print("Enter income amount: ");
            double incomeAmount = Double.parseDouble(scanner.nextLine());
            monthlyManager.addIncome(new Income(month, incomeCategory, incomeAmount));

            System.out.print("Do you want to add another income for this month? (yes/no): ");
            if (!scanner.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter expense category: ");
            String expenseCategory = scanner.nextLine();
            System.out.print("Enter expense amount: ");
            double expenseAmount = Double.parseDouble(scanner.nextLine());
            monthlyManager.addExpense(new Expense(month, expenseCategory, expenseAmount));

            System.out.print("Do you want to add another expense for this month? (yes/no): ");
            if (!scanner.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }
    }

    // Method to modify income
    private static void modifyIncome(HouseholdManager manager, Scanner scanner) {
        System.out.print("Enter month: ");
        String month = scanner.nextLine();
        MonthlyManager monthlyManager = manager.getMonthlyManager(month);
        if (monthlyManager != null) {
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            System.out.print("Enter new amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            monthlyManager.modifyIncome(category, amount);
        } else {
            System.out.println("Month not found.");
        }
    }

    // Method to delete income
    private static void deleteIncome(HouseholdManager manager, Scanner scanner) {
        System.out.print("Enter month: ");
        String month = scanner.nextLine();
        MonthlyManager monthlyManager = manager.getMonthlyManager(month);
        if (monthlyManager != null) {
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            monthlyManager.deleteIncome(category);
        } else {
            System.out.println("Month not found.");
        }
    }

    // Method to modify expense
    private static void modifyExpense(HouseholdManager manager, Scanner scanner) {
        System.out.print("Enter month: ");
        String month = scanner.nextLine();
        MonthlyManager monthlyManager = manager.getMonthlyManager(month);
        if (monthlyManager != null) {
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            System.out.print("Enter new amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            monthlyManager.modifyExpense(category, amount);
        } else {
            System.out.println("Month not found.");
        }
    }

    // Method to delete expense
    private static void deleteExpense(HouseholdManager manager, Scanner scanner) {
        System.out.print("Enter month: ");
        String month = scanner.nextLine();
        MonthlyManager monthlyManager = manager.getMonthlyManager(month);
        if (monthlyManager != null) {
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            monthlyManager.deleteExpense(category);
        } else {
            System.out.println("Month not found.");
        }
    }

    // Method to display monthly summary
    private static void displayMonthlySummary(HouseholdManager manager, Scanner scanner) {
        System.out.print("Enter month: ");
        String month = scanner.nextLine();
        MonthlyManager monthlyManager = manager.getMonthlyManager(month);
        if (monthlyManager != null) {
            System.out.println("Income by category: " + monthlyManager.getTotalIncomeByCategory());
            System.out.println("Expense by category: " + monthlyManager.getTotalExpenseByCategory());
            System.out.println("Net balance: " + monthlyManager.getNetBalance());
        } else {
            System.out.println("Month not found.");
        }
    }

    // Method to save data
    private static void saveData(HouseholdManager manager, Scanner scanner) {
        System.out.print("Enter filename to save data: ");
        String saveFilename = scanner.nextLine();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            mapper.writeValue(new File(saveFilename), manager);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Method to load data
    private static void loadData(HouseholdManager manager, Scanner scanner) {
        System.out.print("Enter filename to load data: ");
        String loadFilename = scanner.nextLine();
        ObjectMapper mapper = new ObjectMapper();
        try {
            HouseholdManager loadedManager = mapper.readValue(new File(loadFilename), HouseholdManager.class);
            manager.setMonthlyData(loadedManager.getMonthlyData());
            System.out.println("Data loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
