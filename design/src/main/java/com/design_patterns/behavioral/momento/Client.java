package com.design_patterns.behavioral.momento;

/**
 * Definition
 * The memento pattern let's us capture the internal state of an object without
 * exposing its internal structure so that the object can be restored to this
 * state later
 * 
 */
public class Client {
    public void main(BlackBox blackBox) throws Exception {

        // Save the state of the memento as a byte stream.
        byte[] memento = blackBox.getState();

        // Do some work.

        // Now restore the blackbox to the previous state
        blackBox = blackBox.setState(memento);

    }
}
