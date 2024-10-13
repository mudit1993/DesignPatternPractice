package org.example.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.performFly();
        mallardDuck.setFlyBehaviour(new FlyNoWay());
        mallardDuck.setQuackBehaviour(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehaviour(new FlyNoWay());
        rubberDuck.setQuackBehaviour(new Squeak());
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
    }
}