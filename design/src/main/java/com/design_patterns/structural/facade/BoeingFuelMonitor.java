package com.design_patterns.structural.facade;

interface IFuelMonitor {
    int getRemainingFuelInGallons();

    void turnOff();
}

public class BoeingFuelMonitor implements IFuelMonitor {

    @Override
    public int getRemainingFuelInGallons() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRemainingFuelInGallons'");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOff'");
    }

}
