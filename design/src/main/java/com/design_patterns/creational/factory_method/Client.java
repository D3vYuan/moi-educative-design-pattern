package com.design_patterns.creational.factory_method;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Definition
 * The factory method is defined as providing an interface for object creation
 * but delegating the actual instantiation of objects to subclasses.
 */
public class Client {
    public void main() {
        Collection<F16> myAirForce = new ArrayList<F16>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        myAirForce.add(f16A);
        myAirForce.add(f16B);

        for (F16 f16 : myAirForce) {
            f16.fly();
        }
    }
}
