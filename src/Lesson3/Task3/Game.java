package Lesson3.Task3;

public class Game {
    private PlayerValue playerValue = new PlayerValue();
    private ComputerValue computerValue = new ComputerValue();


    public Game() {

    }

    public int checkWhoWin() {
        if (playerValue.getPlayerValue().equals(Values.ROCK)) {
            return (computerValue.getComputerValue().equals(Values.SCISSORS) ? 1 : -1);
        }
        if (playerValue.getPlayerValue().equals(Values.PAPER)) {
            return (computerValue.getComputerValue().equals(Values.ROCK) ? 1 : -1);
        }
        if (playerValue.getPlayerValue().equals(Values.SCISSORS)) {
            return (computerValue.getComputerValue().equals(Values.PAPER) ? 1 : -1);
        }
        return 0;
    }

    public void playGame() {
        if (this.checkWhoWin() == -1) {
            System.out.println("Вы проиграли, компьютер выбрал " + computerValue);
        }
        if (this.checkWhoWin() == 1) {
            System.out.println("Вы выиграли, компьютер выбрал " + computerValue);
        } else {
            System.out.println("У вас ничья, компьютер выбрал " + computerValue);
        }

    }
}
