package DesignPatterns.Prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    IntelligentStudent(){
        super();
    }
    IntelligentStudent(IntelligentStudent st){
        super(st);
        this.iq=st.iq;
    }

    public IntelligentStudent Clone(){
        return new IntelligentStudent(this);
    }
}
