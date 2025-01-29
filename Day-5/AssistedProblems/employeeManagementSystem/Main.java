//package Day-5.Assisted Problems.employeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.dispalyDetails();
        
        Manager manager = new Manager();
        manager.dispalyDetails();
        
        Developer developer = new Developer();
        developer.dispalyDetails();
        
        Intern intern = new Intern();
        intern.dispalyDetails();
    }
}
