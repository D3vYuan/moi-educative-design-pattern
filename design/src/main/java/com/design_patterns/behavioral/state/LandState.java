package com.design_patterns.behavioral.state;

public class LandState implements IPilotActions {
    F16 f16;

    // Notice, how the state class is composed with the context object
    public LandState(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotTaxies(F16 f16) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pilotTaxies'");
    }

    @Override
    public void pilotFlies(F16 f16) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pilotFlies'");
    }

    @Override
    public void pilotEjects(F16 f16) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pilotEjects'");
    }

    @Override
    public void pilotLands(F16 f16) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pilotLands'");
    }

    @Override
    public void pilotParks(F16 f16) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pilotParks'");
    }

}
