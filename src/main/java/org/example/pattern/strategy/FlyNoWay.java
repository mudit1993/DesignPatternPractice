package org.example.pattern.strategy;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Not able to fly!");
    }
}
