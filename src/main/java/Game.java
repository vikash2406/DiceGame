import entities.Player;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player A's health:");
        int healthA = scanner.nextInt();
        System.out.println("Enter Player A's strength:");
        int strengthA = scanner.nextInt();
        System.out.println("Enter Player A's attack:");
        int attackA = scanner.nextInt();

        System.out.println("Enter Player B's health:");
        int healthB = scanner.nextInt();
        System.out.println("Enter Player B's strength:");
        int strengthB = scanner.nextInt();
        System.out.println("Enter Player B's attack:");
        int attackB = scanner.nextInt();
        Player playerA = new Player(healthA, strengthA, attackA);
        Player playerB = new Player(healthB, strengthB, attackB);

        Arena.gameStart(playerA, playerB);
    }
}
