package com.design_patterns.behavioral.strategy;

public class Context {
    private ISort sortStrategy;

    public Context(ISort sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // Context receives the data from its client
    // and passes it on to the strategy object.
    void sort(int[] numbers) {
        sortStrategy.sort(numbers);
    }

    // We can change the sorting algorithm using this setter
    public void setSortStrategy(ISort sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
