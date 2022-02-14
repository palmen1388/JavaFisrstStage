package Lesson3.Task3;

public class PlayerValue {
    private String playerValue;

    public PlayerValue() {

    }

    public void setPlayerValue(String playerValue) {
        this.playerValue = playerValue;

    }

    public Values getPlayerValue() {
        Values[] values = Values.values();
        if (playerValue.equalsIgnoreCase("камень")) {
            return Values.ROCK;
        }
        if (playerValue.equalsIgnoreCase("бумага")) {
            return Values.PAPER;
        }
        return Values.SCISSORS;
    }
}
