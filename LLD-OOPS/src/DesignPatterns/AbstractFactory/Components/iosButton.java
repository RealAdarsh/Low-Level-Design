package DesignPatterns.AbstractFactory.Components;

public class iosButton implements Button{
    @Override
    public void ChangeSize() {
        System.out.println("IOS Button Changed");
    }
}
