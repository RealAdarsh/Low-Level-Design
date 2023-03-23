package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Components.Button;
import DesignPatterns.AbstractFactory.Components.iosButton;

public class iosFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new iosButton();
    }
}
