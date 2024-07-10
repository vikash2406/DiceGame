import entities.Player;
import interfaces.Battle;
import interfaces.Dice;
import interfaces.Fighter;
import interfaces.GameRules;
import service.PlayerFighter;
import service.SixSidedDice;
import service.SixSidedDiceGameRules;
import service.TwoPlayerBattle;

public class Arena {

    public static void gameStart(Player playerA, Player playerB) {
        Dice dice = new SixSidedDice();
        Fighter fighterA = new PlayerFighter(playerA, dice);
        Fighter fighterB = new PlayerFighter(playerB, dice);
        GameRules gameRules = new SixSidedDiceGameRules();
        Battle battle = new TwoPlayerBattle(fighterA, fighterB, gameRules);

        battle.startFight();
        Fighter winner = battle.getWinner();
        if (winner != null) {
            System.out.printf("Player %s wins!\n", winner == fighterA ? "A" : "B");
        } else {
            System.out.println("The battle ended in a draw.");
        }
    }
}
