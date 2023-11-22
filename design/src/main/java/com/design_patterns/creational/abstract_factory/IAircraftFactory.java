package com.design_patterns.creational.abstract_factory;

public interface IAircraftFactory {
    IEngine createEngine();

    IWings createWings();

    ICockpit createCockpit();
}
