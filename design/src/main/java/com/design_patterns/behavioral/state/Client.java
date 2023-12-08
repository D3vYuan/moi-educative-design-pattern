package com.design_patterns.behavioral.state;

/**
 * Definition
 * The state pattern encapsulates the various states a machine can be in. The
 * machine or the context, as it is called in pattern-speak, can have actions
 * taken on it that propel it into different states. Without the use of the
 * pattern, the code becomes inflexible and littered with if-else conditionals.
 * 
 */
public class Client {
    public static void main(String[] args) {
        F16 f16 = new F16();
        f16.startsEngine();
        f16.fliesPlane();
        f16.ejectsPlane();
    }
}
