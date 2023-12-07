package com.design_patterns.structural.facade;

interface INavigationSystem {
    void setDirectionBasedOnSpeedAndFuel(int speed, int fuel);

    void turnOff();
}

public class BoeingNavigationSystem implements INavigationSystem {

    @Override
    public void setDirectionBasedOnSpeedAndFuel(int speed, int fuel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDirectionBasedOnSpeedAndFuel'");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOff'");
    }

}
