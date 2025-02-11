class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() * 1.5; // Trucks have higher rental cost
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: $500";
    }
}

