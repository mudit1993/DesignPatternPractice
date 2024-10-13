package org.example.pattern.strategy.kingqueen;

public class Queen extends Character {
    void fight() {
        System.out.print("Queen fighting with : ");
        weaponBehaviour.useWeapon();
    }
}
