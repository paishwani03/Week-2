// Subclass of OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayPaidCourseInfo() {
        displayOnlineCourseInfo();
        double discountedFee = fee - (fee * discount / 100);
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%, Final Fee: $" + discountedFee);
    }
}
