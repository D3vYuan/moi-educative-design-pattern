package com.design_patterns.structural.composite;

/**
 * Definition
 * The pattern allows you to treat the whole and the individual parts as one.
 * The closest analogy you can imagine is a tree. The tree is a recursive
 * data-structure where each part itself is a sub-tree except for the leaf
 * nodes.
 */
public class Client {
    private static IAlliancePart createCanadaAirForce() {
        return new Airforce();
    }

    private static IAlliancePart createUSAAirForce() {
        return new Airforce();
    }

    public static void main(String[] args) {
        Airforce NatoAllaiance = new Airforce();

        // The nested methods aren't listed for brevity's sake
        NatoAllaiance.add(createCanadaAirForce());
        NatoAllaiance.add(createUSAAirForce());

        F16 frenchF16 = new F16();
        C130Hercules germanCargo = new C130Hercules();

        NatoAllaiance.add(frenchF16);
        NatoAllaiance.add(germanCargo);

        System.out.println(NatoAllaiance.getPersonnel());
    }
}
