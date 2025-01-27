// creatig a class Bank
public class Bank {
    
    // Attributes
    private String name;

    // Constructor
    public Bank(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    // methods 
    public void openAccount() {
        System.out.println("Account opened in " + name + " bank");
    }
}