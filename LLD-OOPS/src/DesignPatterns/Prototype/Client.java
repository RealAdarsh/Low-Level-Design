package DesignPatterns.Prototype;

public class Client {
    public static void insertRegistery(StudentRegistery studentRegistery){
        Student st=new Student();
        st.setBatch_name("Academy March");
        st.setBatchPsp(56);
        studentRegistery.register("March", st);

        IntelligentStudent st2=new IntelligentStudent();
        st2.setBatch_name("Academy April");
        st2.setBatchPsp(56);
        st2.setIq(180);
        studentRegistery.register("April", st2);

    }
    public static void main(String[] args) {
        StudentRegistery sr= new StudentRegistery();
        insertRegistery(sr);

        Student st1= sr.get("April").Clone();
        st1.setName("Adarsh");
        st1.setRollNo(5);



    }
}
