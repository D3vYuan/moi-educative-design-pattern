package com.design_patterns.structural.decorator;

/**
 * Definition
 * The decorator pattern can be thought of as a wrapper or more formally a way
 * to enhance or extend the behavior of an object dynamically. The pattern
 * provides an alternative to subclassing when new functionality is desired
 */
public class Client {
    public static void main(String[] args) {
        IAircraft simpleBoeing = new Boeing747();
        IAircraft luxuriousBoeing = new LuxuryFittings(simpleBoeing);
        IAircraft bulletProofBoeing = new BulletProof(luxuriousBoeing);
        float netWeight = bulletProofBoeing.getWeight();
        System.out.println("Final weight of the plane: " + netWeight);
    }
}
