import entities.Player;

public class Game {

    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena.gameStart(playerA, playerB);
    }
}
