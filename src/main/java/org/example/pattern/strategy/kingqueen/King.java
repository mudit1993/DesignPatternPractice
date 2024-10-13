package org.example.pattern.strategy.kingqueen;

public class King extends Character {
    void fight() {
        System.out.print("King fighting with : ");
        weaponBehaviour.useWeapon();
    }
}
