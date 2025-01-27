//package employeeManagementSystem;

public class Developer extends Employee {
    String programmingLanguage="Java";
    String name = "Jen";
    int id = 103;
    int salary = 70000;

    void dispalyDetails() {
        System.out.println();
        System.out.println("Details of Developer : ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
