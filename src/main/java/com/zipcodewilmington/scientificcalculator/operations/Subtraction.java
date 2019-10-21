package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Subtraction {

    public Subtraction() {
    }

    public Double subtract(double value1, double value2) {
        return value1 - value2;
    }

    public void display(Double value1, Double value2) {
        Console.println(value1 + " - " + value2 + " = " + subtract(value1, value2));
    }
}


