package filemanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import school.Student;

public class WriteFile {
    // Method to write a list of students to a file
    public static void writeToFile(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CreateFile.getFileName()))) {
            for (Student student : students) {
                writer.write(student.toFileFormat());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
