//package Day-5.Assisted Problems.employeeManagementSystem;

public class Intern extends Employee {
    String name = "Jill";
    int id = 104;
    int stipend = 30000;
    int durationInMonths = 6;

    void dispalyDetails() {
        System.out.println();
        System.out.println("Details of Intern : ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Stipend: " + stipend);
        System.out.println("Duration in Months: " + durationInMonths);
    }
}
