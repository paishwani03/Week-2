// Class representing a Student
public class Student {
    // Private fields for encapsulation
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize student attributes
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Alice", 101, 85.5);

        // Displaying student details
        student.displayDetails();
    }
}

