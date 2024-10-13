package org.example.pattern.strategy;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Mute Quack!!");
    }
}
