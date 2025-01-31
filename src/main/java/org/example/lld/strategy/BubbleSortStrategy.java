package org.example.lld.strategy;

import java.util.List;

public class BubbleSortStrategy implements ISortingStrategy{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Using buuble sort method to sort numbers");
    }
}
