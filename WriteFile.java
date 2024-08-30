import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    // Method to write user and student information to a file
    public static void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CreateFile.getFileName()))) {
            // Write user information
            writer.write("User Information:\n");
            writer.write(StartPage.userInfoToFileFormat());
            writer.newLine();

            // Write student information
            writer.write("Student Information:\n");
            writer.write(StartPage.studentInfoToFileFormat());
            writer.newLine();



        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read user and student information from a file
    public static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CreateFile.getFileName()))) {
            StringBuilder userInfoData = new StringBuilder();
            StringBuilder studentInfoData = new StringBuilder();
            String line;
            boolean readingUsers = false;
            boolean readingStudents = false;

            while ((line = reader.readLine()) != null) {
                if (line.equals("User Information:")) {
                    readingUsers = true;
                    readingStudents = false;
                    continue;
                }
                else if (line.equals("Student Information:")) {
                    readingUsers = false;
                    readingStudents = true;
                    continue;
                }


                if (readingUsers) {
                    userInfoData.append(line).append("\n");
                }
                else if (readingStudents) {
                    studentInfoData.append(line).append("\n");
                }
            }

            // Populate userInfo and studentInfo from the file data
            StartPage.userInfoFromFileFormat(userInfoData.toString());
            StartPage.studentInfoFromFileFormat(studentInfoData.toString());

        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}