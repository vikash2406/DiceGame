import entities.Player;
import interfaces.Dice;
import interfaces.Fighter;
import org.junit.Assert;
import org.junit.Test;
import service.PlayerFighter;
import service.SixSidedDice;

public class FighterTest {

    @Test
    public void testFighterAttack() {
        Player player = new Player(50, 5, 10);
        Dice dice = new SixSidedDice();
        Fighter fighter = new PlayerFighter(player, dice);
        int attack = fighter.attack();
        Assert.assertTrue( "Attack should be between 10 and 60", attack >= 10 && attack <= 60);
    }

    @Test
    public void testFighterDefend() {
        Player player = new Player(50, 5, 10);
        Dice dice = new SixSidedDice();
        Fighter fighter = new PlayerFighter(player, dice);
        int defend = fighter.defend();
        Assert.assertTrue("Defend should be between 5 and 30",defend >= 5 && defend <= 30);
    }

    @Test
    public void testFighterTakeDamage() {
        Player player = new Player(50, 5, 10);
        Dice dice = new SixSidedDice();
        Fighter fighter = new PlayerFighter(player, dice);
        fighter.takeDamage(20);
        Assert.assertEquals(30, fighter.getHealth());
    }
}
