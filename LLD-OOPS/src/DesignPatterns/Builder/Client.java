package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder= new Builder();
//        builder.setName("Adarsh");
//        builder.setGrade("A");
//        //builder.setPhoneNo("782893");
//        builder.setRollNo(7);
//        Student st= new Student(builder);

        Student st= Student.createBuilder()
                        .setGrade("A")
                .setName("Adarsh")
                .setRollNo(7)
                .setPhoneNo("77181").getStudent();
    }
}
