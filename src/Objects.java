public class Objects {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setValue1(7);
        calc.setValue2(14);
        calc.subtraction();
        System.out.println(calc.getResult());
    }
}
