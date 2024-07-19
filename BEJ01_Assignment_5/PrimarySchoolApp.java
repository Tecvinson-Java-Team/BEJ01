package school;

import java.util.*;
import filemanager.CreateFile;
import filemanager.WriteFile;
import filemanager.ReadFile;

public class PrimarySchoolApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        // Create the file if it doesn't exist
        CreateFile.createFile();

        // Menu options
        System.out.println("Welcome to " + Student.getSchoolName());
        System.out.println("1. Add a new student");
        System.out.println("2. Display all students");
        System.out.println("3. Delete a student");
        System.out.println("4. Exit");

        boolean running = true;

        while (running) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add a new student
                    students = ReadFile.readFromFile();
                    students.add(addStudent(scanner));
                    WriteFile.writeToFile(students);
                    break;
                case 2:
                    // Display all students
                    students = ReadFile.readFromFile();
                    displayStudents(students);
                    break;
                case 3:
                    // Delete a student
                    students = ReadFile.readFromFile();
                    deleteStudent(scanner, students);
                    WriteFile.writeToFile(students);
                    break;
                case 4:
                    // Exit the application
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }

    // Method to add a new student
    private static Student addStudent(Scanner scanner) {
        Student student = new Student();

        System.out.print("Enter first name: ");
        student.setFirstName(scanner.nextLine());
        System.out.print("Enter last name: ");
        student.setLastName(scanner.nextLine());
        System.out.print("Enter date of birth (DD-MM-YYYY): ");
        student.setDob(scanner.nextLine());
        System.out.print("Enter gender: ");
        student.setGender(scanner.nextLine());
        System.out.print("Enter class: ");
        student.setStudentClass(scanner.nextLine());

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Subject[] subjects = new Subject[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name: ");
            String subjectName = scanner.nextLine();
            System.out.print("Enter grade for " + subjectName + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            subjects[i] = new Subject(subjectName, grade);
        }
        student.setSubjects(subjects);

        return student;
    }

    // Method to display all students
    private static void displayStudents(List<Student> students) {
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to delete a student
    private static void deleteStudent(Scanner scanner, List<Student> students) {
        System.out.print("Enter ID of the student to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        boolean removed = students.removeIf(student -> student.getId() == id);
        if (removed) {
            System.out.println("Student with ID " + id + " has been deleted.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}
