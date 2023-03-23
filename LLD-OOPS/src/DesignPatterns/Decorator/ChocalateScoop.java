package DesignPatterns.Decorator;

public class ChocalateScoop implements Icecream{

    Icecream ic;

    ChocalateScoop(Icecream ic){
        this.ic=ic;
    }

    @Override
    public double getCost() {
        return ic.getCost() + 5;
    }

    @Override
    public String getDesc() {
        return ic.getDesc() + " + Chocalate Scoop" ;
    }
}
