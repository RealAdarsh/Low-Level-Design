package DesignPatterns.Builder;

import java.util.InputMismatchException;

public class Student {

    private int rollNo;
    private String name;
    private String grade;
    private String phoneNo;

    private Student(Builder builder){
        // verification
        if (rollNo > 100) {
            throw new InputMismatchException("Wrong");
        }

        rollNo= builder.getRollNo();
        name=builder.getName();
        grade=builder.getGrade();
        phoneNo=builder.getPhoneNo();
    }

    public static Builder createBuilder(){
        return new Builder();
    }

    public static class Builder {
        private int rollNo;
        private String name;
        private String grade;
        private String phoneNo;

        public Builder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public Student getStudent(){
            Student student= new Student(this);
            return student;
        }
    }

}
