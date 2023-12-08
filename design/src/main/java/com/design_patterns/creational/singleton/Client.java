package com.design_patterns.creational.singleton;

/**
 * Defintion
 * The singleton pattern is applied to restrict instantiation of a class to only
 * one instance
 */
public class Client {
    public void main() {
        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();
    }
}
