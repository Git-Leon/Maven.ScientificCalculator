package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Tangent {
    public Double tangent(double value) {
        if (value < 0) {
            return Math.tan(-value);
        } else {
            return Math.tan(value);
        }
    }

    public void display(Double value) {
        Console.println("tan(" + value + ") = " + tangent(value));
    }
}