package Lesson3.Task3;

public class ComputerValue {
    private String computerValue;

    public ComputerValue() {

    }

    public void setComputerValue(String playerValue) {
        this.computerValue = playerValue;

    }

    public Values getComputerValue() {
        Values[] values = Values.values();
        if (computerValue.equalsIgnoreCase("камень")) {
            return Values.ROCK;
        }
        if (computerValue.equalsIgnoreCase("бумага")) {
            return Values.PAPER;
        }
        return Values.SCISSORS;
    }
}
