package com.design_patterns.behavioral.visitor;

import java.util.Iterator;

/**
 * Defintion
 * The visitor pattern allows us to define an operation for a class or a class
 * hierarchy without changing the classes of the elements on which the operation
 * is performed. The pattern is suitable in scenarios, where the object
 * structure class or the classes that make up its elements don't change often
 * but new operations over the object structure are desired
 */
public class Client {
    public static void main(Airforce airforce) {
        Iterator<IAircraft> planes = airforce.getIterator();
        MetricsVisitor aircraftVisitor = new MetricsVisitor();

        while (planes.hasNext()) {
            planes.next().accept(aircraftVisitor);
        }

        aircraftVisitor.printAccumulatedResults();
    }
}
