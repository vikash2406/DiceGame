import entities.Player;
import org.junit.Assert;
import org.junit.Test;


public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        Assert.assertEquals(50, player.getHealth());
        Assert.assertEquals(5, player.getStrength());
        Assert.assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerAlive() {
        Player player = new Player(50, 5, 10);
        Assert.assertTrue(player.isAlive());
        player.setHealth(0);
        Assert.assertFalse(player.isAlive());
    }
}
