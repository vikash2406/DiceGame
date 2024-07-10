import entities.Player;
import interfaces.Dice;
import interfaces.Fighter;
import interfaces.GameRules;
import org.junit.Assert;
import org.junit.Test;
import service.PlayerFighter;
import service.SixSidedDice;
import service.SixSidedDiceGameRules;

public class GameRuleTest {
    @Test
    public void testCalculateDamage() {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        Dice dice = new SixSidedDice();
        Fighter fighter1 = new PlayerFighter(player1, dice);
        Fighter fighter2 = new PlayerFighter(player2, dice);
        GameRules gameRules = new SixSidedDiceGameRules();

        int damage = gameRules.calculateDamage(fighter1, fighter2);
        Assert.assertTrue("Damage should be non-negative",damage >= 0);
    }
}
