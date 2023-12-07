package com.design_patterns.structural.facade;

interface IAltitudeMonitor {
    void autoMonitor();

    void turnOff();
}

public class BoeingAltitudeMonitor implements IAltitudeMonitor {

    @Override
    public void autoMonitor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autoMonitor'");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOff'");
    }

}
