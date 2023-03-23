package DesignPatterns.Decorator;

public class NormalCone implements Icecream{
    Icecream ic;

    NormalCone(){}
    NormalCone(Icecream ic){
        this.ic=ic;
    }

    @Override
    public double getCost() {
        if (ic==null) return 0.5;
        return ic.getCost() + 0.5;
    }

    @Override
    public String getDesc() {
        if (ic==null) return "Normal Cone";
        return  ic.getDesc() + "+ Normal Cone";
    }
}
