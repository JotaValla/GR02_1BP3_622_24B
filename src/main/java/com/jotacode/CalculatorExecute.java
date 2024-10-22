package com.jotacode;

public class CalculatorExecute {

    public static void main(String[] args) {

        System.out.println("CalculatorExecute");

        Calculator c = new Calculator();
        int addition = c.addition(2, 4);
        System.out.println("c.addition(2, 4) = " + addition);

        int subtraction = c.subtraction(4, 2);
        System.out.println("c.subtraction(4, 2) = " + subtraction);

        System.out.println("This is a change");

    }
}
