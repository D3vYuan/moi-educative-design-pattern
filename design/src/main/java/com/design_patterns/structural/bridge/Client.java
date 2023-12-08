package com.design_patterns.structural.bridge;

/**
 * Definition
 * The bridge pattern describes how to pull apart two software layers fused
 * together in a single class hierarchy and change them into parallel class
 * hierarchies connected by a bridge
 */
public class Client {
    public static void main(String[] args) {
        AbstractCorolla myCorolla = new Corolla_L(new Corolla_L_Impl_AsiaPacific());
        System.out.println(myCorolla.isCarRightHanded());

        myCorolla.setCorollaImpl(new Corolla_L_Impl_NorthAmerica());
        System.out.println(myCorolla.isCarRightHanded());
    }
}
