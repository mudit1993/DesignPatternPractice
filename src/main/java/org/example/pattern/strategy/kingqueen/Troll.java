package org.example.pattern.strategy.kingqueen;

public class Troll extends Character {
    void fight() {
        System.out.print("Troll fighting with : ");
        weaponBehaviour.useWeapon();
    }
}
