import java.util.Scanner;

public class Main extends StartPage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CreateFile.createFile();

        loadData();

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAccount();
                    saveData();
                    break;
                case 2:
                    login();
                    break;

                case 3:
                    System.out.println("See you soon");
                    return;

                default:
                    System.out.println("Invalid option. Please try again");
            }
        }
    }
    private static void saveData() {
        WriteFile.writeToFile();
    }

    private static void loadData() {
        WriteFile.readFromFile();
    }
}
 