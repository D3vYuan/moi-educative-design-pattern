package com.design_patterns.creational.abstract_factory;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Definition
 * The abstract factory pattern is defined as defining an interface to create
 * families of related or dependent objects without specifying their concrete
 * classes.The abstract factory is particularly useful for frameworks and
 * toolkits that work on different operating systems.
 */

public class Client {
    public static void main() {
        // Instantiate a concrete factory for F-16
        F16Factory f16Factory = new F16Factory();

        // Instantiate a concrete factory for Boeing-747
        Boeing747Factory boeing747Factory = new Boeing747Factory();

        // Lets create a list of all our airplanes
        Collection<Aircraft> myPlanes = new ArrayList<>();

        // Create a new F-16 by passing in the f16 factory
        myPlanes.add(new Aircraft(f16Factory));

        // Create a new Boeing-747 by passing in the boeing factory
        myPlanes.add(new Aircraft(boeing747Factory));

        // Fly all your planes
        for (Aircraft aircraft : myPlanes) {
            aircraft.fly();
        }
    }
}
