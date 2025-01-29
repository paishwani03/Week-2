//package Day-5.Assisted Problems.vehicleAndTransportSystem;

public class Main {
    //Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[4];
    vehicles[0] = new Vehicle();
    vehicles[1] = new Motorcycle();
    vehicles[2] = new Car();
    vehicles[3] = new Truck();

    for (Vehicle vehicle : vehicles) {
        vehicle.displayInfo();
    }
}
}
