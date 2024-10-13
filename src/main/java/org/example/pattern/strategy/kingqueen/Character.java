package org.example.pattern.strategy.kingqueen;

public abstract class Character {
    protected WeaponBehaviour weaponBehaviour;
    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    void fight() {
    }
}
