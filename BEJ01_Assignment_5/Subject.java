package school;

public class Subject {
    private String name;
    private int grade;

    public Subject(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Method to format subject data for file storage
    public String toFileFormat() {
        return name + ":" + grade;
    }

    // Method to create a subject object from a string read from a file
    public static Subject fromFileFormat(String str) {
        String[] parts = str.split(":");
        return new Subject(parts[0], Integer.parseInt(parts[1]));
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}
