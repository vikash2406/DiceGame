import interfaces.Dice;
import org.junit.Assert;
import org.junit.Test;
import service.SixSidedDice;

public class DiceTest {
    @Test
    public void testRoll() {
        Dice dice = new SixSidedDice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            Assert.assertTrue("Dice roll should be between 1 and 6",roll >= 1 && roll <= 6);
        }
    }
}
