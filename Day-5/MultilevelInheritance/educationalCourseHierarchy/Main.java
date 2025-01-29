// Main class
public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Basics", 40);
        course.displayCourseInfo();

        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 60, "Udemy", true);
        onlineCourse.displayOnlineCourseInfo();

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Spring Framework", 80, "Coursera", true, 200, 15);
        paidOnlineCourse.displayPaidCourseInfo();
    }
}
