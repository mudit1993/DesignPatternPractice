package org.example.pattern.strategy;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings!!");
    }
}
