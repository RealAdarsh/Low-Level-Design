package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Components.platform;

public class Flutter {
    void setRefreshRate(){}
    void setTheme(){}

    UIFactory createFactory(platform pf){
        if (pf.equals(platform.Andorid)){
            return new AndoridFactory();
        }
        else if (pf.equals(platform.ios)){
            return new iosFactory();
        }
        else {
            return null;
        }
    }
}
