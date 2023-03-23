package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Icecream ic= new ChocalateScoop(new ChocalateCone(new Strawberry(new ChocalateCone())))
                ;

        System.out.println(ic.getCost());
        System.out.println(ic.getDesc());
    }
}
