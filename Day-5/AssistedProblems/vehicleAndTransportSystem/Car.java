//package Day-5.Assisted Problems.vehicleAndTransportSystem;

public class Car extends Vehicle {
    int seatCapacity=4;
    String carType = "Sedan";
    int maxSpeed = 200;
    String fuelType = "Petrol";

    void displayInfo(){
        System.out.println();
        System.out.println("Car Details:");
        System.out.println("Seat Capacity: "+seatCapacity);
        System.out.println("Car Type: "+carType);
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}
