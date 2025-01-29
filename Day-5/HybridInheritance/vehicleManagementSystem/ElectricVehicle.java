// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging electric vehicle: " + model);
    }
}
