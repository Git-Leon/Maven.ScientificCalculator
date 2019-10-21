package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class Squared{
    public Double squared(double value1) {
        return value1 * value1;
    }


    public void display(Double value) {
        Console.println(value + " ^2 = " + squared(value));
    }
}
