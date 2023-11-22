package com.design_patterns.creational.abstract_factory;

public class Boeing747Engine implements IEngine {

    @Override
    public void start() {
        System.out.println("Boeing747 engine on");
    }
}