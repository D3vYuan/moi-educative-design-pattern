package com.design_patterns.behavioral.chain_of_responsibility;

/**
 * Definition
 * In a chain of responsibility pattern implementation, the sender's request is
 * passed down a series of handler objects till one of those objects, handles
 * the request or it remains unhandled and falls off the chain. Multiple objects
 * are given a chance to handle the request. This allows us to decouple the
 * sender and the receiver of a request
 */
public class Client {
    public static void main(String[] args) {
        // Setup the chain like so:
        // FireHandler --> LowFuelHandler --> null
        // The chain has just two handlers with the firstHandler
        // at the head of the chain.
        AbstractHandler lowFuelHandler = new LowFuelHandler(null);
        FireHandler fireHandler = new FireHandler(lowFuelHandler);

        // Create a emergency request that the airplane is running low
        // on fuel.
        LowFuelRequest lowFuelRequest = new LowFuelRequest();

        // Let the chain handle the request
        fireHandler.handleRequest(lowFuelRequest);
    }
}
