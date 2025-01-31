package org.example.lld.strategy;

import java.util.List;

//context class
public class Sorter {
    private ISortingStrategy strategy;

    public Sorter(ISortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ISortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortNumbers(List<Integer> numbers) {
        strategy.sort(numbers);
    }
}
