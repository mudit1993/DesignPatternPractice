package org.example.pattern.strategy.kingqueen;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> characters = List.of(new King(), new Queen(), new Troll(), new Knight());
        characters.get(0).setWeaponBehaviour(new BowAndArrowBehaviour());
        characters.get(1).setWeaponBehaviour(new KnifeBehaviour());
        characters.get(2).setWeaponBehaviour(new AxeBehaviour());
        characters.get(3).setWeaponBehaviour(new SwordBehaviour());
        characters.stream().forEach(character -> character.fight());
        characters.get(3).setWeaponBehaviour(new BowAndArrowBehaviour());
        characters.get(0).setWeaponBehaviour(new SwordBehaviour());
        characters.get(1).setWeaponBehaviour(new SwordBehaviour());
        characters.stream().forEach(character -> character.fight());
    }
}