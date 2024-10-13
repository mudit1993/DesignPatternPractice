package org.example.pattern.strategy;

public abstract class Duck {

    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    void display() {
        System.out.println("No Duck");
    }

    void swim() {
        System.out.println("No Swim");
    }

    void performFly() {
        flyBehaviour.fly();
    }

    void performQuack() {
        quackBehaviour.quack();
    }

    void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
