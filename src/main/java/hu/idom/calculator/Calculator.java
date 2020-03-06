package hu.idom.calculator;

public class Calculator {

    public int add(int number1, int number2) {
        return Math.addExact(number1, number2);
    }

    public int multiply(int number1, int number2) {
        return Math.multiplyExact(number1,number2);
    }

}
