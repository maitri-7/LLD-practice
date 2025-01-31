package org.example.lld.strategy;

import java.util.List;

public class MergeSortStrategy implements ISortingStrategy{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Using merge sort method to sort numbers");
    }
}
