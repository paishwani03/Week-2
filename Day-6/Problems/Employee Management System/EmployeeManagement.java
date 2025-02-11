class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(1, "Alice", 5000);
        Employee emp2 = new PartTimeEmployee(2, "Bob", 0, 20, 25);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}