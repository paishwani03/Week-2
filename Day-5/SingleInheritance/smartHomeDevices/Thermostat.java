public class Thermostat extends Device {
    String temperatureSetting = "70F";
    String mode = "HEAT";

    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
        System.out.println("Mode: " + mode);
    }
}
