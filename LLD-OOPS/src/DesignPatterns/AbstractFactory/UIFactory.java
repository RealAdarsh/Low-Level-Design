package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Components.Button;

public interface UIFactory {
    Button createButton();
}
