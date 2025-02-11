class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 50;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: $50";
    }
}