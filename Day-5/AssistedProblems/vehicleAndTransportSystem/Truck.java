//package Day-5.Assisted Problems.vehicleAndTransportSystem;

public class Truck extends Vehicle {
    int seatCapacity=3;
    String truckType = "Heavy";
    int maxSpeed = 100;
    String fuelType = "Diesel";

    void displayInfo(){
        System.out.println();
        System.out.println("Truck Details:");
        System.out.println("Seat Capacity: "+seatCapacity);
        System.out.println("Truck Type: "+truckType);
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}
