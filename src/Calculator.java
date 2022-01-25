public class Calculator {
    int value1;
    int value2;
    int result;


    Calculator () {

    }

    Calculator (int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }


    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void addition(){
        this.result = value1+value2;
    }
    public void subtraction(){
        this.result = value1-value2;
    }
    public void multiplication(){
        this.result = value1*value2;
    }
    public void division(){
        this.result = value1/value2;
    }
    public int getResult(){
        return result;
    }

}
