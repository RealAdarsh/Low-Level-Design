package DesignPatterns.Decorator;

public class Strawberry implements Icecream{
    Icecream ic;

    Strawberry(Icecream ic){
        this.ic=ic;
    }
    @Override
    public double getCost() {
        return  ic.getCost() + 7;
    }

    @Override
    public String getDesc() {
        return  ic.getDesc() + "+ Strawberry";
    }
}
