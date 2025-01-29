//package Day-5.Assisted Problems.employeeManagementSystem;

public class Manager extends Employee {
    int teamSize = 10;
    String name = "James";
    int id = 102;
    int salary = 60000;

    void dispalyDetails() {
        System.out.println();
        System.out.println("Details of Manager : ");    
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
    }
}
