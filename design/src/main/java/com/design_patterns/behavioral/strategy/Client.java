package com.design_patterns.behavioral.strategy;

/**
 * Defintion
 * The pattern allows grouping related algorithms under an abstraction, which
 * the client codes against. The abstraction allows switching out one algorithm
 * or policy for another without modifying the client.
 */
public class Client {
    private int[] numbers = new int[1000];

    void crunchingNumbers() {

        // Choose the sorting strategy
        BubbleSort bubbleSort = new BubbleSort();

        // Context receives the strategy object
        Context context = new Context(bubbleSort);

        // Sort the numbers
        context.sort(numbers);

        // Do remaining work
    }
}
