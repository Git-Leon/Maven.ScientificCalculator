package com.zipcodewilmington.scientificcalculator.operators.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Invert {
    public Double invert(double value1) {
        return value1 * -1;
    }


    public void display(Double value) {
        Console.println(value + " inverted = " + invert(value));
    }
}