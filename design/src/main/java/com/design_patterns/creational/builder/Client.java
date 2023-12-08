package com.design_patterns.creational.builder;

/**
 * Definition
 * 
 * The builder pattern is used to create objects. It seperates out how the
 * object is represented and how it is created. Additionally, it breaks down the
 * creation into multiple steps.
 */
public class Client {
    public void main() {

        F16Builder f16Builder = new F16Builder();
        Director director = new Director(f16Builder);
        director.construct(false);

        IAircraft f16 = f16Builder.getResult();
    }
}
