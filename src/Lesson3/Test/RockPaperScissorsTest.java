package Lesson3.Test;

import Lesson3.Task3.ComputerValue;
import Lesson3.Task3.Game;
import Lesson3.Task3.PlayerValue;
import Lesson3.Task3.Values;
import org.junit.Test;
import org.junit.runner.Computer;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
    public void getValue() {
        PlayerValue pv = new PlayerValue();
        pv.setPlayerValue("камень");
        assertEquals(Values.ROCK, pv.getPlayerValue());
        pv.setPlayerValue("бумага");
        assertEquals(Values.PAPER, pv.getPlayerValue());
        pv.setPlayerValue("ножницы");
        assertEquals(Values.SCISSORS, pv.getPlayerValue());

        ComputerValue cv = new ComputerValue();
        cv.setComputerValue("камень");
        assertEquals(Values.ROCK, cv.getComputerValue());
        cv.setComputerValue("бумага");
        assertEquals(Values.PAPER, cv.getComputerValue());
        cv.setComputerValue("ножницы");
        assertEquals(Values.SCISSORS, cv.getComputerValue());
    }

    @Test
    public void checkWhoWinTest() {
        Game game = new Game();
        PlayerValue pv = new PlayerValue();
        ComputerValue cv = new ComputerValue();
        pv.setPlayerValue("камень");
        cv.setComputerValue("ножницы");
        assertEquals(1,game.checkWhoWin());
    }
}
