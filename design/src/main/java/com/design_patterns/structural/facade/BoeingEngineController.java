package com.design_patterns.structural.facade;

interface IEngineController {
    void setEngineSpeed(int speed);

    int getEngineSpeed();

    void turnOff();
}

public class BoeingEngineController implements IEngineController {

    @Override
    public void setEngineSpeed(int speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEngineSpeed'");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOff'");
    }

    @Override
    public int getEngineSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEngineSpeed'");
    }

}
