package Lesson3.Task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        ComputerValue computerValue = new ComputerValue();
        computerValue.setComputerValue(scanner.nextLine());
        PlayerValue playerValue = new PlayerValue();
        playerValue.setPlayerValue(scanner.nextLine());
        game.playGame();
    }
}
