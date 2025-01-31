package org.example.lld.observer;

public class TvDisplay implements Observer{
    @Override
    public void update(String weatherCondition) {
        System.out.println("Updating tv display weather to " + weatherCondition);
    }
}
