package DesignPatterns.AbstractFactory.Components;

public class androidButton implements Button{
    @Override
    public void ChangeSize() {
        System.out.println("Android Size Changed");
    }
}
