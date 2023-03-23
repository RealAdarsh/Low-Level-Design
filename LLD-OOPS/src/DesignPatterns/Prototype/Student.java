package DesignPatterns.Prototype;

public class Student {
    private String name;
    private int rollNo;
    private String batch_name;
    private int batchPsp;

    Student(){

    }

    Student (Student student){
        this.name=student.name;
        this.rollNo=student.rollNo;
        this.batch_name= student.batch_name;
        this.batchPsp=student.batchPsp;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public int getBatchPsp() {
        return batchPsp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

    public void setBatchPsp(int batchPsp) {
        this.batchPsp = batchPsp;
    }

    Student Clone(){
       return new Student(this);
    }
}
