package Inheritance;

public class Instructor extends User {
    String BatchName;
    double avgRating;

    Instructor(){
        System.out.println("Instructor called");
    }
    void ScheduleClass(){
        System.out.println("Class is Scheduled");
    }
}
