package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Cosine {
    public Double cosine(double value) {
        if (value < 0) {
            return Math.cos(-value);
        } else {
            return Math.cos(value);
        }
    }

    public void display(Double value) {
        Console.println("cos(" + value + ") = " + cosine(value));
    }
}
