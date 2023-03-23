package DesignPatterns.Decorator;

public class ChocalateCone implements Icecream{
    Icecream ic;

    ChocalateCone(){}
    ChocalateCone(Icecream ic){
        this.ic=ic;
    }

    @Override
    public double getCost() {
        if (ic==null) return 1;
        return ic.getCost()  +1;
    }

    @Override
    public String getDesc() {
        if (ic==null) return "Chocalte Cone";
        return ic.getDesc()  + "+ Chocalate Cone";
    }
}
