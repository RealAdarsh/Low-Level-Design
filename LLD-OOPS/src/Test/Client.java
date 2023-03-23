package Test;

public class Client {
    public static void main(String[] args) {
        Parent p=new Child();
        System.out.println(p.data);
        p.fun();
    }
}
