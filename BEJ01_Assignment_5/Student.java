package school;

import java.util.concurrent.atomic.AtomicInteger;

public class Student implements Comparable<Student> {
    private static final String SCHOOL_NAME = "Tecvinson Primary School";
    private static final AtomicInteger count = new AtomicInteger(0); // for generating unique IDs
    private int id;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String studentClass;
    private Subject[] subjects;

    public Student() {
        this.id = count.incrementAndGet(); // auto-generate unique ID
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    // Method to calculate the average grade of the student
    public double getAverageGrade() {
        double sum = 0;
        for (Subject subject : subjects) {
            sum += subject.getGrade();
        }
        return sum / subjects.length;
    }

    // Method to compare students based on their average grades
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.getAverageGrade(), this.getAverageGrade());
    }

    // Method to format student data as a string for file storage
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "School: " + SCHOOL_NAME + "\n" +
                "Name: " + firstName + " " + lastName + ", DOB: " + dob + ", Gender: " + gender +
                ", Class: " + studentClass + ", Average Grade: " + getAverageGrade();
    }

    // Method to format student data for file storage
    public String toFileFormat() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(",").append(firstName).append(",").append(lastName).append(",").append(dob).append(",").append(gender).append(",").append(studentClass);
        for (Subject subject : subjects) {
            sb.append(",").append(subject.toFileFormat());
        }
        return sb.toString();
    }

    // Method to create a student object from a string read from a file
    public static Student fromFileFormat(String line) {
        String[] parts = line.split(",");
        Student student = new Student();
        student.id = Integer.parseInt(parts[0]);
        student.setFirstName(parts[1]);
        student.setLastName(parts[2]);
        student.setDob(parts[3]);
        student.setGender(parts[4]);
        student.setStudentClass(parts[5]);

        Subject[] subjects = new Subject[parts.length - 6];
        for (int i = 6; i < parts.length; i++) {
            subjects[i - 6] = Subject.fromFileFormat(parts[i]);
        }
        student.setSubjects(subjects);
        return student;
    }

    // Getter for school name
    public static String getSchoolName() {
        return SCHOOL_NAME;
    }
}
