package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Components.Button;
import DesignPatterns.AbstractFactory.Components.androidButton;

public class AndoridFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new androidButton();
    }
}
