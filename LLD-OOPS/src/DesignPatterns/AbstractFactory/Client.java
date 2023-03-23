package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Components.Button;
import DesignPatterns.AbstractFactory.Components.platform;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UIFactory uiFactory=flutter.createFactory(platform.ios);
        Button button=uiFactory.createButton();
        button.ChangeSize();
    }
}
