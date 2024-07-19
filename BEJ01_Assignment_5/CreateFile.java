package filemanager;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    private static final String FILE_NAME = "students.txt";

    // Method to create the file if it doesn't exist
    public static void createFile() {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    public static String getFileName() {
        return FILE_NAME;
    }
}
