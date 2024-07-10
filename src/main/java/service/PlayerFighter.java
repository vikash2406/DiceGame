package service;

import entities.Player;
import interfaces.Dice;
import interfaces.Fighter;

public class PlayerFighter implements Fighter {
    private final Player player;
    private final Dice dice;

    public PlayerFighter(Player player, Dice dice) {
        this.player = player;
        this.dice = dice;
    }


    public int attack() {
        return player.getAttack() * dice.roll();
    }


    public int defend() {
        return player.getStrength() * dice.roll();
    }


    public void takeDamage(int damage) {
        player.setHealth(player.getHealth() - damage);
    }

    public boolean isAlive() {
        return player.isAlive();
    }

    public int getHealth() {
        return player.getHealth();
    }

}
