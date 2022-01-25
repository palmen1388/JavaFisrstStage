import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void getValue1() {
        Calculator calc = new Calculator();
        calc.setValue1(10);
        assertEquals(10, calc.getValue1());
    }

    @Test
    public void setValue1() {
        Calculator calc = new Calculator();
        calc.setValue1(10);
        assertEquals(10, calc.getValue1());
    }

    @Test
    public void getValue2() {
        Calculator calc = new Calculator();
        calc.setValue2(15);
        assertEquals(15, calc.getValue2());
    }

    @Test
    public void setValue2() {
        Calculator calc = new Calculator();
        calc.setValue2(15);
        assertEquals(15, calc.getValue2());
    }

    @Test
    public void addition() {
        Calculator calc = new Calculator(7, 4);
        calc.addition();
        assertEquals(11, calc.getResult());
    }

    @Test
    public void subtraction() {
        Calculator calc = new Calculator(7, 4);
        calc.subtraction();
        assertEquals(3, calc.getResult());
    }

    @Test
    public void multiplication() {
        Calculator calc = new Calculator(7, 4);
        calc.multiplication();
        assertEquals(28, calc.getResult());
    }

    @Test
    public void division() {
        Calculator calc = new Calculator(8, 4);
        calc.division();
        assertEquals(2, calc.getResult());
    }

    @Test
    public void getResult() {
        Calculator calc = new Calculator(7, 4);
        calc.addition();
        assertEquals(11, calc.getResult());
    }
}