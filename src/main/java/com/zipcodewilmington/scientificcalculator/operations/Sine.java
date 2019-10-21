package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Sine {
    public Double sine(double value) {
        if (value < 0) {
            return Math.sin(-value);
        } else {
            return Math.sin(value);
        }
    }

    public void display(Double value) {
        Console.println("sin(" + value + ") = " + sine(value));
    }
}
