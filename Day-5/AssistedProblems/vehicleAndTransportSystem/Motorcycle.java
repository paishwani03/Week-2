//package Day-5.Assisted Problems.vehicleAndTransportSystem;

public class Motorcycle extends Vehicle {
    int seatCapacity=2;
    String bikeType = "Sports";
    int maxSpeed = 300;
    String fuelType = "Petrol";

    void displayInfo(){
        System.out.println();
        System.out.println("Bike Details:");
        System.out.println("Seat Capacity: "+seatCapacity);
        System.out.println("Bike Type: "+bikeType);
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}
