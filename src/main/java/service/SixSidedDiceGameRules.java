package service;

import interfaces.Fighter;
import interfaces.GameRules;

public class SixSidedDiceGameRules implements GameRules {

    public int calculateDamage(Fighter attacker, Fighter defender) {
        int attackValue = attacker.attack();
        int defenseValue = defender.defend();
        return Math.max(0, attackValue - defenseValue);
    }
}
