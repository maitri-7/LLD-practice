package org.example.lld.strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyRunner {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 8, 1);

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sortNumbers(numbers);

        // Switch to a different strategy
        sorter.setStrategy(new MergeSortStrategy());
        sorter.sortNumbers(numbers);
    }
}
