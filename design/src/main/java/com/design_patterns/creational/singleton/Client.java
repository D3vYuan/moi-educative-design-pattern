package com.design_patterns.creational.singleton;

public class Client {
    public void main() {
        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();
    }
}
