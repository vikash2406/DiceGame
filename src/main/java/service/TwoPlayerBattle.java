package service;

import interfaces.Battle;
import interfaces.Fighter;
import interfaces.GameRules;

public class TwoPlayerBattle implements Battle {

    private final Fighter fighter1;
    private final Fighter fighter2;
    private final GameRules gameRules;
    private Fighter winner;

    public TwoPlayerBattle(Fighter fighter1, Fighter fighter2, GameRules gameRules) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.gameRules = gameRules;
    }

    public void startFight() {
        Fighter attacker = fighter1.getHealth() < fighter2.getHealth() ? fighter1 : fighter2;
        Fighter defender = attacker == fighter1 ? fighter2 : fighter1;

        while (attacker.isAlive() && defender.isAlive()) {
            int damage = gameRules.calculateDamage(attacker, defender);
            defender.takeDamage(damage);

            if (!defender.isAlive()) {
                winner = attacker;
                return;
            }

            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }
    public Fighter getWinner() {
        return winner;
    }
}
