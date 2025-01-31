package org.example.lld.observer;

public class MobileDisplay implements Observer {
    @Override
    public void update(String weatherCondition) {
        System.out.println("Updating mobile display weather to " + weatherCondition);

    }
}
