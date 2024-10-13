package org.example.pattern.strategy.kingqueen;

public class Knight extends Character {
    void fight() {
        System.out.print("Knight fighting with : ");
        weaponBehaviour.useWeapon();
    }
}
