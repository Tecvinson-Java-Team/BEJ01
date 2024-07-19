package filemanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import school.Student;

public class ReadFile {
    // Method to read a list of students from a file
    public static List<Student> readFromFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CreateFile.getFileName()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(Student.fromFileFormat(line));
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
        return students;
    }
}
