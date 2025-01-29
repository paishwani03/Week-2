// Main class
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Emma", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
