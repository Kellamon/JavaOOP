package org.example.Ex2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Addition addition = new Addition(1, 2);
        calculator.calculateSwitch(addition);
        System.out.println(addition.getResult());
    }
}
