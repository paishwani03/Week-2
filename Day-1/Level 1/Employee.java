// Class representing an Employee
public class Employee {
    // Private fields for encapsulation
    private String name;
    private char id;
    private double salary;

    // Constructor to initialize employee attributes
    public Employee(String name, char id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Smith",'A', 75000.60);
        // Displaying employee details
        emp.displayDetails();
    }
}

