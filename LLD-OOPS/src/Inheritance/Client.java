package Inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor i=new Instructor();
        i.username="Adarsh";
        i.login();
        i.BatchName="ABC";
        i.avgRating=5;
        i.ScheduleClass();
    }
}
