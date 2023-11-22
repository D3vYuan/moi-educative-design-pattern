package com.design_patterns.creational.abstract_factory;

class Boeing747Wings implements IWings {

}

class Boeing747Cockpit implements ICockpit {

}

public class Boeing747Factory implements IAircraftFactory {

    @Override
    public IEngine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public IWings createWings() {
        return new Boeing747Wings();
    }

    @Override
    public ICockpit createCockpit() {
        return new Boeing747Cockpit();
    }

}
