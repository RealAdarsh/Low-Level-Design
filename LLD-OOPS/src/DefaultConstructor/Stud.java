package DefaultConstructor;

public class Stud {
    int rollNo;
    String Name;

    // default Constructor modified
    Stud(){
        rollNo=0;
        Name=null;
    }

    // parameterized constructor

    Stud(int roll, String name){
        rollNo=roll;
        Name=name;
    }

    // constructor overloaded

    Stud(int roll){
        rollNo=roll;
    }
}
