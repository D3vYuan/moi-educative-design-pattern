package com.design_patterns.creational.prototype;

/**
 * Definition
 * Prototype pattern involves creating new objects by copying existing objects.
 * The object whose copies are made is called the prototype
 */
public class Client {
    public void main() {

        IAircraftPrototype prototype = new F16();

        // Create F16-A
        IAircraftPrototype f16A = prototype.clone();
        f16A.setEngine(new F16AEngine());

        // Create F16-B
        IAircraftPrototype f16B = prototype.clone();
        f16B.setEngine(new F16BEngine());
    }
}
